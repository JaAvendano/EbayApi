
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AspectDistribution {

    @SerializedName("aspectValueDistributions")
    @Expose
    private List<AspectValueDistribution> aspectValueDistributions = new ArrayList<AspectValueDistribution>();
    @SerializedName("localizedAspectName")
    @Expose
    private String localizedAspectName;

    public List<AspectValueDistribution> getAspectValueDistributions() {
        return aspectValueDistributions;
    }

    public void setAspectValueDistributions(List<AspectValueDistribution> aspectValueDistributions) {
        this.aspectValueDistributions = aspectValueDistributions;
    }

    public AspectDistribution withAspectValueDistributions(List<AspectValueDistribution> aspectValueDistributions) {
        this.aspectValueDistributions = aspectValueDistributions;
        return this;
    }

    public String getLocalizedAspectName() {
        return localizedAspectName;
    }

    public void setLocalizedAspectName(String localizedAspectName) {
        this.localizedAspectName = localizedAspectName;
    }

    public AspectDistribution withLocalizedAspectName(String localizedAspectName) {
        this.localizedAspectName = localizedAspectName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AspectDistribution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aspectValueDistributions");
        sb.append('=');
        sb.append(((this.aspectValueDistributions == null)?"<null>":this.aspectValueDistributions));
        sb.append(',');
        sb.append("localizedAspectName");
        sb.append('=');
        sb.append(((this.localizedAspectName == null)?"<null>":this.localizedAspectName));
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
        result = ((result* 31)+((this.aspectValueDistributions == null)? 0 :this.aspectValueDistributions.hashCode()));
        result = ((result* 31)+((this.localizedAspectName == null)? 0 :this.localizedAspectName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AspectDistribution) == false) {
            return false;
        }
        AspectDistribution rhs = ((AspectDistribution) other);
        return (((this.aspectValueDistributions == rhs.aspectValueDistributions)||((this.aspectValueDistributions!= null)&&this.aspectValueDistributions.equals(rhs.aspectValueDistributions)))&&((this.localizedAspectName == rhs.localizedAspectName)||((this.localizedAspectName!= null)&&this.localizedAspectName.equals(rhs.localizedAspectName))));
    }

}
