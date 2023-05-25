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
    date = "2023-05-25T14:04:33-0500",
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
            if ( transactionEntity.getAddress() == null ) {
                transactionEntity.setAddress( AddressEntity.builder().build() );
            }
            patchAddressEntity( transactionEntity.getAddress(), mapStructJsonNullableMapper.unwrapJsonNullable( patch.getAddress() ) );
        }
    }

    @Override
    public void patchAddressEntity(AddressEntity addressEntity, AddressPatch source) {
        if ( source == null ) {
            return;
        }

        if ( mapStructJsonNullableMapper.isPresent( source.getAddressBlock() ) ) {
            addressEntity.setAddressBlock( mapStructJsonNullableMapper.unwrapJsonNullable( source.getAddressBlock() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( source.getDependentLocality() ) ) {
            addressEntity.setDependentLocality( mapStructJsonNullableMapper.unwrapJsonNullable( source.getDependentLocality() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( source.getLocality() ) ) {
            addressEntity.setLocality( mapStructJsonNullableMapper.unwrapJsonNullable( source.getLocality() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( source.getAdministrativeArea() ) ) {
            addressEntity.setAdministrativeArea( mapStructJsonNullableMapper.unwrapJsonNullable( source.getAdministrativeArea() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( source.getCountry() ) ) {
            addressEntity.setCountry( mapStructJsonNullableMapper.unwrapJsonNullable( source.getCountry() ) );
        }
        if ( mapStructJsonNullableMapper.isPresent( source.getPostalCode() ) ) {
            addressEntity.setPostalCode( mapStructJsonNullableMapper.unwrapJsonNullable( source.getPostalCode() ) );
        }
    }
}
