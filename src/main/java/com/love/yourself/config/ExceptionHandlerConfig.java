package com.love.yourself.config;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.WebRequest;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ExceptionHandlerConfig {

    private static final String DEFAULT_KEY_TIMESTAMP = "timestamp";
    private static final String DEFAULT_KEY_STATUS = "status";
    private static final String DEFAULT_KEY_MESSAGE = "message";
    private static final String DEFAULT_KEY_EXCEPTION = "exception";
    private static final String DEFAULT_KEY_PATH = "path";
    private static final String DEFAULT_KEY_ERRORS = "errors";

    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_STATUS = "status";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_EXCEPTION = "cause";
    public static final String KEY_PATH = "path";
    public static final String KEY_ERRORS = "errors";


    @Bean
    public ErrorAttributes errorAttributes() {
        return new DefaultErrorAttributes() {

            @Override
            public Map<String, Object> getErrorAttributes(
                    WebRequest webRequest
                    , boolean includeStackTrace
            ) {
                Map<String, Object> defaultMap
                        = super.getErrorAttributes(webRequest, includeStackTrace);

                Map<String, Object> errorAttributes = new LinkedHashMap<>();

                errorAttributes.put(KEY_TIMESTAMP, defaultMap.get(DEFAULT_KEY_TIMESTAMP));
                errorAttributes.put(KEY_EXCEPTION, defaultMap.get(DEFAULT_KEY_EXCEPTION));
                errorAttributes.put(KEY_STATUS, defaultMap.get(DEFAULT_KEY_STATUS));
                errorAttributes.put(KEY_MESSAGE, defaultMap.get(DEFAULT_KEY_MESSAGE));
                errorAttributes.put(KEY_PATH, defaultMap.get(DEFAULT_KEY_PATH));

                return errorAttributes;
            }
        };
    }
}