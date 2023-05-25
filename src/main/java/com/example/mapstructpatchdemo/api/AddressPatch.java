package com.example.mapstructpatchdemo.api;

import lombok.Builder;
import lombok.Data;
import org.openapitools.jackson.nullable.JsonNullable;

@Data
@Builder
public class AddressPatch {
    private JsonNullable<String> addressBlock;
    private JsonNullable<String> dependentLocality;
    private JsonNullable<String> locality;
    private JsonNullable<String> administrativeArea;
    private JsonNullable<String> country;
    private JsonNullable<String> postalCode;
}
