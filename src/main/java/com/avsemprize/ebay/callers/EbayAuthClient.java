package com.avsemprize.ebay.callers;

import okhttp3.*;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class EbayAuthClient {

    private static final String CLIENT_ID = "your_client_id";
    private static final String CLIENT_SECRET = "your_client_secret";
    private static final String REDIRECT_URI = "your_redirect_uri";
    private static final String AUTH_URL = "https://auth.ebay.com/oauth2/authorize";
    private static final String TOKEN_URL = "https://api.ebay.com/identity/v1/oauth2/token";

    /*
    private OkHttpClient client;
    private EbayAuthApi authApi;

    public EbayAuthClient() {
        client = new OkHttpClient();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(TOKEN_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        authApi = retrofit.create(EbayAuthApi.class);
    }

    public String getAuthorizationUrl() {
        return AUTH_URL + "?client_id=" + CLIENT_ID + "&redirect_uri=" + REDIRECT_URI +
                "&response_type=code&scope=https://api.ebay.com/oauth/api_scope";
    }

    public String requestAccessToken(String code) throws IOException {
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        String requestBody = "grant_type=authorization_code&code=" + code +
                "&redirect_uri=" + REDIRECT_URI;
        RequestBody body = RequestBody.create(mediaType, requestBody);

        Request request = new Request.Builder()
                .url(TOKEN_URL)
                .addHeader("Authorization", "Basic " + Base64.getEncoder()
                        .encodeToString((CLIENT_ID + ":" + CLIENT_SECRET).getBytes()))
                .post(body)
                .build();

        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            String responseBody = response.body().string();
            // Parse the JSON response to get the access token
            // The access token will be in the 'access_token' field of the JSON response
            return responseBody;
        } else {
            // Handle error
            return null;
        }
    }

     */
}
