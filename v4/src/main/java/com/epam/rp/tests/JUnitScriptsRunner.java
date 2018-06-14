package com.epam.rp.tests;

import com.epam.reportportal.junit.ReportPortalListener;
import org.junit.runner.JUnitCore;

public class JUnitScriptsRunner {

	public static void main(String[] args) {
		JUnitCore core = new JUnitCore();
		core.addListener(new ReportPortalListener());
		core.run(SimpleTestSuite1.class);
	}
}
