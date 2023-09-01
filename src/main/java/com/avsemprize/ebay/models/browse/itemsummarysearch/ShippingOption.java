
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ShippingOption {

    @SerializedName("guaranteedDelivery")
    @Expose
    private String guaranteedDelivery;
    @SerializedName("maxEstimatedDeliveryDate")
    @Expose
    private String maxEstimatedDeliveryDate;
    @SerializedName("minEstimatedDeliveryDate")
    @Expose
    private String minEstimatedDeliveryDate;
    @SerializedName("shippingCost")
    @Expose
    private ShippingCost shippingCost;
    @SerializedName("shippingCostType")
    @Expose
    private String shippingCostType;

    public String getGuaranteedDelivery() {
        return guaranteedDelivery;
    }

    public void setGuaranteedDelivery(String guaranteedDelivery) {
        this.guaranteedDelivery = guaranteedDelivery;
    }

    public ShippingOption withGuaranteedDelivery(String guaranteedDelivery) {
        this.guaranteedDelivery = guaranteedDelivery;
        return this;
    }

    public String getMaxEstimatedDeliveryDate() {
        return maxEstimatedDeliveryDate;
    }

    public void setMaxEstimatedDeliveryDate(String maxEstimatedDeliveryDate) {
        this.maxEstimatedDeliveryDate = maxEstimatedDeliveryDate;
    }

    public ShippingOption withMaxEstimatedDeliveryDate(String maxEstimatedDeliveryDate) {
        this.maxEstimatedDeliveryDate = maxEstimatedDeliveryDate;
        return this;
    }

    public String getMinEstimatedDeliveryDate() {
        return minEstimatedDeliveryDate;
    }

    public void setMinEstimatedDeliveryDate(String minEstimatedDeliveryDate) {
        this.minEstimatedDeliveryDate = minEstimatedDeliveryDate;
    }

    public ShippingOption withMinEstimatedDeliveryDate(String minEstimatedDeliveryDate) {
        this.minEstimatedDeliveryDate = minEstimatedDeliveryDate;
        return this;
    }

    public ShippingCost getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(ShippingCost shippingCost) {
        this.shippingCost = shippingCost;
    }

    public ShippingOption withShippingCost(ShippingCost shippingCost) {
        this.shippingCost = shippingCost;
        return this;
    }

    public String getShippingCostType() {
        return shippingCostType;
    }

    public void setShippingCostType(String shippingCostType) {
        this.shippingCostType = shippingCostType;
    }

    public ShippingOption withShippingCostType(String shippingCostType) {
        this.shippingCostType = shippingCostType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShippingOption.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("guaranteedDelivery");
        sb.append('=');
        sb.append(((this.guaranteedDelivery == null)?"<null>":this.guaranteedDelivery));
        sb.append(',');
        sb.append("maxEstimatedDeliveryDate");
        sb.append('=');
        sb.append(((this.maxEstimatedDeliveryDate == null)?"<null>":this.maxEstimatedDeliveryDate));
        sb.append(',');
        sb.append("minEstimatedDeliveryDate");
        sb.append('=');
        sb.append(((this.minEstimatedDeliveryDate == null)?"<null>":this.minEstimatedDeliveryDate));
        sb.append(',');
        sb.append("shippingCost");
        sb.append('=');
        sb.append(((this.shippingCost == null)?"<null>":this.shippingCost));
        sb.append(',');
        sb.append("shippingCostType");
        sb.append('=');
        sb.append(((this.shippingCostType == null)?"<null>":this.shippingCostType));
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
        result = ((result* 31)+((this.minEstimatedDeliveryDate == null)? 0 :this.minEstimatedDeliveryDate.hashCode()));
        result = ((result* 31)+((this.guaranteedDelivery == null)? 0 :this.guaranteedDelivery.hashCode()));
        result = ((result* 31)+((this.maxEstimatedDeliveryDate == null)? 0 :this.maxEstimatedDeliveryDate.hashCode()));
        result = ((result* 31)+((this.shippingCost == null)? 0 :this.shippingCost.hashCode()));
        result = ((result* 31)+((this.shippingCostType == null)? 0 :this.shippingCostType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShippingOption) == false) {
            return false;
        }
        ShippingOption rhs = ((ShippingOption) other);
        return ((((((this.minEstimatedDeliveryDate == rhs.minEstimatedDeliveryDate)||((this.minEstimatedDeliveryDate!= null)&&this.minEstimatedDeliveryDate.equals(rhs.minEstimatedDeliveryDate)))&&((this.guaranteedDelivery == rhs.guaranteedDelivery)||((this.guaranteedDelivery!= null)&&this.guaranteedDelivery.equals(rhs.guaranteedDelivery))))&&((this.maxEstimatedDeliveryDate == rhs.maxEstimatedDeliveryDate)||((this.maxEstimatedDeliveryDate!= null)&&this.maxEstimatedDeliveryDate.equals(rhs.maxEstimatedDeliveryDate))))&&((this.shippingCost == rhs.shippingCost)||((this.shippingCost!= null)&&this.shippingCost.equals(rhs.shippingCost))))&&((this.shippingCostType == rhs.shippingCostType)||((this.shippingCostType!= null)&&this.shippingCostType.equals(rhs.shippingCostType))));
    }

}
