package com.example.mapstructpatchdemo.mapper;

import com.example.mapstructpatchdemo.api.AddressPatch;
import com.example.mapstructpatchdemo.api.TransactionPatch;
import com.example.mapstructpatchdemo.entity.AddressEntity;
import com.example.mapstructpatchdemo.entity.TransactionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        uses = {
                MapStructJsonNullableMapper.class
        }
)
public interface TransactionMapper {
    void patchTransactionEntity(@MappingTarget TransactionEntity transactionEntity, TransactionPatch patch);

    AddressEntity addressPatchToAddressEntity(AddressPatch source);
}
