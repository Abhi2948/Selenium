package org.seli.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhishek Pateriya\\Desktop\\resumes\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Initialize EdgeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/google.com");
		driver.navigate().to("http:/rahulshettyacademy.com");
		driver.navigate().back();
		driver.navigate().forward();

	}

}
