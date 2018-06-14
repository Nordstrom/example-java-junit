package com.epam.rp.tests;

import com.epam.reportportal.junit.CustomJUnitRunner;
import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

import java.util.LinkedList;
import java.util.List;

public class MySuite extends Suite {
	private static Class<?>[] getAnnotatedClasses(Class<?> klass) throws InitializationError {
		Suite.SuiteClasses annotation = klass.getAnnotation(Suite.SuiteClasses.class);
		if (annotation == null) {
			throw new InitializationError(String.format("class '%s' must have a SuiteClasses annotation", klass.getName()));
		}
		return annotation.value();
	}

	public MySuite(Class<?> klass, RunnerBuilder builder) throws Exception {
		super(klass, getRunners(getAnnotatedClasses(klass)));
	}

	public static List<Runner> getRunners(Class<?>[] classes) throws Exception {
		List<Runner> runners = new LinkedList<>();
		for (Class<?> klazz : classes) {
			runners.add(new CustomJUnitRunner(klazz)); //Initialization of RP custom runner
		}
		return runners;
	}
}