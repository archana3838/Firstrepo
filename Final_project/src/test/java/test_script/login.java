package test_script;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class login extends Base{
@Test
public void login_test() // testcase1
{
	String username="admin";
	String password = "admin";
	
	WebElement usernamefield = driver.findElement(By.name("username"));
	WebElement passwordfield = driver.findElement(By.name("password"));
	WebElement signup = driver.findElement(By.xpath("//button[text()='Sign In']"));

	usernamefield.sendKeys(username);
	passwordfield.sendKeys(password);
	signup.click();
	WebElement Dashboard = driver.findElement(By.xpath("//p[text()='Dashboard']"));
	
	Dashboard.isDisplayed();// checking dashboard is displayed or not 
	boolean ishomepageavailable = Dashboard.isDisplayed();
	AssertJUnit.assertTrue(ishomepageavailable);// 
	
	
	
	
}

}
