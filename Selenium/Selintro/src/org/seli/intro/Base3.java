package org.seli.intro;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Abhishek Pateriya\\Desktop\\resumes\\edgedriver_win64\\msedgedriver.exe");
		// Initialize EdgeDriver
		WebDriver driver = new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

	
		String[] itemsNeeded={"Cucumber","Brocolli","Beetroot","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	
	}
	public static void addItems(WebDriver driver,String[] itemsNeeded) {
		int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			List itemsNeededList=Arrays.asList(itemsNeeded);
		
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length) {
					break;
				}
			}
		}
		

	}
}
