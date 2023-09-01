package com.avsemprize.ebay.models.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AspectDistribution {
    private List<AspectValueDistribution> aspectValueDistributions;
    private String localizedAspectName;
}
