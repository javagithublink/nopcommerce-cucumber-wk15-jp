package com.nopcommerce.pages;

import com.nopcommerce.drivermanager.ManageDriver;
import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersText;

    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']")
    WebElement noteBooksLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Software']")
    WebElement softwareLink;

    public ComputerPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }
    public void verifyComputerPage(String expectedMessage){

        pmVerifyElements(computersText,expectedMessage,"Wrong Page");
        log.info("Verify Computer Page : " + expectedMessage);
    }
    public void clickOnDesktop(){

        pmClickOnElement(desktopsLink);
        log.info("Click On Desktop : " + desktopsLink.toString());
    }



}
