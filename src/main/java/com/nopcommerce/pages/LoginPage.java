package com.nopcommerce.pages;

import com.nopcommerce.drivermanager.ManageDriver;
import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailText;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordText;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement logInButton;

    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welComeText;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutOption;
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutButton;

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginOption;



    public LoginPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    public void verifyWelcomeMessage(String expectedMessage){

    String actualMessage = pmGetTextFromElement(welComeText);
        Assert.assertEquals("wrong page",expectedMessage,actualMessage);
        log.info("verifying the welcome message : " + welComeText.toString());


}

    public void enterEmail(String email){
        pmSendTextToElement(emailText,email);
        log.info("Entering the email : " + email.toString());
    }

    public void enterPassword(String password){

        pmSendTextToElement(passwordText,password);
        log.info("Entering the password : " + password.toString());

    }

    public void clickOnLoginButton(){

        pmClickOnElement(logInButton);
        log.info("Clicking on login button : " + logInButton.toString());
    }
    public void verifyLoginUnsuccessful(String expectedMessage){

        //String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
             //   + "No customer account found";
        String actualErrorMessage = pmGetTextFromElement(errorMessage);
        Assert.assertEquals("Error message not displayed", expectedMessage,actualErrorMessage);
        log.info("Verify Login successful : " + expectedMessage);
    }
    public void verifyLogOutOption(String expectedMessage) {
        String actualMessage=pmGetTextFromElement(logOutOption);
        Assert.assertEquals("Wrong Option",expectedMessage,actualMessage);
       // pmVerifyElements(logOutOption, "Log out", "wrong option");
        log.info("verifying the Log out Option : " + expectedMessage);
    }

    public void clickOnLogOutButton() {
        pmClickOnElement(logOutButton);
        log.info("Clicking on Log out Button : " + logOutButton.toString());
    }

    public void verifyLoginOption(String expectedMessage) {
        String actualMessage= pmGetTextFromElement(loginOption);
        Assert.assertEquals("Wrong Options",expectedMessage,actualMessage);
      //  pmVerifyElements(loginOption, "Log in", "wrong option");
        log.info("verifying the Log in Option : " + expectedMessage);

    }

}
