
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class BrowseItemSummarySearch {

    @SerializedName("autoCorrections")
    @Expose
    private AutoCorrections autoCorrections;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("itemSummaries")
    @Expose
    private List<ItemSummary> itemSummaries = new ArrayList<ItemSummary>();
    @SerializedName("limit")
    @Expose
    private String limit;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("offset")
    @Expose
    private String offset;
    @SerializedName("prev")
    @Expose
    private String prev;
    @SerializedName("refinement")
    @Expose
    private Refinement refinement;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("warnings")
    @Expose
    private List<Warning> warnings = new ArrayList<Warning>();

    public AutoCorrections getAutoCorrections() {
        return autoCorrections;
    }

    public void setAutoCorrections(AutoCorrections autoCorrections) {
        this.autoCorrections = autoCorrections;
    }

    public BrowseItemSummarySearch withAutoCorrections(AutoCorrections autoCorrections) {
        this.autoCorrections = autoCorrections;
        return this;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public BrowseItemSummarySearch withHref(String href) {
        this.href = href;
        return this;
    }

    public List<ItemSummary> getItemSummaries() {
        return itemSummaries;
    }

    public void setItemSummaries(List<ItemSummary> itemSummaries) {
        this.itemSummaries = itemSummaries;
    }

    public BrowseItemSummarySearch withItemSummaries(List<ItemSummary> itemSummaries) {
        this.itemSummaries = itemSummaries;
        return this;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public BrowseItemSummarySearch withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public BrowseItemSummarySearch withNext(String next) {
        this.next = next;
        return this;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public BrowseItemSummarySearch withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public BrowseItemSummarySearch withPrev(String prev) {
        this.prev = prev;
        return this;
    }

    public Refinement getRefinement() {
        return refinement;
    }

    public void setRefinement(Refinement refinement) {
        this.refinement = refinement;
    }

    public BrowseItemSummarySearch withRefinement(Refinement refinement) {
        this.refinement = refinement;
        return this;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public BrowseItemSummarySearch withTotal(String total) {
        this.total = total;
        return this;
    }

    public List<Warning> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Warning> warnings) {
        this.warnings = warnings;
    }

    public BrowseItemSummarySearch withWarnings(List<Warning> warnings) {
        this.warnings = warnings;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BrowseItemSummarySearch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("autoCorrections");
        sb.append('=');
        sb.append(((this.autoCorrections == null)?"<null>":this.autoCorrections));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("itemSummaries");
        sb.append('=');
        sb.append(((this.itemSummaries == null)?"<null>":this.itemSummaries));
        sb.append(',');
        sb.append("limit");
        sb.append('=');
        sb.append(((this.limit == null)?"<null>":this.limit));
        sb.append(',');
        sb.append("next");
        sb.append('=');
        sb.append(((this.next == null)?"<null>":this.next));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
        sb.append(',');
        sb.append("prev");
        sb.append('=');
        sb.append(((this.prev == null)?"<null>":this.prev));
        sb.append(',');
        sb.append("refinement");
        sb.append('=');
        sb.append(((this.refinement == null)?"<null>":this.refinement));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("warnings");
        sb.append('=');
        sb.append(((this.warnings == null)?"<null>":this.warnings));
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
        result = ((result* 31)+((this.next == null)? 0 :this.next.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.autoCorrections == null)? 0 :this.autoCorrections.hashCode()));
        result = ((result* 31)+((this.prev == null)? 0 :this.prev.hashCode()));
        result = ((result* 31)+((this.warnings == null)? 0 :this.warnings.hashCode()));
        result = ((result* 31)+((this.itemSummaries == null)? 0 :this.itemSummaries.hashCode()));
        result = ((result* 31)+((this.limit == null)? 0 :this.limit.hashCode()));
        result = ((result* 31)+((this.refinement == null)? 0 :this.refinement.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BrowseItemSummarySearch) == false) {
            return false;
        }
        BrowseItemSummarySearch rhs = ((BrowseItemSummarySearch) other);
        return (((((((((((this.next == rhs.next)||((this.next!= null)&&this.next.equals(rhs.next)))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.autoCorrections == rhs.autoCorrections)||((this.autoCorrections!= null)&&this.autoCorrections.equals(rhs.autoCorrections))))&&((this.prev == rhs.prev)||((this.prev!= null)&&this.prev.equals(rhs.prev))))&&((this.warnings == rhs.warnings)||((this.warnings!= null)&&this.warnings.equals(rhs.warnings))))&&((this.itemSummaries == rhs.itemSummaries)||((this.itemSummaries!= null)&&this.itemSummaries.equals(rhs.itemSummaries))))&&((this.limit == rhs.limit)||((this.limit!= null)&&this.limit.equals(rhs.limit))))&&((this.refinement == rhs.refinement)||((this.refinement!= null)&&this.refinement.equals(rhs.refinement))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))));
    }

}
