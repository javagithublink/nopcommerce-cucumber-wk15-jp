package com.nopcommerce.pages;

import com.nopcommerce.drivermanager.ManageDriver;
import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//li")
    WebElement allMenu;

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopcommerceLogo;

    @FindBy(xpath = "")
    WebElement myAccountLink;

    @FindBy(xpath = "")
    WebElement logOutLink;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;

    public HomePage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    public void clickOnLogInLink() {

        pmClickOnElement(loginLink);
        log.info("Click on Login Link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {

        pmClickOnElement(registerLink);
        log.info("Click on Register Link : " + registerLink.toString());
    }

    public void clickOnComputerTab() {

        pmClickOnElement(computerTab);
        log.info("Click on computer link : " + computerTab.toString());

    }

}

