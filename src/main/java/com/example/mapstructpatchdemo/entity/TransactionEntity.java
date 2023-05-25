package com.example.mapstructpatchdemo.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class TransactionEntity {
    private UUID id;
    private BigDecimal amount;
    private AddressEntity address;
}
