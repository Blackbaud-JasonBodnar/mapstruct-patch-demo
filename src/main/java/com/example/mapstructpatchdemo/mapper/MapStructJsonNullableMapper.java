package com.example.mapstructpatchdemo.mapper;

import org.mapstruct.Condition;
import org.mapstruct.Mapper;
import org.openapitools.jackson.nullable.JsonNullable;

@Mapper(
        componentModel = "spring"
)
public interface MapStructJsonNullableMapper {
    default <T> T unwrapJsonNullable(JsonNullable<T> source) {
        return source == null ? null : source.orElse(null);
    }

    @Condition
    default <T> boolean isPresent(JsonNullable<T> source) {
        return source != null && source.isPresent();
    }
}
