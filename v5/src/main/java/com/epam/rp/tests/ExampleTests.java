package com.epam.rp.tests;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

@Slf4j
public class ExampleTests {

	@BeforeAll
	static void setup() {
		log.info("@BeforeAll - executes once before all test methods in this class");
	}

	@BeforeEach
	void init() {
		log.info("@BeforeEach - executes before each test method in this class");
	}

	@DisplayName("Single test successful")
	@Test
	void testSingleSuccessTest() {
		log.info("Success");
	}

	@Test
	@Disabled("Not implemented yet")
	void testShowSomething() {
	}

	@AfterEach
	void tearDown() {
		log.info("@AfterEach - executed after each test method.");
	}

	@AfterAll
	static void done() {
		log.info("@AfterAll - executed after all test methods.");
	}

	@BeforeEach
	void initializeBaseClass() {
		log.info("Before each");
	}

	@Test
	@Tag("tag1")
	@Tag("tag2")
	void baseClassTest() {
		log.info("test");
	}

	@Nested
	class FirstContext {

		@BeforeEach
		void initializeFirstNesting() {
			log.info("nested - before each");
		}

		@Test
		@RepeatedTest(10)
		void firstNestedTest() {
			log.info("nested - test");
		}

		@AfterEach
		void afterFirstContext() {
			log.info("nested - after each");
		}

	}
}
