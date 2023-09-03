package com.avsemprize.ebay.services;

import com.avsemprize.ebay.callers.EbayBrowserApiCaller;
import com.avsemprize.ebay.callers.EbayTokenCaller;
import com.avsemprize.ebay.config.EbayConfig;
import com.avsemprize.ebay.models.token.EbayToken;

public class EbayService {


    public static final String BASE_URL = "https://api.ebay.com/";
    public static final String BASE_SANDBOX_URL = "https://api.sandbox.ebay.com/";
    private final String baseUrl;
    private final EbayConfig config;
    public EbayService(EbayConfig config, String baseUrl){

        this.baseUrl = baseUrl;
        this.config = config;
    }
    public EbayBrowserApiCaller getEbayBrowserCaller(EbayToken token){
        return new EbayBrowserApiCaller(token, baseUrl);
    }
    public EbayTokenCaller getEbayTokenCaller(String scopes){
        return new EbayTokenCaller(config, baseUrl, scopes);
    }
}
