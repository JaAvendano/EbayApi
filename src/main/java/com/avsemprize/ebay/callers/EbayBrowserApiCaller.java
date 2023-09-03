package com.avsemprize.ebay.callers;

import com.avsemprize.ebay.interceptor.EbayInterceptor;
import com.avsemprize.ebay.models.browse.itemsummarysearch.BrowseItemSummarySearch;
import com.avsemprize.ebay.models.token.EbayToken;
import com.avsemprize.ebay.services.EbayCatalogAPI;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Map;

public class EbayBrowserApiCaller {
    public static final String VIEW_PUBLIC_DATA_SCOPE = "https://api.ebay.com/oauth/api_scope";
    public static final String BASE_URL = "https://api.ebay.com/";
    public static final String BASE_SANDBOX_URL = "https://api.sandbox.ebay.com/";

    private EbayCatalogAPI catalogAPI;

    public EbayBrowserApiCaller(EbayToken token, String baseUrl){
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new EbayInterceptor(token.getAccess_token()))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        catalogAPI = retrofit.create(EbayCatalogAPI.class);
    }

    /**
     *
     * @param query A string consisting of one or more keywords that are used to search for items on eBay. The keywords are handled as follows:
     * If the keywords are separated by a space, it is treated as an AND. In the following example, the query returns items that have iphone AND ipad.
     *
     * /buy/browse/v1/item_summary/search?q=iphone ipad
     *
     * If the keywords are input using parentheses and separated by a comma, or if they are URL-encoded, it is treated as an OR. In the following examples, the query returns items that have iphone OR ipad.
     *
     * /buy/browse/v1/item_summary/search?q=(iphone, ipad)
     *
     * /buy/browse/v1/item_summary/search?q=%28iphone%2c%20ipad%29
     *
     * Restriction: The * wildcard character is not allowed in this field.
     *
     * Required: The method must have category_ids, epid, gtin, or q (or any combination of these).
     * Occurrence: Optional
     *
     * @param gtin This field lets you search by the Global Trade Item Number of the item as defined by https://www.gtin.info. You can search only by UPC (Universal Product Code). If you have other formats of GTIN, you need to search by keyword.
     *
     * For example:
     * /buy/browse/v1/item_summary/search?gtin=099482432621
     *
     * Maximum: 1
     *
     * Required: The method must have category_ids, epid, gtin, or q (or any combination of these)
     * Occurrence: Optional
     *
     * @param charityIds The charity ID is used to limit the results to only items associated with the specified charity. This field can have one charity ID or a comma separated list of IDs. The method will return all the items associated with the specified charities.
     *
     * For example:
     * /buy/browse/v1/item_summary/search?charity_ids=13-1788491,300108469
     *
     * The charity ID is the charity's registration ID, also known as the Employer Identification Number (EIN). In GB, it is the Charity Registration Number (CRN), commonly called "Charity Number".
     * To find the charities eBay supports, you can search for a charity at Charity Search or go to Charity Shop.
     * To find the charity ID of a specific charity, click on a charity and use the EIN number. For example, the charity ID for American Red Cross, is 530196605.
     * You can also use any combination of the category_Ids and q fields with a charity_Ids to filter the result set. This gives you additional control over the result set.
     *
     * Restriction: This is supported only on the US and GB marketplaces.
     *
     * Maximum: 20 IDs
     *
     * Required: One ID
     * Occurrence: Optional
     *
     * @param fieldGroups This field is a comma separated list of values that lets you control what is returned in the response. The default is MATCHING_ITEMS, which returns the items that match the keyword or category specified. The other values return data that can be used to create histograms or provide additional information.
     *
     * Valid Values:
     * ASPECT_REFINEMENTS - This returns the aspectDistributions container, which has the dominantCategoryId, matchCount, and refinementHref for the various aspects of the items found. For example, if you searched for 'Mustang', some of the aspect would be Model Year, Exterior Color, Vehicle Mileage, etc.
     *
     * Note: ASPECT_REFINEMENTS are category specific.
     * BUYING_OPTION_REFINEMENTS - This returns the buyingOptionDistributions container, which has the matchCount and refinementHref for AUCTION, FIXED_PRICE (Buy It Now), and CLASSIFIED_AD items.
     * CATEGORY_REFINEMENTS - This returns the categoryDistributions container, which has the categories that the item is in.
     * CONDITION_REFINEMENTS - This returns the conditionDistributions container, such as NEW, USED, etc. Within these groups are multiple states of the condition. For example, New can be New without tag, New in box, New without box, etc.
     * EXTENDED - This returns the shortDescription field, which provides condition and item aspect information and the itemLocation.city field.
     * MATCHING_ITEMS - This is meant to be used with one or more of the refinement values above. You use this to return the specified refinements and all the matching items.
     * FULL - This returns all the refinement containers and all the matching items.
     * Code so that your app gracefully handles any future changes to this list.
     *
     * Default: MATCHING_ITEMS
     * Occurrence: Optional
     *
     * @param compatibilityFilter This field specifies the attributes used to define a specific product. The service searches for items matching the keyword or matching the keyword and a product attribute value in the title of the item.
     *
     * Note: The only products supported are cars, trucks, and motorcycles.
     *
     * For example, if the keyword is brakes and compatibility-filter=Year:2018;Make:BMW, the items returned are items with brakes, 2018, or BMW in the title.
     *
     * The service uses the product attributes to determine whether the item is compatible. The service returns the attributes that are compatible and the CompatibilityMatchEnum value that indicates how well the item matches the attributes.
     *
     * Tip: See the Samples section for a detailed example.
     *
     * Best Practice: Submit all of the product attributes for the specific product.
     *
     * To find the attributes and values for a specific marketplace, you can use the getCompatibilityProperties method in the Taxonomy API.
     *
     * For more details, see Check compatibility in the Buy Integration Guide.
     *
     * Note: Testing in Sandbox is only supported using mock data. See Testing search in the Sandbox for details.
     *
     * Required:
     * q (keyword)
     * One fitment supported category ID (such as 33559 Brakes)
     * At least one product attribute name/value pair
     * Occurrence: Optional
     *
     * @param autoCorrect A query parameter that enables auto correction.
     *
     * Valid Values: KEYWORD
     * Occurrence: Optional
     *
     * @param categoryIds The category ID is used to limit the results. This field can have one category ID or a comma separated list of IDs.
     *
     * For example:
     * /buy/browse/v1/item_summary/search?category_ids=29792
     *
     * Note: Currently, you can pass in only one category ID per request.
     *
     *
     * You can also use any combination of the category_Ids, epid, and q fields. This gives you additional control over the result set.
     *
     * For example, let's say you are looking of a toy phone. If you search for "phone", the result set will be mobile phones because this is the "Best Match" for this search. But if you also include the toy category ID, the results will be what you wanted.
     *
     * For example:
     * /buy/browse/v1/item_summary/search?q=phone&category_ids=220
     *
     * The list of eBay category IDs is not published and category IDs are not the same across all the eBay marketplaces. You can use the following techniques to find a category by site:
     * Use the Category Changes page.
     * Use the Taxonomy API. For details see Get Categories for Buy APIs.
     * Submit the following method to get the dominantCategoryId for an item.
     *
     * /buy/browse/v1/item_summary/search?q= keyword&fieldgroups=ASPECT_REFINEMENTS
     * Note: If a top-level (L1) category is specified, you must also include the q query parameter.
     *
     *
     * Required: The method must have category_ids, epid, gtin, or q (or any combination of these)
     * Occurrence: Optional
     *
     * @param filter An array of field filters that can be used to limit/customize the result set.
     *
     * For example:
     * /buy/browse/v1/item_summary/search?q=shirt&filter=price:[10..50]
     *
     * You can also combine filters.
     * /buy/browse/v1/item_summary/search?q=shirt&filter=price:[10..50],sellers:{rpseller|bigSal}
     *
     * Note: Refer to Buy API Field Filters for details and examples of all supported filters.
     * Occurrence: Optional
     *
     * @param sort The order and field name that is used to sort the items.
     *
     * You can sort items by price, distance, or listing date. To sort in descending order, insert a hyphen (-) before the name of the sorting option. If no sort parameter is submitted, the result set is sorted by "Best Match".
     *
     * Here are some examples showing how to use the sort query parameter:
     * sort=distance - This sorts by distance in ascending order (shortest distance first). This sorting option is only applicable if the pickup filters are used, and only ascending order is supported.
     * sort=-price - This sorts by price + shipping cost in descending order (highest price first). This sorting option (by price) is only guaranteed to work correctly if the X-EBAY-C-ENDUSERCTX request header is used, with the contextualLocation parameter being used to set the delivery country and postal code. Here is an example of how this header would be used to do this (note the URL encoding):
     *
     * X-EBAY-C-ENDUSERCTX: contextualLocation=country%3DUS%2Czip%3D19406
     * sort=newlyListed - This sorts by listing date (most recently listed/newest items first).
     * sort=endingSoonest - This sorts by date/time the listing ends (listings nearest to end date/time first).
     * Default: Ascending
     * Occurrence: Optional
     *
     * @param limit The number of items from the result set returned in a single page.
     *
     * Note: If a value is set in the limit field, the value of offset must be either zero or a multiple of the limit value. An error is returned for invalid values of offset.
     *
     * Note: This method can return a maximum of 10,000 items in one results set.
     *
     * Min: 1
     * Max: 200
     * Default: 50
     * Occurrence: Optional
     *
     * @param offset Specifies the number of items to skip in the result set. This is used with the limit field to control the pagination of the output.
     *
     * For example, if offset is 0 and limit is 10, the method will retrieve items 1-10 from the list of items returned; if offset is 10 and limit is 10, the method will retrieve items 11-20 from the list of items returned.
     *
     * Note: The value of offset must be either zero or a multiple of the value set in the limit field. An error is returned for invalid values of offset.
     *
     * Note: This method can return a maximum of 10,000 items in one results set.
     *
     * Min: 0
     * Max: 9,999
     * Default: 0
     * Occurrence: Optional
     *
     * @param aspectFilter This field lets you filter by item aspects. The aspect name/value pairs and category, which is required, is used to limit the results to specific aspects of the item. For example, in a clothing category one aspect pair would be Color/Red.
     *
     * For example, the method below uses the category ID for Women's Clothing. This will return only items for a woman's red shirt.
     *
     * /buy/browse/v1/item_summary/search?q=shirt&category_ids=15724&aspect_filter=categoryId:15724,Color:{Red}
     *
     * To get a list of the aspect pairs and the category, which is returned in the dominantCategoryId field, set fieldgroups to ASPECT_REFINEMENTS.
     *
     * /buy/browse/v1/item_summary/search?q=shirt&fieldgroups=ASPECT_REFINEMENTS
     *
     * Note: The pipe symbol is used as a delimiter between aspect filter values. If a value contains a pipe symbol (for example, the brand name 'Bed|Stü'), you must enter a backslash before the pipe character to prevent it from being evaluated as a delimiter.
     *
     * The following example shows the correct format for entering two brand names as aspect filter values, one of which contains a pipe symbol:
     *
     * /buy/browse/v1/item_summary/search?limit=50&category_ids=3034&filter=buyingOptions:{AUCTION|FIXED_PRICE}&aspect_filter=categoryId:3034,Brand:{Bed\|Stü|Nike}
     *
     *
     * Required: The category ID is required twice; once as a URI parameter and as part of the aspect_filter.
     * Occurrence: Optional
     *
     * @param epid The ePID is the eBay product identifier of a product from the eBay product catalog. This field limits the results to only items in the specified ePID.
     *
     * The Marketing API getMerchandisedProducts method and the Browse API getItem, getItemByLegacyId, and getItemsByItemGroup calls return the ePID of the product. You can also use the product_summary/search method in the Catalog API to search for the ePID of the product.
     *
     * For example:
     * /buy/browse/v1/item_summary/search?epid=15032
     *
     * Maximum: 1
     *
     * Required: The method must have category_ids, epid, gtin, or q (or any combination of these)
     * Occurrence: Optional
     *
     * @return
     */
    public Call<BrowseItemSummarySearch> searchProducts(String query, String gtin, String charityIds,
                                                        String fieldGroups, Map<String, Object> compatibilityFilter,
                                                        String autoCorrect, String categoryIds, Map<String, Object> filter,
                                                        Map<String, Object> sort, String limit, String offset, Map<String, Object> aspectFilter,
                                                        String epid) {

            return catalogAPI.searchProducts(query, gtin, charityIds, fieldGroups, compatibilityFilter, autoCorrect, categoryIds, filter, sort, limit, offset, aspectFilter, epid);
    }
    /*
    public Call makeCallWithToken(String accessToken){
        return makeBaseCall(accessToken,"https://api.ebay.com/buy/browse/v1/item_summary/search");
    }
    public Call generateToken(){
        return getToken("");
    }

     */
}
