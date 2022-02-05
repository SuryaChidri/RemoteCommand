package com.example.com.remotecommand.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class Beans {

    @Configuration
    public static class ApplicationConfig{

        @Bean
        public RestTemplate restTemplate() {
            ObjectMapper mapper = new ObjectMapper();
            RestTemplate  rt = new RestTemplate();
            List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
            MappingJackson2HttpMessageConverter jsonMessageConverter = new MappingJackson2HttpMessageConverter();
            jsonMessageConverter.setObjectMapper(mapper);
            messageConverters.add(jsonMessageConverter);
            rt.setMessageConverters(messageConverters);
            return  rt;
        }

    }
}
