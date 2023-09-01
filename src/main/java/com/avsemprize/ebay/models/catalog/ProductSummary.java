package com.avsemprize.ebay.models.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductSummary {
    private List<AdditionalImage> additionalImages;
    private List<Aspect> aspects;
    private String brand;
    private List<String> ean;
    private String epid;
    private List<String> gtin;
    private Image image;
    private List<String> isbn;
    private List<String> mpn;
    private String productHref;
    private String productWebUrl;
    private String title;
    private List<String> upc;
}
