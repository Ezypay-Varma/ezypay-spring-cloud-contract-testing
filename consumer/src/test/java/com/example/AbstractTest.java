package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.springframework.boot.test.json.JacksonTester;

/**
 * @author Varma
 */
public abstract class AbstractTest {

	public JacksonTester<Person> json;
	public JacksonTester<StatsRequest> statsJson;

	@Before
	public void setup() {
		ObjectMapper objectMappper = new ObjectMapper();
		// Possibly configure the mapper
		JacksonTester.initFields(this, objectMappper);
	}
}
