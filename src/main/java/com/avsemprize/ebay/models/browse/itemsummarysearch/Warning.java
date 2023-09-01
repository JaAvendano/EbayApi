
package com.avsemprize.ebay.models.browse.itemsummarysearch;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Warning {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("errorId")
    @Expose
    private String errorId;
    @SerializedName("inputRefIds")
    @Expose
    private List<String> inputRefIds = new ArrayList<String>();
    @SerializedName("longMessage")
    @Expose
    private String longMessage;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("outputRefIds")
    @Expose
    private List<String> outputRefIds = new ArrayList<String>();
    @SerializedName("parameters")
    @Expose
    private List<Parameter> parameters = new ArrayList<Parameter>();
    @SerializedName("subdomain")
    @Expose
    private String subdomain;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Warning withCategory(String category) {
        this.category = category;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Warning withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public Warning withErrorId(String errorId) {
        this.errorId = errorId;
        return this;
    }

    public List<String> getInputRefIds() {
        return inputRefIds;
    }

    public void setInputRefIds(List<String> inputRefIds) {
        this.inputRefIds = inputRefIds;
    }

    public Warning withInputRefIds(List<String> inputRefIds) {
        this.inputRefIds = inputRefIds;
        return this;
    }

    public String getLongMessage() {
        return longMessage;
    }

    public void setLongMessage(String longMessage) {
        this.longMessage = longMessage;
    }

    public Warning withLongMessage(String longMessage) {
        this.longMessage = longMessage;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Warning withMessage(String message) {
        this.message = message;
        return this;
    }

    public List<String> getOutputRefIds() {
        return outputRefIds;
    }

    public void setOutputRefIds(List<String> outputRefIds) {
        this.outputRefIds = outputRefIds;
    }

    public Warning withOutputRefIds(List<String> outputRefIds) {
        this.outputRefIds = outputRefIds;
        return this;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public Warning withParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    public Warning withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Warning.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("errorId");
        sb.append('=');
        sb.append(((this.errorId == null)?"<null>":this.errorId));
        sb.append(',');
        sb.append("inputRefIds");
        sb.append('=');
        sb.append(((this.inputRefIds == null)?"<null>":this.inputRefIds));
        sb.append(',');
        sb.append("longMessage");
        sb.append('=');
        sb.append(((this.longMessage == null)?"<null>":this.longMessage));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("outputRefIds");
        sb.append('=');
        sb.append(((this.outputRefIds == null)?"<null>":this.outputRefIds));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
        sb.append(',');
        sb.append("subdomain");
        sb.append('=');
        sb.append(((this.subdomain == null)?"<null>":this.subdomain));
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
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.subdomain == null)? 0 :this.subdomain.hashCode()));
        result = ((result* 31)+((this.outputRefIds == null)? 0 :this.outputRefIds.hashCode()));
        result = ((result* 31)+((this.errorId == null)? 0 :this.errorId.hashCode()));
        result = ((result* 31)+((this.inputRefIds == null)? 0 :this.inputRefIds.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.longMessage == null)? 0 :this.longMessage.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Warning) == false) {
            return false;
        }
        Warning rhs = ((Warning) other);
        return ((((((((((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain)))&&((this.subdomain == rhs.subdomain)||((this.subdomain!= null)&&this.subdomain.equals(rhs.subdomain))))&&((this.outputRefIds == rhs.outputRefIds)||((this.outputRefIds!= null)&&this.outputRefIds.equals(rhs.outputRefIds))))&&((this.errorId == rhs.errorId)||((this.errorId!= null)&&this.errorId.equals(rhs.errorId))))&&((this.inputRefIds == rhs.inputRefIds)||((this.inputRefIds!= null)&&this.inputRefIds.equals(rhs.inputRefIds))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.longMessage == rhs.longMessage)||((this.longMessage!= null)&&this.longMessage.equals(rhs.longMessage))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))));
    }

}
