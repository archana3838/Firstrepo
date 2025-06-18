package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_contact {

    public WebDriver driver;

    // Constructor
    public Manage_contact(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

  
    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact']")
    WebElement moreinfoclickbutton;

    @FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
    WebElement contactedit;

    @FindBy(xpath = "//input[@name='phone']")
    WebElement phonenumber;
    
    @FindBy(xpath = "//button[@name='Update']")
    WebElement update;

    
    public void moreinfoclick() 
    {
   
    	moreinfoclickbutton.click();
    }
   
  
    public void updatePhoneNumber(String newNumber) {
        phonenumber.clear();
        phonenumber.sendKeys(newNumber);
    }

	public String getAlertText() {
		
		return null;
	}

	public void clickEdit() {
		
		contactedit.click();
	}

public void updatebutton()
{
	update.click();
}





}
