
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Refinement {

    @SerializedName("aspectDistributions")
    @Expose
    private List<AspectDistribution> aspectDistributions = new ArrayList<AspectDistribution>();
    @SerializedName("buyingOptionDistributions")
    @Expose
    private List<BuyingOptionDistribution> buyingOptionDistributions = new ArrayList<BuyingOptionDistribution>();
    @SerializedName("categoryDistributions")
    @Expose
    private List<CategoryDistribution> categoryDistributions = new ArrayList<CategoryDistribution>();
    @SerializedName("conditionDistributions")
    @Expose
    private List<ConditionDistribution> conditionDistributions = new ArrayList<ConditionDistribution>();
    @SerializedName("dominantCategoryId")
    @Expose
    private String dominantCategoryId;

    public List<AspectDistribution> getAspectDistributions() {
        return aspectDistributions;
    }

    public void setAspectDistributions(List<AspectDistribution> aspectDistributions) {
        this.aspectDistributions = aspectDistributions;
    }

    public Refinement withAspectDistributions(List<AspectDistribution> aspectDistributions) {
        this.aspectDistributions = aspectDistributions;
        return this;
    }

    public List<BuyingOptionDistribution> getBuyingOptionDistributions() {
        return buyingOptionDistributions;
    }

    public void setBuyingOptionDistributions(List<BuyingOptionDistribution> buyingOptionDistributions) {
        this.buyingOptionDistributions = buyingOptionDistributions;
    }

    public Refinement withBuyingOptionDistributions(List<BuyingOptionDistribution> buyingOptionDistributions) {
        this.buyingOptionDistributions = buyingOptionDistributions;
        return this;
    }

    public List<CategoryDistribution> getCategoryDistributions() {
        return categoryDistributions;
    }

    public void setCategoryDistributions(List<CategoryDistribution> categoryDistributions) {
        this.categoryDistributions = categoryDistributions;
    }

    public Refinement withCategoryDistributions(List<CategoryDistribution> categoryDistributions) {
        this.categoryDistributions = categoryDistributions;
        return this;
    }

    public List<ConditionDistribution> getConditionDistributions() {
        return conditionDistributions;
    }

    public void setConditionDistributions(List<ConditionDistribution> conditionDistributions) {
        this.conditionDistributions = conditionDistributions;
    }

    public Refinement withConditionDistributions(List<ConditionDistribution> conditionDistributions) {
        this.conditionDistributions = conditionDistributions;
        return this;
    }

    public String getDominantCategoryId() {
        return dominantCategoryId;
    }

    public void setDominantCategoryId(String dominantCategoryId) {
        this.dominantCategoryId = dominantCategoryId;
    }

    public Refinement withDominantCategoryId(String dominantCategoryId) {
        this.dominantCategoryId = dominantCategoryId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Refinement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aspectDistributions");
        sb.append('=');
        sb.append(((this.aspectDistributions == null)?"<null>":this.aspectDistributions));
        sb.append(',');
        sb.append("buyingOptionDistributions");
        sb.append('=');
        sb.append(((this.buyingOptionDistributions == null)?"<null>":this.buyingOptionDistributions));
        sb.append(',');
        sb.append("categoryDistributions");
        sb.append('=');
        sb.append(((this.categoryDistributions == null)?"<null>":this.categoryDistributions));
        sb.append(',');
        sb.append("conditionDistributions");
        sb.append('=');
        sb.append(((this.conditionDistributions == null)?"<null>":this.conditionDistributions));
        sb.append(',');
        sb.append("dominantCategoryId");
        sb.append('=');
        sb.append(((this.dominantCategoryId == null)?"<null>":this.dominantCategoryId));
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
        result = ((result* 31)+((this.aspectDistributions == null)? 0 :this.aspectDistributions.hashCode()));
        result = ((result* 31)+((this.conditionDistributions == null)? 0 :this.conditionDistributions.hashCode()));
        result = ((result* 31)+((this.categoryDistributions == null)? 0 :this.categoryDistributions.hashCode()));
        result = ((result* 31)+((this.dominantCategoryId == null)? 0 :this.dominantCategoryId.hashCode()));
        result = ((result* 31)+((this.buyingOptionDistributions == null)? 0 :this.buyingOptionDistributions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Refinement) == false) {
            return false;
        }
        Refinement rhs = ((Refinement) other);
        return ((((((this.aspectDistributions == rhs.aspectDistributions)||((this.aspectDistributions!= null)&&this.aspectDistributions.equals(rhs.aspectDistributions)))&&((this.conditionDistributions == rhs.conditionDistributions)||((this.conditionDistributions!= null)&&this.conditionDistributions.equals(rhs.conditionDistributions))))&&((this.categoryDistributions == rhs.categoryDistributions)||((this.categoryDistributions!= null)&&this.categoryDistributions.equals(rhs.categoryDistributions))))&&((this.dominantCategoryId == rhs.dominantCategoryId)||((this.dominantCategoryId!= null)&&this.dominantCategoryId.equals(rhs.dominantCategoryId))))&&((this.buyingOptionDistributions == rhs.buyingOptionDistributions)||((this.buyingOptionDistributions!= null)&&this.buyingOptionDistributions.equals(rhs.buyingOptionDistributions))));
    }

}
