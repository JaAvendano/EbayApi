
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryDistribution {

    @SerializedName("categoryId")
    @Expose
    private String categoryId;
    @SerializedName("categoryName")
    @Expose
    private String categoryName;
    @SerializedName("matchCount")
    @Expose
    private String matchCount;
    @SerializedName("refinementHref")
    @Expose
    private String refinementHref;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public CategoryDistribution withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryDistribution withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public String getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(String matchCount) {
        this.matchCount = matchCount;
    }

    public CategoryDistribution withMatchCount(String matchCount) {
        this.matchCount = matchCount;
        return this;
    }

    public String getRefinementHref() {
        return refinementHref;
    }

    public void setRefinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
    }

    public CategoryDistribution withRefinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CategoryDistribution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("categoryId");
        sb.append('=');
        sb.append(((this.categoryId == null)?"<null>":this.categoryId));
        sb.append(',');
        sb.append("categoryName");
        sb.append('=');
        sb.append(((this.categoryName == null)?"<null>":this.categoryName));
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
        result = ((result* 31)+((this.categoryName == null)? 0 :this.categoryName.hashCode()));
        result = ((result* 31)+((this.categoryId == null)? 0 :this.categoryId.hashCode()));
        result = ((result* 31)+((this.refinementHref == null)? 0 :this.refinementHref.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CategoryDistribution) == false) {
            return false;
        }
        CategoryDistribution rhs = ((CategoryDistribution) other);
        return (((((this.matchCount == rhs.matchCount)||((this.matchCount!= null)&&this.matchCount.equals(rhs.matchCount)))&&((this.categoryName == rhs.categoryName)||((this.categoryName!= null)&&this.categoryName.equals(rhs.categoryName))))&&((this.categoryId == rhs.categoryId)||((this.categoryId!= null)&&this.categoryId.equals(rhs.categoryId))))&&((this.refinementHref == rhs.refinementHref)||((this.refinementHref!= null)&&this.refinementHref.equals(rhs.refinementHref))));
    }

}
