
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemSummary {

    @SerializedName("additionalImages")
    @Expose
    private List<AdditionalImage> additionalImages = new ArrayList<AdditionalImage>();
    @SerializedName("adultOnly")
    @Expose
    private String adultOnly;
    @SerializedName("availableCoupons")
    @Expose
    private String availableCoupons;
    @SerializedName("bidCount")
    @Expose
    private String bidCount;
    @SerializedName("buyingOptions")
    @Expose
    private List<String> buyingOptions = new ArrayList<String>();
    @SerializedName("categories")
    @Expose
    private List<Category> categories = new ArrayList<Category>();
    @SerializedName("compatibilityMatch")
    @Expose
    private String compatibilityMatch;
    @SerializedName("compatibilityProperties")
    @Expose
    private List<CompatibilityProperty> compatibilityProperties = new ArrayList<CompatibilityProperty>();
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("conditionId")
    @Expose
    private String conditionId;
    @SerializedName("currentBidPrice")
    @Expose
    private CurrentBidPrice currentBidPrice;
    @SerializedName("distanceFromPickupLocation")
    @Expose
    private DistanceFromPickupLocation distanceFromPickupLocation;
    @SerializedName("energyEfficiencyClass")
    @Expose
    private String energyEfficiencyClass;
    @SerializedName("epid")
    @Expose
    private String epid;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("itemAffiliateWebUrl")
    @Expose
    private String itemAffiliateWebUrl;
    @SerializedName("itemCreationDate")
    @Expose
    private String itemCreationDate;
    @SerializedName("itemEndDate")
    @Expose
    private String itemEndDate;
    @SerializedName("itemGroupHref")
    @Expose
    private String itemGroupHref;
    @SerializedName("itemGroupType")
    @Expose
    private String itemGroupType;
    @SerializedName("itemHref")
    @Expose
    private String itemHref;
    @SerializedName("itemId")
    @Expose
    private String itemId;
    @SerializedName("itemLocation")
    @Expose
    private ItemLocation itemLocation;
    @SerializedName("itemWebUrl")
    @Expose
    private String itemWebUrl;
    @SerializedName("leafCategoryIds")
    @Expose
    private List<String> leafCategoryIds = new ArrayList<String>();
    @SerializedName("legacyItemId")
    @Expose
    private String legacyItemId;
    @SerializedName("listingMarketplaceId")
    @Expose
    private String listingMarketplaceId;
    @SerializedName("marketingPrice")
    @Expose
    private MarketingPrice marketingPrice;
    @SerializedName("pickupOptions")
    @Expose
    private List<PickupOption> pickupOptions = new ArrayList<PickupOption>();
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("priceDisplayCondition")
    @Expose
    private String priceDisplayCondition;
    @SerializedName("priorityListing")
    @Expose
    private String priorityListing;
    @SerializedName("qualifiedPrograms")
    @Expose
    private List<String> qualifiedPrograms = new ArrayList<String>();
    @SerializedName("seller")
    @Expose
    private Seller seller;
    @SerializedName("shippingOptions")
    @Expose
    private List<ShippingOption> shippingOptions = new ArrayList<ShippingOption>();
    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("thumbnailImages")
    @Expose
    private List<ThumbnailImage> thumbnailImages = new ArrayList<ThumbnailImage>();
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("topRatedBuyingExperience")
    @Expose
    private String topRatedBuyingExperience;
    @SerializedName("tyreLabelImageUrl")
    @Expose
    private String tyreLabelImageUrl;
    @SerializedName("unitPrice")
    @Expose
    private UnitPrice unitPrice;
    @SerializedName("unitPricingMeasure")
    @Expose
    private String unitPricingMeasure;
    @SerializedName("watchCount")
    @Expose
    private String watchCount;

    public List<AdditionalImage> getAdditionalImages() {
        return additionalImages;
    }

    public void setAdditionalImages(List<AdditionalImage> additionalImages) {
        this.additionalImages = additionalImages;
    }

    public ItemSummary withAdditionalImages(List<AdditionalImage> additionalImages) {
        this.additionalImages = additionalImages;
        return this;
    }

    public String getAdultOnly() {
        return adultOnly;
    }

    public void setAdultOnly(String adultOnly) {
        this.adultOnly = adultOnly;
    }

    public ItemSummary withAdultOnly(String adultOnly) {
        this.adultOnly = adultOnly;
        return this;
    }

    public String getAvailableCoupons() {
        return availableCoupons;
    }

    public void setAvailableCoupons(String availableCoupons) {
        this.availableCoupons = availableCoupons;
    }

    public ItemSummary withAvailableCoupons(String availableCoupons) {
        this.availableCoupons = availableCoupons;
        return this;
    }

    public String getBidCount() {
        return bidCount;
    }

    public void setBidCount(String bidCount) {
        this.bidCount = bidCount;
    }

    public ItemSummary withBidCount(String bidCount) {
        this.bidCount = bidCount;
        return this;
    }

    public List<String> getBuyingOptions() {
        return buyingOptions;
    }

    public void setBuyingOptions(List<String> buyingOptions) {
        this.buyingOptions = buyingOptions;
    }

    public ItemSummary withBuyingOptions(List<String> buyingOptions) {
        this.buyingOptions = buyingOptions;
        return this;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public ItemSummary withCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public String getCompatibilityMatch() {
        return compatibilityMatch;
    }

    public void setCompatibilityMatch(String compatibilityMatch) {
        this.compatibilityMatch = compatibilityMatch;
    }

    public ItemSummary withCompatibilityMatch(String compatibilityMatch) {
        this.compatibilityMatch = compatibilityMatch;
        return this;
    }

    public List<CompatibilityProperty> getCompatibilityProperties() {
        return compatibilityProperties;
    }

    public void setCompatibilityProperties(List<CompatibilityProperty> compatibilityProperties) {
        this.compatibilityProperties = compatibilityProperties;
    }

    public ItemSummary withCompatibilityProperties(List<CompatibilityProperty> compatibilityProperties) {
        this.compatibilityProperties = compatibilityProperties;
        return this;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public ItemSummary withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public String getConditionId() {
        return conditionId;
    }

    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    public ItemSummary withConditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    public CurrentBidPrice getCurrentBidPrice() {
        return currentBidPrice;
    }

    public void setCurrentBidPrice(CurrentBidPrice currentBidPrice) {
        this.currentBidPrice = currentBidPrice;
    }

    public ItemSummary withCurrentBidPrice(CurrentBidPrice currentBidPrice) {
        this.currentBidPrice = currentBidPrice;
        return this;
    }

    public DistanceFromPickupLocation getDistanceFromPickupLocation() {
        return distanceFromPickupLocation;
    }

    public void setDistanceFromPickupLocation(DistanceFromPickupLocation distanceFromPickupLocation) {
        this.distanceFromPickupLocation = distanceFromPickupLocation;
    }

    public ItemSummary withDistanceFromPickupLocation(DistanceFromPickupLocation distanceFromPickupLocation) {
        this.distanceFromPickupLocation = distanceFromPickupLocation;
        return this;
    }

    public String getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }

    public void setEnergyEfficiencyClass(String energyEfficiencyClass) {
        this.energyEfficiencyClass = energyEfficiencyClass;
    }

    public ItemSummary withEnergyEfficiencyClass(String energyEfficiencyClass) {
        this.energyEfficiencyClass = energyEfficiencyClass;
        return this;
    }

    public String getEpid() {
        return epid;
    }

    public void setEpid(String epid) {
        this.epid = epid;
    }

    public ItemSummary withEpid(String epid) {
        this.epid = epid;
        return this;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ItemSummary withImage(Image image) {
        this.image = image;
        return this;
    }

    public String getItemAffiliateWebUrl() {
        return itemAffiliateWebUrl;
    }

    public void setItemAffiliateWebUrl(String itemAffiliateWebUrl) {
        this.itemAffiliateWebUrl = itemAffiliateWebUrl;
    }

    public ItemSummary withItemAffiliateWebUrl(String itemAffiliateWebUrl) {
        this.itemAffiliateWebUrl = itemAffiliateWebUrl;
        return this;
    }

    public String getItemCreationDate() {
        return itemCreationDate;
    }

    public void setItemCreationDate(String itemCreationDate) {
        this.itemCreationDate = itemCreationDate;
    }

    public ItemSummary withItemCreationDate(String itemCreationDate) {
        this.itemCreationDate = itemCreationDate;
        return this;
    }

    public String getItemEndDate() {
        return itemEndDate;
    }

    public void setItemEndDate(String itemEndDate) {
        this.itemEndDate = itemEndDate;
    }

    public ItemSummary withItemEndDate(String itemEndDate) {
        this.itemEndDate = itemEndDate;
        return this;
    }

    public String getItemGroupHref() {
        return itemGroupHref;
    }

    public void setItemGroupHref(String itemGroupHref) {
        this.itemGroupHref = itemGroupHref;
    }

    public ItemSummary withItemGroupHref(String itemGroupHref) {
        this.itemGroupHref = itemGroupHref;
        return this;
    }

    public String getItemGroupType() {
        return itemGroupType;
    }

    public void setItemGroupType(String itemGroupType) {
        this.itemGroupType = itemGroupType;
    }

    public ItemSummary withItemGroupType(String itemGroupType) {
        this.itemGroupType = itemGroupType;
        return this;
    }

    public String getItemHref() {
        return itemHref;
    }

    public void setItemHref(String itemHref) {
        this.itemHref = itemHref;
    }

    public ItemSummary withItemHref(String itemHref) {
        this.itemHref = itemHref;
        return this;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public ItemSummary withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public ItemLocation getItemLocation() {
        return itemLocation;
    }

    public void setItemLocation(ItemLocation itemLocation) {
        this.itemLocation = itemLocation;
    }

    public ItemSummary withItemLocation(ItemLocation itemLocation) {
        this.itemLocation = itemLocation;
        return this;
    }

    public String getItemWebUrl() {
        return itemWebUrl;
    }

    public void setItemWebUrl(String itemWebUrl) {
        this.itemWebUrl = itemWebUrl;
    }

    public ItemSummary withItemWebUrl(String itemWebUrl) {
        this.itemWebUrl = itemWebUrl;
        return this;
    }

    public List<String> getLeafCategoryIds() {
        return leafCategoryIds;
    }

    public void setLeafCategoryIds(List<String> leafCategoryIds) {
        this.leafCategoryIds = leafCategoryIds;
    }

    public ItemSummary withLeafCategoryIds(List<String> leafCategoryIds) {
        this.leafCategoryIds = leafCategoryIds;
        return this;
    }

    public String getLegacyItemId() {
        return legacyItemId;
    }

    public void setLegacyItemId(String legacyItemId) {
        this.legacyItemId = legacyItemId;
    }

    public ItemSummary withLegacyItemId(String legacyItemId) {
        this.legacyItemId = legacyItemId;
        return this;
    }

    public String getListingMarketplaceId() {
        return listingMarketplaceId;
    }

    public void setListingMarketplaceId(String listingMarketplaceId) {
        this.listingMarketplaceId = listingMarketplaceId;
    }

    public ItemSummary withListingMarketplaceId(String listingMarketplaceId) {
        this.listingMarketplaceId = listingMarketplaceId;
        return this;
    }

    public MarketingPrice getMarketingPrice() {
        return marketingPrice;
    }

    public void setMarketingPrice(MarketingPrice marketingPrice) {
        this.marketingPrice = marketingPrice;
    }

    public ItemSummary withMarketingPrice(MarketingPrice marketingPrice) {
        this.marketingPrice = marketingPrice;
        return this;
    }

    public List<PickupOption> getPickupOptions() {
        return pickupOptions;
    }

    public void setPickupOptions(List<PickupOption> pickupOptions) {
        this.pickupOptions = pickupOptions;
    }

    public ItemSummary withPickupOptions(List<PickupOption> pickupOptions) {
        this.pickupOptions = pickupOptions;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public ItemSummary withPrice(Price price) {
        this.price = price;
        return this;
    }

    public String getPriceDisplayCondition() {
        return priceDisplayCondition;
    }

    public void setPriceDisplayCondition(String priceDisplayCondition) {
        this.priceDisplayCondition = priceDisplayCondition;
    }

    public ItemSummary withPriceDisplayCondition(String priceDisplayCondition) {
        this.priceDisplayCondition = priceDisplayCondition;
        return this;
    }

    public String getPriorityListing() {
        return priorityListing;
    }

    public void setPriorityListing(String priorityListing) {
        this.priorityListing = priorityListing;
    }

    public ItemSummary withPriorityListing(String priorityListing) {
        this.priorityListing = priorityListing;
        return this;
    }

    public List<String> getQualifiedPrograms() {
        return qualifiedPrograms;
    }

    public void setQualifiedPrograms(List<String> qualifiedPrograms) {
        this.qualifiedPrograms = qualifiedPrograms;
    }

    public ItemSummary withQualifiedPrograms(List<String> qualifiedPrograms) {
        this.qualifiedPrograms = qualifiedPrograms;
        return this;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public ItemSummary withSeller(Seller seller) {
        this.seller = seller;
        return this;
    }

    public List<ShippingOption> getShippingOptions() {
        return shippingOptions;
    }

    public void setShippingOptions(List<ShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
    }

    public ItemSummary withShippingOptions(List<ShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public ItemSummary withShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public List<ThumbnailImage> getThumbnailImages() {
        return thumbnailImages;
    }

    public void setThumbnailImages(List<ThumbnailImage> thumbnailImages) {
        this.thumbnailImages = thumbnailImages;
    }

    public ItemSummary withThumbnailImages(List<ThumbnailImage> thumbnailImages) {
        this.thumbnailImages = thumbnailImages;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ItemSummary withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTopRatedBuyingExperience() {
        return topRatedBuyingExperience;
    }

    public void setTopRatedBuyingExperience(String topRatedBuyingExperience) {
        this.topRatedBuyingExperience = topRatedBuyingExperience;
    }

    public ItemSummary withTopRatedBuyingExperience(String topRatedBuyingExperience) {
        this.topRatedBuyingExperience = topRatedBuyingExperience;
        return this;
    }

    public String getTyreLabelImageUrl() {
        return tyreLabelImageUrl;
    }

    public void setTyreLabelImageUrl(String tyreLabelImageUrl) {
        this.tyreLabelImageUrl = tyreLabelImageUrl;
    }

    public ItemSummary withTyreLabelImageUrl(String tyreLabelImageUrl) {
        this.tyreLabelImageUrl = tyreLabelImageUrl;
        return this;
    }

    public UnitPrice getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(UnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ItemSummary withUnitPrice(UnitPrice unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public String getUnitPricingMeasure() {
        return unitPricingMeasure;
    }

    public void setUnitPricingMeasure(String unitPricingMeasure) {
        this.unitPricingMeasure = unitPricingMeasure;
    }

    public ItemSummary withUnitPricingMeasure(String unitPricingMeasure) {
        this.unitPricingMeasure = unitPricingMeasure;
        return this;
    }

    public String getWatchCount() {
        return watchCount;
    }

    public void setWatchCount(String watchCount) {
        this.watchCount = watchCount;
    }

    public ItemSummary withWatchCount(String watchCount) {
        this.watchCount = watchCount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ItemSummary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("additionalImages");
        sb.append('=');
        sb.append(((this.additionalImages == null)?"<null>":this.additionalImages));
        sb.append(',');
        sb.append("adultOnly");
        sb.append('=');
        sb.append(((this.adultOnly == null)?"<null>":this.adultOnly));
        sb.append(',');
        sb.append("availableCoupons");
        sb.append('=');
        sb.append(((this.availableCoupons == null)?"<null>":this.availableCoupons));
        sb.append(',');
        sb.append("bidCount");
        sb.append('=');
        sb.append(((this.bidCount == null)?"<null>":this.bidCount));
        sb.append(',');
        sb.append("buyingOptions");
        sb.append('=');
        sb.append(((this.buyingOptions == null)?"<null>":this.buyingOptions));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
        sb.append(',');
        sb.append("compatibilityMatch");
        sb.append('=');
        sb.append(((this.compatibilityMatch == null)?"<null>":this.compatibilityMatch));
        sb.append(',');
        sb.append("compatibilityProperties");
        sb.append('=');
        sb.append(((this.compatibilityProperties == null)?"<null>":this.compatibilityProperties));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("conditionId");
        sb.append('=');
        sb.append(((this.conditionId == null)?"<null>":this.conditionId));
        sb.append(',');
        sb.append("currentBidPrice");
        sb.append('=');
        sb.append(((this.currentBidPrice == null)?"<null>":this.currentBidPrice));
        sb.append(',');
        sb.append("distanceFromPickupLocation");
        sb.append('=');
        sb.append(((this.distanceFromPickupLocation == null)?"<null>":this.distanceFromPickupLocation));
        sb.append(',');
        sb.append("energyEfficiencyClass");
        sb.append('=');
        sb.append(((this.energyEfficiencyClass == null)?"<null>":this.energyEfficiencyClass));
        sb.append(',');
        sb.append("epid");
        sb.append('=');
        sb.append(((this.epid == null)?"<null>":this.epid));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("itemAffiliateWebUrl");
        sb.append('=');
        sb.append(((this.itemAffiliateWebUrl == null)?"<null>":this.itemAffiliateWebUrl));
        sb.append(',');
        sb.append("itemCreationDate");
        sb.append('=');
        sb.append(((this.itemCreationDate == null)?"<null>":this.itemCreationDate));
        sb.append(',');
        sb.append("itemEndDate");
        sb.append('=');
        sb.append(((this.itemEndDate == null)?"<null>":this.itemEndDate));
        sb.append(',');
        sb.append("itemGroupHref");
        sb.append('=');
        sb.append(((this.itemGroupHref == null)?"<null>":this.itemGroupHref));
        sb.append(',');
        sb.append("itemGroupType");
        sb.append('=');
        sb.append(((this.itemGroupType == null)?"<null>":this.itemGroupType));
        sb.append(',');
        sb.append("itemHref");
        sb.append('=');
        sb.append(((this.itemHref == null)?"<null>":this.itemHref));
        sb.append(',');
        sb.append("itemId");
        sb.append('=');
        sb.append(((this.itemId == null)?"<null>":this.itemId));
        sb.append(',');
        sb.append("itemLocation");
        sb.append('=');
        sb.append(((this.itemLocation == null)?"<null>":this.itemLocation));
        sb.append(',');
        sb.append("itemWebUrl");
        sb.append('=');
        sb.append(((this.itemWebUrl == null)?"<null>":this.itemWebUrl));
        sb.append(',');
        sb.append("leafCategoryIds");
        sb.append('=');
        sb.append(((this.leafCategoryIds == null)?"<null>":this.leafCategoryIds));
        sb.append(',');
        sb.append("legacyItemId");
        sb.append('=');
        sb.append(((this.legacyItemId == null)?"<null>":this.legacyItemId));
        sb.append(',');
        sb.append("listingMarketplaceId");
        sb.append('=');
        sb.append(((this.listingMarketplaceId == null)?"<null>":this.listingMarketplaceId));
        sb.append(',');
        sb.append("marketingPrice");
        sb.append('=');
        sb.append(((this.marketingPrice == null)?"<null>":this.marketingPrice));
        sb.append(',');
        sb.append("pickupOptions");
        sb.append('=');
        sb.append(((this.pickupOptions == null)?"<null>":this.pickupOptions));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("priceDisplayCondition");
        sb.append('=');
        sb.append(((this.priceDisplayCondition == null)?"<null>":this.priceDisplayCondition));
        sb.append(',');
        sb.append("priorityListing");
        sb.append('=');
        sb.append(((this.priorityListing == null)?"<null>":this.priorityListing));
        sb.append(',');
        sb.append("qualifiedPrograms");
        sb.append('=');
        sb.append(((this.qualifiedPrograms == null)?"<null>":this.qualifiedPrograms));
        sb.append(',');
        sb.append("seller");
        sb.append('=');
        sb.append(((this.seller == null)?"<null>":this.seller));
        sb.append(',');
        sb.append("shippingOptions");
        sb.append('=');
        sb.append(((this.shippingOptions == null)?"<null>":this.shippingOptions));
        sb.append(',');
        sb.append("shortDescription");
        sb.append('=');
        sb.append(((this.shortDescription == null)?"<null>":this.shortDescription));
        sb.append(',');
        sb.append("thumbnailImages");
        sb.append('=');
        sb.append(((this.thumbnailImages == null)?"<null>":this.thumbnailImages));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("topRatedBuyingExperience");
        sb.append('=');
        sb.append(((this.topRatedBuyingExperience == null)?"<null>":this.topRatedBuyingExperience));
        sb.append(',');
        sb.append("tyreLabelImageUrl");
        sb.append('=');
        sb.append(((this.tyreLabelImageUrl == null)?"<null>":this.tyreLabelImageUrl));
        sb.append(',');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("unitPricingMeasure");
        sb.append('=');
        sb.append(((this.unitPricingMeasure == null)?"<null>":this.unitPricingMeasure));
        sb.append(',');
        sb.append("watchCount");
        sb.append('=');
        sb.append(((this.watchCount == null)?"<null>":this.watchCount));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.energyEfficiencyClass == null)? 0 :this.energyEfficiencyClass.hashCode()));
        result = ((result* 31)+((this.seller == null)? 0 :this.seller.hashCode()));
        result = ((result* 31)+((this.legacyItemId == null)? 0 :this.legacyItemId.hashCode()));
        result = ((result* 31)+((this.tyreLabelImageUrl == null)? 0 :this.tyreLabelImageUrl.hashCode()));
        result = ((result* 31)+((this.priceDisplayCondition == null)? 0 :this.priceDisplayCondition.hashCode()));
        result = ((result* 31)+((this.compatibilityProperties == null)? 0 :this.compatibilityProperties.hashCode()));
        result = ((result* 31)+((this.itemGroupType == null)? 0 :this.itemGroupType.hashCode()));
        result = ((result* 31)+((this.leafCategoryIds == null)? 0 :this.leafCategoryIds.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.itemAffiliateWebUrl == null)? 0 :this.itemAffiliateWebUrl.hashCode()));
        result = ((result* 31)+((this.itemEndDate == null)? 0 :this.itemEndDate.hashCode()));
        result = ((result* 31)+((this.currentBidPrice == null)? 0 :this.currentBidPrice.hashCode()));
        result = ((result* 31)+((this.conditionId == null)? 0 :this.conditionId.hashCode()));
        result = ((result* 31)+((this.thumbnailImages == null)? 0 :this.thumbnailImages.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        result = ((result* 31)+((this.itemWebUrl == null)? 0 :this.itemWebUrl.hashCode()));
        result = ((result* 31)+((this.pickupOptions == null)? 0 :this.pickupOptions.hashCode()));
        result = ((result* 31)+((this.shippingOptions == null)? 0 :this.shippingOptions.hashCode()));
        result = ((result* 31)+((this.topRatedBuyingExperience == null)? 0 :this.topRatedBuyingExperience.hashCode()));
        result = ((result* 31)+((this.unitPrice == null)? 0 :this.unitPrice.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.additionalImages == null)? 0 :this.additionalImages.hashCode()));
        result = ((result* 31)+((this.availableCoupons == null)? 0 :this.availableCoupons.hashCode()));
        result = ((result* 31)+((this.marketingPrice == null)? 0 :this.marketingPrice.hashCode()));
        result = ((result* 31)+((this.epid == null)? 0 :this.epid.hashCode()));
        result = ((result* 31)+((this.shortDescription == null)? 0 :this.shortDescription.hashCode()));
        result = ((result* 31)+((this.itemLocation == null)? 0 :this.itemLocation.hashCode()));
        result = ((result* 31)+((this.itemId == null)? 0 :this.itemId.hashCode()));
        result = ((result* 31)+((this.buyingOptions == null)? 0 :this.buyingOptions.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.itemGroupHref == null)? 0 :this.itemGroupHref.hashCode()));
        result = ((result* 31)+((this.itemHref == null)? 0 :this.itemHref.hashCode()));
        result = ((result* 31)+((this.listingMarketplaceId == null)? 0 :this.listingMarketplaceId.hashCode()));
        result = ((result* 31)+((this.adultOnly == null)? 0 :this.adultOnly.hashCode()));
        result = ((result* 31)+((this.itemCreationDate == null)? 0 :this.itemCreationDate.hashCode()));
        result = ((result* 31)+((this.bidCount == null)? 0 :this.bidCount.hashCode()));
        result = ((result* 31)+((this.compatibilityMatch == null)? 0 :this.compatibilityMatch.hashCode()));
        result = ((result* 31)+((this.distanceFromPickupLocation == null)? 0 :this.distanceFromPickupLocation.hashCode()));
        result = ((result* 31)+((this.unitPricingMeasure == null)? 0 :this.unitPricingMeasure.hashCode()));
        result = ((result* 31)+((this.qualifiedPrograms == null)? 0 :this.qualifiedPrograms.hashCode()));
        result = ((result* 31)+((this.priorityListing == null)? 0 :this.priorityListing.hashCode()));
        result = ((result* 31)+((this.watchCount == null)? 0 :this.watchCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItemSummary) == false) {
            return false;
        }
        ItemSummary rhs = ((ItemSummary) other);
        return ((((((((((((((((((((((((((((((((((((((((((((this.energyEfficiencyClass == rhs.energyEfficiencyClass)||((this.energyEfficiencyClass!= null)&&this.energyEfficiencyClass.equals(rhs.energyEfficiencyClass)))&&((this.seller == rhs.seller)||((this.seller!= null)&&this.seller.equals(rhs.seller))))&&((this.legacyItemId == rhs.legacyItemId)||((this.legacyItemId!= null)&&this.legacyItemId.equals(rhs.legacyItemId))))&&((this.tyreLabelImageUrl == rhs.tyreLabelImageUrl)||((this.tyreLabelImageUrl!= null)&&this.tyreLabelImageUrl.equals(rhs.tyreLabelImageUrl))))&&((this.priceDisplayCondition == rhs.priceDisplayCondition)||((this.priceDisplayCondition!= null)&&this.priceDisplayCondition.equals(rhs.priceDisplayCondition))))&&((this.compatibilityProperties == rhs.compatibilityProperties)||((this.compatibilityProperties!= null)&&this.compatibilityProperties.equals(rhs.compatibilityProperties))))&&((this.itemGroupType == rhs.itemGroupType)||((this.itemGroupType!= null)&&this.itemGroupType.equals(rhs.itemGroupType))))&&((this.leafCategoryIds == rhs.leafCategoryIds)||((this.leafCategoryIds!= null)&&this.leafCategoryIds.equals(rhs.leafCategoryIds))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.itemAffiliateWebUrl == rhs.itemAffiliateWebUrl)||((this.itemAffiliateWebUrl!= null)&&this.itemAffiliateWebUrl.equals(rhs.itemAffiliateWebUrl))))&&((this.itemEndDate == rhs.itemEndDate)||((this.itemEndDate!= null)&&this.itemEndDate.equals(rhs.itemEndDate))))&&((this.currentBidPrice == rhs.currentBidPrice)||((this.currentBidPrice!= null)&&this.currentBidPrice.equals(rhs.currentBidPrice))))&&((this.conditionId == rhs.conditionId)||((this.conditionId!= null)&&this.conditionId.equals(rhs.conditionId))))&&((this.thumbnailImages == rhs.thumbnailImages)||((this.thumbnailImages!= null)&&this.thumbnailImages.equals(rhs.thumbnailImages))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))))&&((this.itemWebUrl == rhs.itemWebUrl)||((this.itemWebUrl!= null)&&this.itemWebUrl.equals(rhs.itemWebUrl))))&&((this.pickupOptions == rhs.pickupOptions)||((this.pickupOptions!= null)&&this.pickupOptions.equals(rhs.pickupOptions))))&&((this.shippingOptions == rhs.shippingOptions)||((this.shippingOptions!= null)&&this.shippingOptions.equals(rhs.shippingOptions))))&&((this.topRatedBuyingExperience == rhs.topRatedBuyingExperience)||((this.topRatedBuyingExperience!= null)&&this.topRatedBuyingExperience.equals(rhs.topRatedBuyingExperience))))&&((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice))))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.additionalImages == rhs.additionalImages)||((this.additionalImages!= null)&&this.additionalImages.equals(rhs.additionalImages))))&&((this.availableCoupons == rhs.availableCoupons)||((this.availableCoupons!= null)&&this.availableCoupons.equals(rhs.availableCoupons))))&&((this.marketingPrice == rhs.marketingPrice)||((this.marketingPrice!= null)&&this.marketingPrice.equals(rhs.marketingPrice))))&&((this.epid == rhs.epid)||((this.epid!= null)&&this.epid.equals(rhs.epid))))&&((this.shortDescription == rhs.shortDescription)||((this.shortDescription!= null)&&this.shortDescription.equals(rhs.shortDescription))))&&((this.itemLocation == rhs.itemLocation)||((this.itemLocation!= null)&&this.itemLocation.equals(rhs.itemLocation))))&&((this.itemId == rhs.itemId)||((this.itemId!= null)&&this.itemId.equals(rhs.itemId))))&&((this.buyingOptions == rhs.buyingOptions)||((this.buyingOptions!= null)&&this.buyingOptions.equals(rhs.buyingOptions))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.itemGroupHref == rhs.itemGroupHref)||((this.itemGroupHref!= null)&&this.itemGroupHref.equals(rhs.itemGroupHref))))&&((this.itemHref == rhs.itemHref)||((this.itemHref!= null)&&this.itemHref.equals(rhs.itemHref))))&&((this.listingMarketplaceId == rhs.listingMarketplaceId)||((this.listingMarketplaceId!= null)&&this.listingMarketplaceId.equals(rhs.listingMarketplaceId))))&&((this.adultOnly == rhs.adultOnly)||((this.adultOnly!= null)&&this.adultOnly.equals(rhs.adultOnly))))&&((this.itemCreationDate == rhs.itemCreationDate)||((this.itemCreationDate!= null)&&this.itemCreationDate.equals(rhs.itemCreationDate))))&&((this.bidCount == rhs.bidCount)||((this.bidCount!= null)&&this.bidCount.equals(rhs.bidCount))))&&((this.compatibilityMatch == rhs.compatibilityMatch)||((this.compatibilityMatch!= null)&&this.compatibilityMatch.equals(rhs.compatibilityMatch))))&&((this.distanceFromPickupLocation == rhs.distanceFromPickupLocation)||((this.distanceFromPickupLocation!= null)&&this.distanceFromPickupLocation.equals(rhs.distanceFromPickupLocation))))&&((this.unitPricingMeasure == rhs.unitPricingMeasure)||((this.unitPricingMeasure!= null)&&this.unitPricingMeasure.equals(rhs.unitPricingMeasure))))&&((this.qualifiedPrograms == rhs.qualifiedPrograms)||((this.qualifiedPrograms!= null)&&this.qualifiedPrograms.equals(rhs.qualifiedPrograms))))&&((this.priorityListing == rhs.priorityListing)||((this.priorityListing!= null)&&this.priorityListing.equals(rhs.priorityListing))))&&((this.watchCount == rhs.watchCount)||((this.watchCount!= null)&&this.watchCount.equals(rhs.watchCount))));
    }

}
