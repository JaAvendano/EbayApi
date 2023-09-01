
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MarketingPrice {

    @SerializedName("discountAmount")
    @Expose
    private DiscountAmount discountAmount;
    @SerializedName("discountPercentage")
    @Expose
    private String discountPercentage;
    @SerializedName("originalPrice")
    @Expose
    private OriginalPrice originalPrice;
    @SerializedName("priceTreatment")
    @Expose
    private String priceTreatment;

    public DiscountAmount getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(DiscountAmount discountAmount) {
        this.discountAmount = discountAmount;
    }

    public MarketingPrice withDiscountAmount(DiscountAmount discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    public String getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public MarketingPrice withDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
        return this;
    }

    public OriginalPrice getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(OriginalPrice originalPrice) {
        this.originalPrice = originalPrice;
    }

    public MarketingPrice withOriginalPrice(OriginalPrice originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    public String getPriceTreatment() {
        return priceTreatment;
    }

    public void setPriceTreatment(String priceTreatment) {
        this.priceTreatment = priceTreatment;
    }

    public MarketingPrice withPriceTreatment(String priceTreatment) {
        this.priceTreatment = priceTreatment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MarketingPrice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("discountAmount");
        sb.append('=');
        sb.append(((this.discountAmount == null)?"<null>":this.discountAmount));
        sb.append(',');
        sb.append("discountPercentage");
        sb.append('=');
        sb.append(((this.discountPercentage == null)?"<null>":this.discountPercentage));
        sb.append(',');
        sb.append("originalPrice");
        sb.append('=');
        sb.append(((this.originalPrice == null)?"<null>":this.originalPrice));
        sb.append(',');
        sb.append("priceTreatment");
        sb.append('=');
        sb.append(((this.priceTreatment == null)?"<null>":this.priceTreatment));
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
        result = ((result* 31)+((this.discountPercentage == null)? 0 :this.discountPercentage.hashCode()));
        result = ((result* 31)+((this.discountAmount == null)? 0 :this.discountAmount.hashCode()));
        result = ((result* 31)+((this.priceTreatment == null)? 0 :this.priceTreatment.hashCode()));
        result = ((result* 31)+((this.originalPrice == null)? 0 :this.originalPrice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarketingPrice) == false) {
            return false;
        }
        MarketingPrice rhs = ((MarketingPrice) other);
        return (((((this.discountPercentage == rhs.discountPercentage)||((this.discountPercentage!= null)&&this.discountPercentage.equals(rhs.discountPercentage)))&&((this.discountAmount == rhs.discountAmount)||((this.discountAmount!= null)&&this.discountAmount.equals(rhs.discountAmount))))&&((this.priceTreatment == rhs.priceTreatment)||((this.priceTreatment!= null)&&this.priceTreatment.equals(rhs.priceTreatment))))&&((this.originalPrice == rhs.originalPrice)||((this.originalPrice!= null)&&this.originalPrice.equals(rhs.originalPrice))));
    }

}
