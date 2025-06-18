package test_script;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import pages.Login_page;
import pages.Manage_news_page;

public class Managenews_test extends  Base{

	
	
	
	
	@Test
	public void ismessagesavedintextbox()
	{
		
		
		 String username="admin";
			String password = "admin";
			String textMessage1 ="enter the news";
			
			Login_page loginpage = new Login_page(driver);
			
			
			loginpage.enterusername(username);
			loginpage.enterpassword(password);
			loginpage.sighin();
			
			Manage_news_page managenewspage = new Manage_news_page(driver);
			
			managenewspage.moreinfobutton();
			managenewspage.newbutton();
			managenewspage.textmessage(textMessage1);
			managenewspage.clickSaveButton();
			managenewspage.alert();
			
			 String alertText = managenewspage.getAlertText();
		        AssertJUnit.assertTrue(alertText.contains("News Added Successfully") || alertText.contains("Success"));
		
	}
	
	
	
	
}
