package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
public WebDriver driver;
	
	public Login(WebDriver driver) {
		
		   this.driver= driver;// TODO Auto-generated constructor stub
	}
	By username= By.xpath("//*[@id=\'ap_email\']");
	By go = By.xpath("//*[@id=\'continue\']");
	
	public WebElement getUser() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'ap_email\']")));
	  
		return driver.findElement(username);
		
	}
	
	public WebElement getGo() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//*[@id=\'continue\']")));
	  
		return driver.findElement(go);
		
	}

}
