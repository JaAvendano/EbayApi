package com.avsemprize.ebay.models.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    private String height;
    private String imageUrl;
    private String width;
}
