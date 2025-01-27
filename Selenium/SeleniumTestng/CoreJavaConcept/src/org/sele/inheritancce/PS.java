package org.sele.inheritancce;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	public void doThis() {
		// TODO Auto-generated method stub
		System.out.println("i am here");
		
	}
	@BeforeMethod
	public void beforeRun() {
		System.out.println("run me first");
	}
	@AfterMethod
	public void afterRun() {
		System.out.println("run me last");
	}

}
