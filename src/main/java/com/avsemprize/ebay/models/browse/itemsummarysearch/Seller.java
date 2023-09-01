
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seller {

    @SerializedName("feedbackPercentage")
    @Expose
    private String feedbackPercentage;
    @SerializedName("feedbackScore")
    @Expose
    private String feedbackScore;
    @SerializedName("sellerAccountType")
    @Expose
    private String sellerAccountType;
    @SerializedName("username")
    @Expose
    private String username;

    public String getFeedbackPercentage() {
        return feedbackPercentage;
    }

    public void setFeedbackPercentage(String feedbackPercentage) {
        this.feedbackPercentage = feedbackPercentage;
    }

    public Seller withFeedbackPercentage(String feedbackPercentage) {
        this.feedbackPercentage = feedbackPercentage;
        return this;
    }

    public String getFeedbackScore() {
        return feedbackScore;
    }

    public void setFeedbackScore(String feedbackScore) {
        this.feedbackScore = feedbackScore;
    }

    public Seller withFeedbackScore(String feedbackScore) {
        this.feedbackScore = feedbackScore;
        return this;
    }

    public String getSellerAccountType() {
        return sellerAccountType;
    }

    public void setSellerAccountType(String sellerAccountType) {
        this.sellerAccountType = sellerAccountType;
    }

    public Seller withSellerAccountType(String sellerAccountType) {
        this.sellerAccountType = sellerAccountType;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Seller withUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Seller.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("feedbackPercentage");
        sb.append('=');
        sb.append(((this.feedbackPercentage == null)?"<null>":this.feedbackPercentage));
        sb.append(',');
        sb.append("feedbackScore");
        sb.append('=');
        sb.append(((this.feedbackScore == null)?"<null>":this.feedbackScore));
        sb.append(',');
        sb.append("sellerAccountType");
        sb.append('=');
        sb.append(((this.sellerAccountType == null)?"<null>":this.sellerAccountType));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
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
        result = ((result* 31)+((this.feedbackPercentage == null)? 0 :this.feedbackPercentage.hashCode()));
        result = ((result* 31)+((this.feedbackScore == null)? 0 :this.feedbackScore.hashCode()));
        result = ((result* 31)+((this.sellerAccountType == null)? 0 :this.sellerAccountType.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Seller) == false) {
            return false;
        }
        Seller rhs = ((Seller) other);
        return (((((this.feedbackPercentage == rhs.feedbackPercentage)||((this.feedbackPercentage!= null)&&this.feedbackPercentage.equals(rhs.feedbackPercentage)))&&((this.feedbackScore == rhs.feedbackScore)||((this.feedbackScore!= null)&&this.feedbackScore.equals(rhs.feedbackScore))))&&((this.sellerAccountType == rhs.sellerAccountType)||((this.sellerAccountType!= null)&&this.sellerAccountType.equals(rhs.sellerAccountType))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
