package com.admissions.registration.studentregistration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
@Configuration
public class Appconfig {
	
	    @Bean
	    public ObjectMapper serializingObjectMapper() {
	        ObjectMapper objectMapper = new ObjectMapper();
	        objectMapper.findAndRegisterModules();
	        return objectMapper;
	    }
	    
	    /*
		 * @Bean public ModelMapper modelMapper() { return new ModelMapper(); }
		 */
	
}
