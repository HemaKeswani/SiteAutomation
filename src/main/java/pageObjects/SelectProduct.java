package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectProduct {

public WebDriver driver;
	
	public SelectProduct (WebDriver driver) {
		
		   this.driver= driver;// TODO Auto-generated constructor stub
	}
	
	By first=By.xpath("//*[@id=\'search\']/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span");
	By second= By.xpath("//*[@id=\'search\']/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2");
	
	
	
    public WebElement getFirst() throws InterruptedException {

    	WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'search\']/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")));
	  
		return driver.findElement(first);
		
	}
	public WebElement getSecond() throws InterruptedException
	{        WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'search\']/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2")));
	  
		return driver.findElement(second);
		
	}
}
