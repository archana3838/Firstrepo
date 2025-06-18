package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	public WebDriver driver;
	public Login_page(WebDriver driver) { // parametrized constrocutor 
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	
@FindBy(name = "username")WebElement usernameField;
@FindBy(name = "password")WebElement passwordfield;
@FindBy(xpath = "//button[text()='Sign In']")WebElement signin;
@FindBy(xpath="//p[text()='Dashboard']")WebElement 	Dashboard;
@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")WebElement redalert;
	
	
	
	

	public void enterusername(String username)
	{
		
		usernameField.sendKeys(username);
		
		
	}
	
	public void enterpassword(String password)
	{
		
		passwordfield.sendKeys(password);
	}
	
	
	public void sighin()
	{
		
		 signin.click();
		
		
	}
	
	
	public boolean Isdashboarddisplayed()
	{
		
		
		return Dashboard.isDisplayed();	
		
	}

	public boolean sighupalert() {
		
		return redalert.isDisplayed();
		
	}
	
	
}




