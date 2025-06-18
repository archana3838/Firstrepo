package test_script;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Wait_utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Base {
	public WebDriver driver;

  @BeforeMethod
  @Parameters("browser")
  public void browser_initilization(@Optional("chrome") String browser) throws Exception {
 
	  
	 // driver = new ChromeDriver();
	 if(browser.equalsIgnoreCase("chrome"))
	 {
		 driver=new ChromeDriver();
	 }
	 
	 else if(browser.equalsIgnoreCase("edge"))
	 {
		 
		driver=new EdgeDriver(); 
	 }
	 else if(browser.equalsIgnoreCase("firefox"))
	 {
		 
		driver=new FirefoxDriver(); 
	 }
	 else
	 {
		 throw new Exception("invalid");
	 }
	 
	 
      driver.get("https://groceryapp.uniqassosiates.com/admin");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Wait_utility.IMPLICIT_WAIT));  // from wait utility pacakge
	  
	  
  }

  @AfterMethod
  public void driver_quit() {
	  
	 
  }}