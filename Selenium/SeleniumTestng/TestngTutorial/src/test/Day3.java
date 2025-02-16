package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day3 {
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebLoginCarloan(String urlname,String key) {
		System.out.println("WebLoginCarloan");
		System.out.println(urlname);
		System.out.println(key);
	}
//	@Test
//	public void WebLoginCarloan() {
//		System.out.println("WebLoginCarloan");
//	}
	@BeforeMethod
	public void beforeevery() {
		System.out.println("i will execute before every test method  in day 3 class");
	}
	@AfterMethod
	public void Afterevery() {
		System.out.println("i will execute after every test method  in day 3 class");
	}
	@Test(groups={"Smoke"})
	public void MobileLogincarLoan() {
		System.out.println("MobileLogincarLoan");
	}
//	@Test
//	public void MobileLogincarLoan() {
//		System.out.println("MobileLogincarLoan");
//	}
	@Test(enabled=false)
	public void MobilesignincarLoan() {
		System.out.println("Mobile_signin");
	}
//	@Test
//	public void MobilesignincarLoan() {
//		System.out.println("Mobile_signin");
//	}
	@Test(dataProvider="getData")
	public void MobilesignoutcarLoan(String username,String password) {
		System.out.println("Mobile_signout");
		System.out.println(username);
		System.out.println(password);
	}
//	@Test(timeOut=4000)
//	public void MobilesignoutcarLoan() {
//		System.out.println("Mobile_signout");
//	}
//	@Test
//	public void MobilesignoutcarLoan() {
//		System.out.println("Mobile_signout");
//	}
	@Test(dependsOnMethods="WebLoginCarloan")
	public void APIcarloan()
	{
		System.out.println("API_login_carloan");
	}
	@BeforeSuite
	public void BfSuite() {
		System.out.println("i am no 1");
	}
	@Test
	public void LoginAPIcarLoan() {
		System.out.println("LoginAPIcarLoan");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}
}
