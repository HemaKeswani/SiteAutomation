package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage {
	
	public WebDriver driver;
	
	public AmazonHomePage(WebDriver driver) {
		
		   this.driver= driver;// TODO Auto-generated constructor stub
	}
	
	
	By search=By.id("twotabsearchtextbox");
	
	By clickSearch=By.xpath("//*[@id=\'nav-search-submit-text\']");
	

	public WebElement getSearchTab() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		return driver.findElement(search);
		
	}
	public WebElement getClickSearch() throws InterruptedException
	{    WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'nav-search-submit-text\']")));
		return driver.findElement(clickSearch);
		
	}
	
	

}
