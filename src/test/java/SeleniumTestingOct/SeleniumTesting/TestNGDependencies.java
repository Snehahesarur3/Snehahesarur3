package SeleniumTestingOct.SeleniumTesting;

import org.testng.annotations.Test;

class TestNGDependencies {
	@Test()
	void Test1() {
		System.out.println("smoke testing");
	}
	
	@Test(groups = {"Regression"} ,dependsOnMethods = {"Test1"})
	void Test2() {
		System.out.println("Regression testing");
	}
	
	@Test(dependsOnGroups  = {"Regression"})
	void Test3() {
		System.out.println("smoke testing and Regression testing");
	}
}
