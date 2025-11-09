package com.vegnet.server.models.v1;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.AttributeConverter;

public abstract class AbstractJsonConverter<T> implements AttributeConverter<T, String> {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Class<T> entityClass;

    @SuppressWarnings("unchecked")
    public AbstractJsonConverter() {
        this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    @Override
    public String convertToDatabaseColumn(T attribute) {
        if (attribute == null) {
            System.out.println("Address attributes are null.");
            return null;
        }
        try {
            System.out.println("Address attribute stringified: ");
            System.out.println(objectMapper.writeValueAsString(attribute));
            return objectMapper.writeValueAsString(attribute);
        } catch (IOException e) {
            throw new RuntimeException("Error converting object to JSON string", e);
        }
    }

    @Override
    public T convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.trim().isEmpty()) {
            return null;
        }
        try {
            return objectMapper.readValue(dbData, entityClass); 
        } catch (IOException e) {
            throw new RuntimeException("Error converting JSON string to " + entityClass.getSimpleName() + " object", e);
        }
    }
}
