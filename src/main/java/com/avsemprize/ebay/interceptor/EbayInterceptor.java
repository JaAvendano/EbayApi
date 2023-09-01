package com.avsemprize.ebay.interceptor;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class EbayInterceptor implements Interceptor {
    private String token;

    public EbayInterceptor(String token){
        this.token = token;
    }
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        Request authenticatedRequest =request.newBuilder()
                .header("Authorization","Bearer " + token).build();
        return chain.proceed(authenticatedRequest);
    }
}
