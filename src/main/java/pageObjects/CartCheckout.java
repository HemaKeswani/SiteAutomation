package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartCheckout {
	
public WebDriver driver;
	
	public CartCheckout(WebDriver driver) {
		
		   this.driver= driver;// TODO Auto-generated constructor stub
	}
	
	By cart= By.cssSelector("#nav-cart-count-container");

	
	By proceed= By.cssSelector("#sc-buy-box-ptc-button");
	

	
	public WebElement getCart() throws InterruptedException {

		 WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-cart-count-container")));
		return driver.findElement(cart);
		
	}
	
	public WebElement getGo() throws InterruptedException {

		 WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#sc-buy-box-ptc-button")));
		return driver.findElement(proceed);
		
	}
	

}
