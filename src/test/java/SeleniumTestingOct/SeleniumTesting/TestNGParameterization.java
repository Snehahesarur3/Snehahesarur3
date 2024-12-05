package SeleniumTestingOct.SeleniumTesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterization {
	@Test
	void Test1() {
		System.out.println("smoke testing");
	}
	
	@Test
	@Parameters({"UserName","Password"})
	void Test2(String userName, String password) {
		System.out.println("userName is: "+userName);
		System.out.println("Password is: "+password);
	}
	
	@Test
	void Test3() {
		System.out.println("smoke testing and Regression testing");
	}
}
