package Amazon.E2EProject;


import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.AmazonHomePage;
import pageObjects.CartCheckout;
import pageObjects.Filters;
import pageObjects.Login;
import pageObjects.SelectProduct;
import pageObjects.WindowHandles;
import resources.Base;



public class HomePageTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	
	@BeforeTest
	public void Initialise() throws IOException
	{
	  driver=initialiseDriver();
	  log.info("driver is initialised");
	  String urlName = prop.getProperty("url");
		driver.get("https://www.amazon.in/");
		log.info("driver is initialised");
		driver.manage().window().maximize();
		log.info("window is maximised");
		

	}
	
	@Test 
	public void search() throws InterruptedException {
	
	   AmazonHomePage s= new AmazonHomePage(driver);
	   log.info("Amazon home page is opened");
	   s.getSearchTab().sendKeys("mobiles");
	   s.getClickSearch().click();
	   log.info("Searched for mobiles");
	  // Thread.sleep(3000);
	   
	   }
	
	@Test(dependsOnMethods = {"search"})	
	public void applyFilter() throws InterruptedException
	{
		
		Filters f= new Filters(driver);
		f.getPrime().click();
		f.getSamsung().click();
		f.getPrice().click();
		log.info("filters are applied");
	}
	
	@Test(dependsOnMethods = {"applyFilter"})
	public void select() throws InterruptedException
	{
		SelectProduct s= new SelectProduct(driver);
		s.getFirst().click();
		log.info("Second product is selcted");
		s.getSecond().click();
		log.info("First product is selcted is selected");
	}
	
	@Test(dependsOnMethods = {"select"})
	public void Window() throws InterruptedException {	
		WindowHandles w= new WindowHandles(driver);
		w.getWindows();
		log.info("Products are added to cart ");
			
	}


	@Test(dependsOnMethods = {"Window"})
	public void checkout() throws InterruptedException
	
	{
		CartCheckout c= new CartCheckout(driver);
		c.getCart().click();
		c.getGo().click();
		log.info("Proceeded to checkout");
		
	}
	
	
	@Test(dependsOnMethods = {"Window"})
	
	public void log() throws  InterruptedException
	{    log.info("User has to login");
		Login lg= new Login(driver);
		lg.getUser().sendKeys("123456");
		lg.getGo().click();
	}
	
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		//Thread.sleep(3000);
		driver.quit();
	}

	
	
	
	
	
	
	

     }