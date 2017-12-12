package org.spring.wagavinproject.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
public class JSonUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> String convertToJson(T object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error mapping data!", e);
        }
    }
}
