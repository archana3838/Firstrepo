package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Manage_footer {

    public WebDriver driver;

    // Constructor
    public Manage_footer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Web Elements
    @FindBy(xpath = "//a[contains(@href, 'list-footertext')]")
    WebElement moreInfoButton;

    @FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
    WebElement editButton;

    @FindBy(xpath = "//textarea[@id='content']")
    WebElement messageBox;

    @FindBy(xpath = "//button[@class='btn btn-block-sm btn-info']")
    WebElement updateButton;

    @FindBy(xpath = "//div[contains(@class,'alert')]")
    WebElement alertMessage;

    // Actions
    public void clickMoreInfo() {
        moreInfoButton.click();
    }

    public void clickEditButton() {
        editButton.click();
    }

    public void enterFooterMessage(String message) {
        messageBox.clear();
        messageBox.sendKeys(message);
    }

    public void clickUpdateButton() {
        updateButton.click();
    }

    public String getAlertText() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(alertMessage));
            return alertMessage.getText();
        } catch (Exception e) {
            return null;
        }
    }
}
