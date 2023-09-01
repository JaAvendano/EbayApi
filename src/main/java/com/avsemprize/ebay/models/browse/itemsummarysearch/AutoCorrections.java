
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AutoCorrections {

    @SerializedName("q")
    @Expose
    private String q;

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public AutoCorrections withQ(String q) {
        this.q = q;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AutoCorrections.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("q");
        sb.append('=');
        sb.append(((this.q == null)?"<null>":this.q));
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
        result = ((result* 31)+((this.q == null)? 0 :this.q.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutoCorrections) == false) {
            return false;
        }
        AutoCorrections rhs = ((AutoCorrections) other);
        return ((this.q == rhs.q)||((this.q!= null)&&this.q.equals(rhs.q)));
    }

}
