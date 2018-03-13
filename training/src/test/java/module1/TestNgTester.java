package module1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNgTester {
	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println("The integer passed from data provider is : " + n);
		System.out.println("The String passed from data provider is : " + s);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In Before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("In After method");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("In Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("In After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("In Before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("In After test");
	}

}
