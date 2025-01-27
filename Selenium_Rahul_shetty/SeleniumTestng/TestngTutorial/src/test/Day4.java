package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeloan(String uname) {
		System.out.println("WebLoginHomePersonalloan");
		System.out.println("webloginhome");
	}
//	@Test
//	public void WebLoginHomeloan() {
//		System.out.println("WebLoginHomeloan");
//	}
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHomeLoan");
	}
//	@Test
//	public void MobileLoginHomeLoan() {
//		System.out.println("MobileLoginHomeLoan");
//	}
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHomeLoan");
	}
}
