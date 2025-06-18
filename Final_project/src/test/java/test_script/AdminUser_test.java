package test_script;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Admin_user;
import pages.Login_page;
import utilities.Faker_utility;

public class AdminUser_test<Faker_Utility> extends  Base {

	
	

	@Test
	public void adminuserisaddedsuccessfully()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
Faker_utility fakerutility=new Faker_utility();// for creating fake username amd password  for blocking the testcase failure already exits user
		
		
		String username=fakerutility.creatARandomFirstName();
		String password=fakerutility.creatARandomLastName();//faker
		// String username="admin";
			//String password = "admin";
			Login_page loginpage = new Login_page(driver);
			
			
			loginpage.enterusername(username);
			loginpage.enterpassword(password);
			loginpage.sighin();
	
			Admin_user useradmin = new Admin_user(driver);
		
			useradmin.adminusermoreinfo();
			useradmin.adminusernewbutton();
			useradmin.adminusername();
			useradmin.adminpassword();
			useradmin.savebutton();
			useradmin.usertype();
			
			
			
			    WebElement userTypeDropdown = useradmin.usertype(); 
			    Select usertype = new Select(userTypeDropdown);
			    usertype.selectByIndex(2);
			    useradmin.savebutton();
	
}


}
