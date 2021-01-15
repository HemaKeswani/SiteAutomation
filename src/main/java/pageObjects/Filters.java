package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filters {
	
	
	
public WebDriver driver;
	
	public Filters(WebDriver driver) {
		
		   this.driver= driver;// TODO Auto-generated constructor stub
	}
	
	By prime=By.xpath("//*[@id='p_85/10440599031']/span/a/div/label/i");
	By brand= By.xpath("//*[@id=\'p_89/Samsung\']/span/a");
	By range= By.xpath("//*[@id=\'p_36/1318505031\']/span/a/span");
	
	
   public WebElement getPrime() throws InterruptedException {

	   WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='p_85/10440599031']/span/a/div/label/i")));
	  
		return driver.findElement(prime);
		
	}
   public WebElement getSamsung() throws InterruptedException {

	   WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'p_89/Samsung\']/span/a")));
	  
		return driver.findElement(brand);
		
	}
   public WebElement getPrice() throws InterruptedException {
	   WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'p_36/1318505031\']/span/a/span")));
	  
	    
		return driver.findElement(range);
		
	}
}
