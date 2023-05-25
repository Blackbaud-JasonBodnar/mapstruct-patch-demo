package com.example.mapstructpatchdemo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressEntity {
    private String addressBlock;
    private String dependentLocality;
    private String locality;
    private String administrativeArea;
    private String country;
    private String postalCode;
}
