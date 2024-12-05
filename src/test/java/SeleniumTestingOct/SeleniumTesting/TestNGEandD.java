package SeleniumTestingOct.SeleniumTesting;

import org.testng.annotations.Test;

public class TestNGEandD {
	@Test(enabled = true)
	void Test1() {
		System.out.println("smoke testing");
	}
	
	@Test(enabled = false)
	void Test2() {
		System.out.println("Regression testing");
	}
	
	@Test(enabled = true)
	void Test3() {
		System.out.println("smoke testing and Regression testing");
	}
}
