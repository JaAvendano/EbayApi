package com.avsemprize.ebay.models.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aspect {
    private String localizedName;
    private List<String> localizedValues;
}
