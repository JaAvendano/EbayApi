
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PickupOption {

    @SerializedName("pickupLocationType")
    @Expose
    private String pickupLocationType;

    public String getPickupLocationType() {
        return pickupLocationType;
    }

    public void setPickupLocationType(String pickupLocationType) {
        this.pickupLocationType = pickupLocationType;
    }

    public PickupOption withPickupLocationType(String pickupLocationType) {
        this.pickupLocationType = pickupLocationType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PickupOption.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pickupLocationType");
        sb.append('=');
        sb.append(((this.pickupLocationType == null)?"<null>":this.pickupLocationType));
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
        result = ((result* 31)+((this.pickupLocationType == null)? 0 :this.pickupLocationType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PickupOption) == false) {
            return false;
        }
        PickupOption rhs = ((PickupOption) other);
        return ((this.pickupLocationType == rhs.pickupLocationType)||((this.pickupLocationType!= null)&&this.pickupLocationType.equals(rhs.pickupLocationType)));
    }

}
