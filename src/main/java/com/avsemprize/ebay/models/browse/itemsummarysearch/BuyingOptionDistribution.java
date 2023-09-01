
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BuyingOptionDistribution {

    @SerializedName("buyingOption")
    @Expose
    private String buyingOption;
    @SerializedName("matchCount")
    @Expose
    private String matchCount;
    @SerializedName("refinementHref")
    @Expose
    private String refinementHref;

    public String getBuyingOption() {
        return buyingOption;
    }

    public void setBuyingOption(String buyingOption) {
        this.buyingOption = buyingOption;
    }

    public BuyingOptionDistribution withBuyingOption(String buyingOption) {
        this.buyingOption = buyingOption;
        return this;
    }

    public String getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(String matchCount) {
        this.matchCount = matchCount;
    }

    public BuyingOptionDistribution withMatchCount(String matchCount) {
        this.matchCount = matchCount;
        return this;
    }

    public String getRefinementHref() {
        return refinementHref;
    }

    public void setRefinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
    }

    public BuyingOptionDistribution withRefinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BuyingOptionDistribution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("buyingOption");
        sb.append('=');
        sb.append(((this.buyingOption == null)?"<null>":this.buyingOption));
        sb.append(',');
        sb.append("matchCount");
        sb.append('=');
        sb.append(((this.matchCount == null)?"<null>":this.matchCount));
        sb.append(',');
        sb.append("refinementHref");
        sb.append('=');
        sb.append(((this.refinementHref == null)?"<null>":this.refinementHref));
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
        result = ((result* 31)+((this.buyingOption == null)? 0 :this.buyingOption.hashCode()));
        result = ((result* 31)+((this.matchCount == null)? 0 :this.matchCount.hashCode()));
        result = ((result* 31)+((this.refinementHref == null)? 0 :this.refinementHref.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuyingOptionDistribution) == false) {
            return false;
        }
        BuyingOptionDistribution rhs = ((BuyingOptionDistribution) other);
        return ((((this.buyingOption == rhs.buyingOption)||((this.buyingOption!= null)&&this.buyingOption.equals(rhs.buyingOption)))&&((this.matchCount == rhs.matchCount)||((this.matchCount!= null)&&this.matchCount.equals(rhs.matchCount))))&&((this.refinementHref == rhs.refinementHref)||((this.refinementHref!= null)&&this.refinementHref.equals(rhs.refinementHref))));
    }

}
