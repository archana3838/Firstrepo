package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Login_page;
import pages.Manage_contact;

public class Manage_Contact_test extends Base {

    @Test
    public void isContactCanBeEdited() {
        String username = "admin";
        String password = "admin";
        String newPhoneNumber = "7472347636";

        // Step 1: Login
        Login_page loginpage = new Login_page(driver);
        loginpage.enterusername(username);
        loginpage.enterpassword(password);
        loginpage.sighin();

        // Step 2: Go to Manage Contact and edit
        Manage_contact manageContact = new Manage_contact(driver);
        manageContact.moreinfoclick();  
        manageContact.clickEdit();        
        manageContact.updatePhoneNumber(newPhoneNumber); 
        manageContact.updatebutton();
        
        
        
        // Step 3: validate alert/message
        String alertText = manageContact.getAlertText(); 
        Assert.assertTrue(alertText.contains("Updated Successfully") || alertText.contains("Success"));
    }
}
