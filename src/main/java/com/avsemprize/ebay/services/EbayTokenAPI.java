package com.avsemprize.ebay.services;

import com.avsemprize.ebay.models.token.EbayToken;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface EbayTokenAPI {

    @POST("identity/v1/oauth2/token")
    @Headers({"Content-Type: application/x-www-form-urlencoded"})
    Call<EbayToken> getCatalogAuth();
}
