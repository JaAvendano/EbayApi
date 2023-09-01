package com.avsemprize.ebay.services;

import com.avsemprize.ebay.models.browse.itemsummarysearch.BrowseItemSummarySearch;
import com.avsemprize.ebay.models.catalog.EbayProductSearchSummary;
import com.avsemprize.ebay.models.token.EbayToken;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.Map;

public interface EbayCatalogAPI {
    /**
     *
     * @param query
     * @param gtin
     * @param charityIds
     * @param fieldgroups
     * @param compatibilityFilter
     * @param autoCorrect
     * @param categoryIds
     * @param filter
     * @param sort
     * @param limit
     * @param offset
     * @param aspectFilter
     * @param epid
     * @return
     */
    @GET("buy/browse/v1/item_summary/search")
    @Headers({"X-EBAY-C-MARKETPLACE-ID: EBAY_US"})
    Call<BrowseItemSummarySearch> searchProducts(
            @Query("q") String query,
            @Query("gtin") String gtin,
            @Query("charity_ids") String charityIds,
            @Query("fieldgroups") String fieldgroups,
            @Query("compatibility_filter") Map<String, Object> compatibilityFilter,
            @Query("auto_correct") String autoCorrect,
            @Query("category_ids") String categoryIds,
            @Query("filter") Map<String, Object> filter,
            @Query("sort") Map<String, Object> sort,
            @Query("limit") String limit,
            @Query("offset") String offset,
            @Query("aspect_filter") Map<String, Object> aspectFilter,
            @Query("epid") String epid
    );
}
