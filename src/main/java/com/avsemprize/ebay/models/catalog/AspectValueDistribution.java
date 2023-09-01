package com.avsemprize.ebay.models.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AspectValueDistribution {
    private String localizedAspectValue;
    private String matchCount;
    private String refinementHref;
}
