package records.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import records.beans.Record;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Oct 17, 2022
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Record record () {
		Record bean = new Record();
		return bean;
	}

}
