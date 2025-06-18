package test_script;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import pages.Login_page;
import utilities.Excel_utility;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Login_test extends Base{
  @Test
	public void login_test() throws IOException
	{
	  //String username="admin";
		//String password = "admin";
		String username=Excel_utility.getStringData(1, 0, "loginpage");
		String password=Excel_utility.getStringData(1, 1, "loginpage");
		
		Login_page loginpage = new Login_page(driver);
		
		
		loginpage.enterusername(username);
		loginpage.enterpassword(password);
		loginpage.sighin();
		
		
		boolean ishomepageavailable=loginpage.Isdashboarddisplayed();
		
		AssertJUnit.assertTrue(ishomepageavailable);
	}
	
  
  
  @Test
  public void loginpassword_testincorrect() throws IOException
  {
      Login_page loginPage = new Login_page(driver);
      String username = Excel_utility.getStringData(2, 0, "loginpage");
      String password = Excel_utility.getStringData(2, 1, "loginpage");

      loginPage.enterusername(username);
      loginPage.enterpassword(password);
      loginPage.sighin();

      // Add assertion for incorrect login, maybe check for alert or error message
      boolean alertDisplayed = loginPage.sighupalert(); // Assuming this returns boolean
      AssertJUnit.assertTrue(alertDisplayed); // or whatever your condition is
  }

  @Test
  public void loginusername_testincorrect() throws IOException
  {
      Login_page loginPage = new Login_page(driver);
      String username = Excel_utility.getStringData(3, 0, "loginpage");
      String password = Excel_utility.getStringData(3, 1, "loginpage");

      loginPage.enterusername(username);
      loginPage.enterpassword(password);
      loginPage.sighin();

      // Add assertion for incorrect login, maybe check for alert or error message
      boolean alertDisplayed = loginPage.sighupalert(); // Assuming this returns boolean
      AssertJUnit.assertTrue(alertDisplayed); // or whatever your condition is
  }
  
  
  

  @Test
  public void loginboth_testincorrect() throws IOException
  {
      Login_page loginPage = new Login_page(driver);
      String username = Excel_utility.getStringData(4, 0, "loginpage");
      String password = Excel_utility.getStringData(4, 1, "loginpage");

      loginPage.enterusername(username);
      loginPage.enterpassword(password);
      loginPage.sighin();

      // Add assertion for incorrect login, maybe check for alert or error message
      boolean alertDisplayed = loginPage.sighupalert(); // Assuming this returns boolean
      AssertJUnit.assertTrue(alertDisplayed); // or whatever your condition is
  }
  
  
  
  
}
//this code is commomfor all page 
//String username="admin";
//String password = "admin";

//Login_page loginpage = new Login_page(driver);


//loginpage.enterusername(username);
//loginpage.enterpassword(password);
//loginpage.sighin();