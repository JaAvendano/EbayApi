
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DistanceFromPickupLocation {

    @SerializedName("unitOfMeasure")
    @Expose
    private String unitOfMeasure;
    @SerializedName("value")
    @Expose
    private String value;

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public DistanceFromPickupLocation withUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DistanceFromPickupLocation withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DistanceFromPickupLocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("unitOfMeasure");
        sb.append('=');
        sb.append(((this.unitOfMeasure == null)?"<null>":this.unitOfMeasure));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.unitOfMeasure == null)? 0 :this.unitOfMeasure.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistanceFromPickupLocation) == false) {
            return false;
        }
        DistanceFromPickupLocation rhs = ((DistanceFromPickupLocation) other);
        return (((this.unitOfMeasure == rhs.unitOfMeasure)||((this.unitOfMeasure!= null)&&this.unitOfMeasure.equals(rhs.unitOfMeasure)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
