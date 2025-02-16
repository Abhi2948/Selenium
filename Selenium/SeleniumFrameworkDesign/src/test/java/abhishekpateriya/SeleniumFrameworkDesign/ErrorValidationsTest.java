package abhishekpateriya.SeleniumFrameworkDesign;

import org.testng.annotations.Test;

import abhishekpateriya.SeleniumFrameworkDesign.pageobjects.CartPage;
import abhishekpateriya.SeleniumFrameworkDesign.pageobjects.CheckoutPage;
import abhishekpateriya.SeleniumFrameworkDesign.pageobjects.ConfirmationPage;
import abhishekpateriya.SeleniumFrameworkDesign.pageobjects.ProductCatalogue;
import abhishekpateriya.TestComponents.BaseTest;
import abhishekpateriya.TestComponents.Retry;

import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorValidationsTest extends BaseTest {

	@Test(groups= {"ErrorHandling"},retryAnalyzer=Retry.class)
//	@Test(groups= {"ErrorHandling"})
	public void LoginErrorValidation() throws IOException, InterruptedException {

	
		landingPage.loginApplication("anshika@gmail.com", "Iamking@000");
		 Thread.sleep(4000);
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());

	}
	

	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException
	{

		String productName = "IPHONE 13 PRO";
		ProductCatalogue productCatalogue = landingPage.loginApplication("rahulshetty@gmail.com", "Iamking@000");
		 Thread.sleep(2000);
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		 Thread.sleep(2000);
		CartPage cartPage = productCatalogue.goToCartPage();
		Boolean match = cartPage.VerifyProductDisplay("IPHONE 13 PRO");
		Assert.assertFalse(match);
		
	

	}

	
	

}
