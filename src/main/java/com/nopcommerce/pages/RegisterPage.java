package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    @FindBy(xpath = "//span[@class='male']")
    WebElement maleRadio;

    @FindBy(xpath = "//span[@class='female']")
    WebElement femaleRadio;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement birthDayDropDown;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement birthMonthDropDown;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement birthYearDropDown;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredErrorMessage;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequiredErrorMessage;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailIsRequiredErrorMessage;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordIsRequiredErrorMessage;

    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmationPasswordErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompleteMessage;

    @FindBy(xpath = "(//a[normalize-space()='Continue'])[1]")
    WebElement continueButton;
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutButton;

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginOption;
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;


    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    public void selectGender(String gender){
        if(gender.equalsIgnoreCase("Female")){
            pmClickOnElement(femaleRadio);
        }else if(gender.equalsIgnoreCase("male")){
            pmClickOnElement(maleRadio);
        }else{
            System.out.println("Entered wrong gender");
        }
        log.info("Select Gender : " + gender);
    }
    public void enterFirstName(String firstNameValue){
        pmSendTextToElement(firstName,firstNameValue);
        log.info("Entering the First Name : " + firstNameValue);

    }
    public void enterLastName(String lastNameValue){
        pmSendTextToElement(lastName,lastNameValue);
        log.info("Entering the last Name : " + lastNameValue);
    }
    public void selectBirthDay(String birthDay){
        pmSelectByValueFromDropDown(birthDayDropDown,birthDay);
        log.info("Entering the Birth day : " + birthDay);
    }
    public void selectBirthMonth(String birthMonth){
        pmSelectByValueFromDropDown(birthMonthDropDown,birthMonth);
        log.info("Entering the Birth Month : " + birthMonth);
    }
    public void selectBirthYear(String birthYear){
        pmSelectByValueFromDropDown(birthYearDropDown,birthYear);
        log.info("Entering the Birth Year : " + birthYear);
    }
    public void enterEmail(String emailAddress){

        pmSendTextToElement(email,emailAddress);
        log.info("Entering the email : " + emailAddress);
    }
    public void enterPassword(String passwordValue){
        pmSendTextToElement(password,passwordValue);
        log.info("Entering the password : " + passwordValue);
    }
    public void enterConfirmPassword(String confirmPasswordValue){

        pmSendTextToElement(confirmPassword,confirmPasswordValue);
        log.info("Entering the Confirm Password : " + confirmPasswordValue);

    }
    public void clickOnRegisterButton(){
        pmClickOnElement(registerButton);
        log.info("Click on Register : " + registerButton.toString());
    }
    public void verifyRegistrationComplete(String expectedMessage){

        pmVerifyElements(registrationCompleteMessage,expectedMessage,"Wrong Page");
        log.info("Verify the register Tex : " + expectedMessage);

    }
    public void clickOnRegisterLink(){

        pmClickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }
   /* public String gettextRegistertext(){

        return pmGetTextFromElement( registerText);
        log.info("Clicking on login link : " + registerText.toString());
    }*/
    public void verifyRegisterText(){

        pmVerifyElements(registerText,"Register","RegisterText is not displayed");
        log.info("Verifying the Register Text : " + registerText.toString());

    }
    public void verifyTheErrorMessageFirstNameIsRequired(String expectedMessage){
        pmVerifyElements(firstNameRequiredErrorMessage, expectedMessage,"First name error message is displayed incorrectly");
        log.info("Verifying the first name is required : " + expectedMessage);
    }

    public void verifyTheErrorMessageLastNameIsRequired(String expectedMessage){

        pmVerifyElements(lastNameRequiredErrorMessage, expectedMessage,"Last name error message is displayed incorrectly");
        log.info("Verifying the last name is required : " + expectedMessage);
    }

    public void verifyTheErrorMessageEmailIsRequired(String expectedMessage){
        pmVerifyElements(emailIsRequiredErrorMessage, expectedMessage,"Email error message is displayed incorrectly");
        log.info("Verifying email is required : " + registerText.toString());
    }

    public void verifyTheErrorMessagePasswordIsRequired(String expectedMessage){

        pmVerifyElements(passwordIsRequiredErrorMessage, expectedMessage,"Password error message is displayed incorrectly");
        log.info("Verifying password is required : " + expectedMessage);
    }

    public void verifyTheErrorMessageForConfirmPasswordIsRequired(String expectedMessage){

        pmVerifyElements(confirmationPasswordErrorMessage, expectedMessage,"Confirm Password error message is displayed incorrectly");
        log.info("Verifying Confirmation password is required : " + expectedMessage);
    }



}
