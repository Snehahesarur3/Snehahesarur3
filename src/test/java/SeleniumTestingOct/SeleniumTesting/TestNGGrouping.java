package SeleniumTestingOct.SeleniumTesting;

import org.testng.annotations.Test;

public class TestNGGrouping {
	
	@Test(groups = {"smoke"})
	void Test1() {
		System.out.println("smoke testing");
	}
	
	@Test(groups = {"Regression"})
	void Test2() {
		System.out.println("Regression testing");
	}
	
	@Test(groups = {"smoke, Regression"})
	void Test3() {
		System.out.println("smoke testing and Regression testing");
	}
}
