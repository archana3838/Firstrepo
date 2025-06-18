package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_user {

	
	
	public WebDriver driver;
	public Admin_user(WebDriver driver)
	{ 
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and contains(text(),'More info')]")WebElement infobutton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath = "//input[@id='username']")WebElement usernamefield;
	@FindBy(xpath = "//input[@id='password']")WebElement passwordfield;
	@FindBy(xpath = "//select[@name='user_type']")WebElement dropdown;
	@FindBy(xpath = "//button[@name='Create']")WebElement savebutton;

	public void adminusermoreinfo()
	{
		infobutton.click();	
		
	}
	
	
	public void adminusernewbutton()
	{
		
		newbutton.click();
		
	}
	
	
	public void adminusername()
	{
		usernamefield.sendKeys("arrchanasyam");	
		
	}
	
	public void adminpassword()
	{
		passwordfield.sendKeys("1233345");
		
	}
	
	public WebElement usertype()
	{
		dropdown.click();
		return dropdown;
		
	}
	public void savebutton()
	{
		
		savebutton.click();	
	}
}



