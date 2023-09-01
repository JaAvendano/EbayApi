package com.avsemprize.ebay.interceptor;

import okhttp3.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EbayTokenInterceptor implements Interceptor {
    private String encodedCredentials;
    private String scopes;
    public EbayTokenInterceptor(String clientId, String clientSecret, String scopes){
        String credentials = clientId + ":" + clientSecret;
        encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());
        this.scopes = scopes;
    }
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        String encodedScope = encodeValue(scopes);

        String requestBodyString = "grant_type=client_credentials&scope=" + encodedScope;

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, requestBodyString);

        Request authenticatedRequest = request.newBuilder()
                .header("Authorization","Basic " + encodedCredentials)
                .post(body)
                .build();
        return chain.proceed(authenticatedRequest);
    }

    private String encodeValue(String value){
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
