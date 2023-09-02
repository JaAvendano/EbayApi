package com.avsemprize.ebay.callers;

import com.avsemprize.ebay.config.EbayConfig;
import com.avsemprize.ebay.interceptor.EbayTokenInterceptor;
import com.avsemprize.ebay.models.token.EbayToken;
import com.avsemprize.ebay.services.EbayTokenAPI;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class TokenCaller {

    private OkHttpClient client;
    private final String clientId, clientSecret;
    private static final String BASE_URL = "https://api.sandbox.ebay.com/";
    private EbayTokenAPI ebayTokenAPI;

    public TokenCaller(EbayConfig config, String scopes){
        this.clientId = config.getClientId();
        this.clientSecret = config.getClientSecret();
        this.client = new OkHttpClient.Builder()
                .addInterceptor(new EbayTokenInterceptor(clientId, clientSecret, scopes))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        ebayTokenAPI = retrofit.create(EbayTokenAPI.class);
    }

    public Call<EbayToken> callGetToken(){
        return ebayTokenAPI.getCatalogAuth();
    }
    public EbayToken getToken(){
        try {
            return ebayTokenAPI.getCatalogAuth().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public okhttp3.Call callGetTokenTest(String scopes){

        String credentials = clientId + ":" + clientSecret;

        String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());

        String encodedScope = encodeValue(scopes);

        String requestBodyString = "grant_type=client_credentials&scope=" + encodedScope;

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, requestBodyString);
        Request.Builder requestBuilder = new Request.Builder();
        String url = "https://api.sandbox.ebay.com/identity/v1/oauth2/token";
        requestBuilder
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("Authorization", "Basic " + encodedCredentials)
                .url(url)
                .post(body);

        return client.newCall(requestBuilder.build());
    }


    private String encodeValue(String value){
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
