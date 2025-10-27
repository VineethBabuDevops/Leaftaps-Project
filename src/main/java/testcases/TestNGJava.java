package testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestNGJava {

	public static void main(String[] args) {

		TestNG testng = new TestNG();

		// List of XML files to run
		List<String> suites = new ArrayList<>();
		suites.add("multiplerun.xml"); // replace with your XML file path

		testng.setTestSuites(suites);

		// Run TestNG
		testng.run();
	}

}
