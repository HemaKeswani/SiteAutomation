package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Base {
	      
	  
	
		public static  WebDriver driver;
		
		public Properties prop = new Properties();
		
		public String parent;
			

      
	public WebDriver initialiseDriver() throws IOException
	{
		
		
		FileInputStream fis= new FileInputStream("C:\\Users\\hemak\\eclipse-workspacehema\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
	String browserName=	prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\training\\chromedriver.exe");
		  driver= new ChromeDriver();
			
    }
	else if(browserName.equals("firefox"))
	{  
		//firefox code
	   driver= new FirefoxDriver();
     }
	else if(browserName.equals("IE"))
	{
		  //IE code
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	
	}