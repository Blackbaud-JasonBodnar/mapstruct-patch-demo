package com.example.mapstructpatchdemo.mapper;

import com.example.mapstructpatchdemo.api.AddressPatch;
import com.example.mapstructpatchdemo.api.TransactionPatch;
import com.example.mapstructpatchdemo.entity.AddressEntity;
import com.example.mapstructpatchdemo.entity.TransactionEntity;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-25T15:08:18-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.19 (Ubuntu)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Autowired
    private MapStructJsonNullableMapper mapStructJsonNullableMapper;

    @Override
    public void patchTransactionEntity(TransactionEntity transactionEntity, TransactionPatch patch) {
        if ( patch == null ) {
            return;
        }

        if ( mapStructJsonNullableMapper.isPresent( patch.getId() ) ) {
            transactionEntity.setId( mapStructJsonNullableMapper.unwrapJsonNullable( patch.getId() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( patch.getAmount() ) ) {
            transactionEntity.setAmount( mapStructJsonNullableMapper.unwrapJsonNullable( patch.getAmount() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( patch.getAddress() ) ) {
            transactionEntity.setAddress( addressPatchToAddressEntity( mapStructJsonNullableMapper.unwrapJsonNullable( patch.getAddress() ) ) );
        }
    }

    @Override
    public AddressEntity addressPatchToAddressEntity(AddressPatch source) {
        if ( source == null ) {
            return null;
        }

        AddressEntity.AddressEntityBuilder addressEntity = AddressEntity.builder();

        if ( mapStructJsonNullableMapper.isPresent( source.getAddressBlock() ) ) {
            addressEntity.addressBlock( mapStructJsonNullableMapper.unwrapJsonNullable( source.getAddressBlock() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( source.getDependentLocality() ) ) {
            addressEntity.dependentLocality( mapStructJsonNullableMapper.unwrapJsonNullable( source.getDependentLocality() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( source.getLocality() ) ) {
            addressEntity.locality( mapStructJsonNullableMapper.unwrapJsonNullable( source.getLocality() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( source.getAdministrativeArea() ) ) {
            addressEntity.administrativeArea( mapStructJsonNullableMapper.unwrapJsonNullable( source.getAdministrativeArea() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( source.getCountry() ) ) {
            addressEntity.country( mapStructJsonNullableMapper.unwrapJsonNullable( source.getCountry() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( source.getPostalCode() ) ) {
            addressEntity.postalCode( mapStructJsonNullableMapper.unwrapJsonNullable( source.getPostalCode() ) );
        }

        return addressEntity.build();
    }
}
