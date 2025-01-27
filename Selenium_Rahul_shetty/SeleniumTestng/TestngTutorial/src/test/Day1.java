package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	@AfterTest
	public void lastExecution() {
		System.out.println("i will execute last");
		
	}
	@Test
	public void Demo() {
		System.out.println("hello");
		Assert.assertTrue(false);
	}
	@AfterSuite
	public void AfSuite() {
		System.out.println("i am the no 1 at last");
	}
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}

}
