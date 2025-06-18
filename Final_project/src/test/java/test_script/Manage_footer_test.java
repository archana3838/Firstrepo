package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login_page;
import pages.Manage_footer;

public class Manage_footer_test extends Base {

    @Test
    public void isFooterTextCanBeEdited() {
        String username = "admin";
        String password = "admin";
        String newFooterMessage = "This is my updated footer message";

        // Step 1: Login
        Login_page loginPage = new Login_page(driver);
        loginPage.enterusername(username);
        loginPage.enterpassword(password);
        loginPage.sighin();

        // Step 2: Navigate and update footer
        Manage_footer footerPage = new Manage_footer(driver);
        footerPage.clickMoreInfo();                   
        footerPage.clickEditButton();                 
        footerPage.enterFooterMessage(newFooterMessage);
        footerPage.clickUpdateButton();             
        // Step 3: Validate success alert
        String alertText = footerPage.getAlertText();
        Assert.assertNotNull(alertText, "Alert message is null");
        Assert.assertTrue(alertText.contains("Updated Successfully"), "Expected message not found!");
    }
}
