
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DiscountAmount {

    @SerializedName("convertedFromCurrency")
    @Expose
    private String convertedFromCurrency;
    @SerializedName("convertedFromValue")
    @Expose
    private String convertedFromValue;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("value")
    @Expose
    private String value;

    public String getConvertedFromCurrency() {
        return convertedFromCurrency;
    }

    public void setConvertedFromCurrency(String convertedFromCurrency) {
        this.convertedFromCurrency = convertedFromCurrency;
    }

    public DiscountAmount withConvertedFromCurrency(String convertedFromCurrency) {
        this.convertedFromCurrency = convertedFromCurrency;
        return this;
    }

    public String getConvertedFromValue() {
        return convertedFromValue;
    }

    public void setConvertedFromValue(String convertedFromValue) {
        this.convertedFromValue = convertedFromValue;
    }

    public DiscountAmount withConvertedFromValue(String convertedFromValue) {
        this.convertedFromValue = convertedFromValue;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public DiscountAmount withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DiscountAmount withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DiscountAmount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("convertedFromCurrency");
        sb.append('=');
        sb.append(((this.convertedFromCurrency == null)?"<null>":this.convertedFromCurrency));
        sb.append(',');
        sb.append("convertedFromValue");
        sb.append('=');
        sb.append(((this.convertedFromValue == null)?"<null>":this.convertedFromValue));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
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
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.convertedFromValue == null)? 0 :this.convertedFromValue.hashCode()));
        result = ((result* 31)+((this.convertedFromCurrency == null)? 0 :this.convertedFromCurrency.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscountAmount) == false) {
            return false;
        }
        DiscountAmount rhs = ((DiscountAmount) other);
        return (((((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency)))&&((this.convertedFromValue == rhs.convertedFromValue)||((this.convertedFromValue!= null)&&this.convertedFromValue.equals(rhs.convertedFromValue))))&&((this.convertedFromCurrency == rhs.convertedFromCurrency)||((this.convertedFromCurrency!= null)&&this.convertedFromCurrency.equals(rhs.convertedFromCurrency))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
