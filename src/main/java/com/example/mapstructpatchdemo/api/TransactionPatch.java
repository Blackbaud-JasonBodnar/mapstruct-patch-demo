package com.example.mapstructpatchdemo.api;

import lombok.Builder;
import lombok.Data;
import org.openapitools.jackson.nullable.JsonNullable;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class TransactionPatch {
    private JsonNullable<UUID> id;
    private JsonNullable<BigDecimal> amount;
    private JsonNullable<AddressPatch> address;
}
