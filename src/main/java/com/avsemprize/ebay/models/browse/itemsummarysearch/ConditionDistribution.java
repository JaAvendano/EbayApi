
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConditionDistribution {

    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("conditionId")
    @Expose
    private String conditionId;
    @SerializedName("matchCount")
    @Expose
    private String matchCount;
    @SerializedName("refinementHref")
    @Expose
    private String refinementHref;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public ConditionDistribution withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public String getConditionId() {
        return conditionId;
    }

    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    public ConditionDistribution withConditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    public String getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(String matchCount) {
        this.matchCount = matchCount;
    }

    public ConditionDistribution withMatchCount(String matchCount) {
        this.matchCount = matchCount;
        return this;
    }

    public String getRefinementHref() {
        return refinementHref;
    }

    public void setRefinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
    }

    public ConditionDistribution withRefinementHref(String refinementHref) {
        this.refinementHref = refinementHref;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConditionDistribution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("conditionId");
        sb.append('=');
        sb.append(((this.conditionId == null)?"<null>":this.conditionId));
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
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.matchCount == null)? 0 :this.matchCount.hashCode()));
        result = ((result* 31)+((this.conditionId == null)? 0 :this.conditionId.hashCode()));
        result = ((result* 31)+((this.refinementHref == null)? 0 :this.refinementHref.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConditionDistribution) == false) {
            return false;
        }
        ConditionDistribution rhs = ((ConditionDistribution) other);
        return (((((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition)))&&((this.matchCount == rhs.matchCount)||((this.matchCount!= null)&&this.matchCount.equals(rhs.matchCount))))&&((this.conditionId == rhs.conditionId)||((this.conditionId!= null)&&this.conditionId.equals(rhs.conditionId))))&&((this.refinementHref == rhs.refinementHref)||((this.refinementHref!= null)&&this.refinementHref.equals(rhs.refinementHref))));
    }

}
