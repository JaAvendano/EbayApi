package com.avsemprize.ebay.models.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EbayProductSearchSummary {
    private String href;
    private String limit;
    private String next;
    private String offset;
    private String prev;
    private List<ProductSummary> productSummaries;
    private Refinement refinement;
    private String total;
}
