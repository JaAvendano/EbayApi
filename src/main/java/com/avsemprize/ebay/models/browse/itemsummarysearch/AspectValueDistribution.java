
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AspectValueDistribution {

    @SerializedName("localizedAspectValue")
    @Expose
    private String localizedAspectValue;
    @SerializedName("matchCount")
    @Expose
    private String matchCount;
    @SerializedName("refinementHref")
    @Expose
    private String refinementHref;

    public String getLocalizedAspectValue() {
        return localizedAspectValue;
    }

    public void setLocalizedAspectValue(String localizedAspectValue) {
        this.localizedAspectValue = localizedAspectValue;
    }

    public AspectValueDistribution withLocalizedAspectValue(String localizedAspectValue) {
        this.localizedAspectValue = localizedAspectValue;
        return this;
    }

    public String getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(String matchCount) {
        this.matchCount = matchCount;
    }

    public AspectValueDistribution withMatchCount(String matchCount) {
        this.matchCount = matchCount;
        return this;
    }

    public String getRefinementHref() {
        return refinementHref;
    }

    public void setRefinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
    }

    public AspectValueDistribution withRefinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AspectValueDistribution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("localizedAspectValue");
        sb.append('=');
        sb.append(((this.localizedAspectValue == null)?"<null>":this.localizedAspectValue));
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
        result = ((result* 31)+((this.matchCount == null)? 0 :this.matchCount.hashCode()));
        result = ((result* 31)+((this.refinementHref == null)? 0 :this.refinementHref.hashCode()));
        result = ((result* 31)+((this.localizedAspectValue == null)? 0 :this.localizedAspectValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AspectValueDistribution) == false) {
            return false;
        }
        AspectValueDistribution rhs = ((AspectValueDistribution) other);
        return ((((this.matchCount == rhs.matchCount)||((this.matchCount!= null)&&this.matchCount.equals(rhs.matchCount)))&&((this.refinementHref == rhs.refinementHref)||((this.refinementHref!= null)&&this.refinementHref.equals(rhs.refinementHref))))&&((this.localizedAspectValue == rhs.localizedAspectValue)||((this.localizedAspectValue!= null)&&this.localizedAspectValue.equals(rhs.localizedAspectValue))));
    }

}
