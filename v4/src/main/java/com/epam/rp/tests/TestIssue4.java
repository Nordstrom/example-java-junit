package com.epam.rp.tests;

import com.epam.reportportal.junit.CustomJUnitRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CustomJUnitRunner.class)
public class TestIssue4 {

	@Test
	public void test1() {
		Assert.assertTrue("First result", true);
	}

	@Test
	public void test2() {
		Assert.assertTrue("Second result", true);
	}
}
