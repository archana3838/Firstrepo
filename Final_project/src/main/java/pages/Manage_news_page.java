package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_news_page {

	
	public WebDriver driver;
	public Manage_news_page(WebDriver driver)
	{ // parametrized constrocutor 
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement managenewsmoreinfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement manageinfonewbutton;
	//@FindBy(className  = "//textarea[@name='news']")WebElement entertextmessage;
	
	@FindBy(xpath = "//button[text()='Save']")WebElement savebutton;
	//@FindBy(className = "//div[@class='alert alert-success alert-dismissible']")WebElement newalert;
	
	@FindBy(xpath = "//textarea[@name='news']") WebElement entertextmessage;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement newalert;

	@FindBy(xpath = "//textarea[@id='news']")WebElement textmessage;
	
	

	public void moreinfobutton()
	{
		
		managenewsmoreinfo.click();
	}
	
	
	
	public void newbutton()
	{
		
		manageinfonewbutton.click();
		
	}


	
public void textmessage(String textMessage1)
{
	entertextmessage.sendKeys(textMessage1);	
	
}
	

	
	public void clickSaveButton() {
		savebutton.click();
	}
	public void alert()
	{
		newalert.click();
	}
	public String getAlertText() {
	    return newalert.getText();  // Or use isDisplayed() for boolean check
	}


	public boolean istextmessagesaved() {
		return false;
		
		
	}
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

