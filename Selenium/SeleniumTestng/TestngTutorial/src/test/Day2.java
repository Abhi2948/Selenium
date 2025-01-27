package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute last");
	}
	@Test(groups={"Smoke"})
	public void Demo() {
		System.out.println("good");
	}
//	@Test
//	public void Demo() {
//		System.out.println("good");
//	}
	@BeforeTest
	public void prerequiste() {
		System.out.println("I will execute first");
		
	}

}
