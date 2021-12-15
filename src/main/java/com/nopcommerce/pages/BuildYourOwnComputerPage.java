package com.nopcommerce.pages;

import com.nopcommerce.drivermanager.ManageDriver;
import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement buildYourOwnComputerText;
    @FindBy(xpath = "//dd[1]//select[1]")
    WebElement processorTab;
    @FindBy(xpath = "//select[@class='valid']//option[@value='1']")
    WebElement processorOption1;
    @FindBy(xpath = "//select[@class='valid']//option[@value='2']")
    WebElement processorOption2;
    @FindBy(xpath = "//dd[2]//select[1]")
    WebElement ramTab;
    @FindBy(xpath = "//dd[2]//select[1]//option[@value='3']")
    WebElement ramTabOption1;
    @FindBy(xpath = "//dd[2]//select[1]//option[@value='4']")
    WebElement ramTabOption2;
    @FindBy(xpath = "//dd[2]//select[1]//option[@value='5']")
    WebElement ramTabOption3;
    @FindBy(xpath = "//label[@for='product_attribute_3_6']")
    WebElement hdd320GB;
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hdd400GB;
    @FindBy(xpath = "//label[@for='product_attribute_4_8']")
    WebElement osVistaHome;
    @FindBy(xpath = "//label[@for='product_attribute_4_9']")
    WebElement osVistaPremium;
    @FindBy(xpath = "//label[@for='product_attribute_5_10']")
    WebElement softwareMSOffice;
    @FindBy(xpath = "//label[@for='product_attribute_5_12']")
    WebElement softwareTotalCommander;
    @FindBy(xpath = "//label[@for='product_attribute_5_11']")
    WebElement softwareAcrobatReader;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartButton;
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddedToCartMessage;
    public BuildYourOwnComputerPage(){PageFactory.initElements(ManageDriver.driver, this);}

    public void selectProcessor(String processor) {

        pmSelectByContainsTextFromDropDown(processorTab, processor);
        log.info("Select Processor : " + processor);
    }

    public void selectRAM(String ram)  {

        pmSelectByContainsTextFromDropDown(ramTab, ram);
        log.info("Select RAM : " + ram);
    }

    public void selectHDD(String hdd) {

        if (hdd.equalsIgnoreCase("320 GB")) {
            hdd320GB.click();
        } else if (hdd.equalsIgnoreCase("400 GB [+$100.00]")) {
            hdd400GB.click();
        }
        log.info("Select HDD : " + hdd);
    }

    public void selectOS(String os) {

        if (os.equalsIgnoreCase("Vista Home [+$50.00]")) {
            osVistaHome.click();
        } else if (os.equalsIgnoreCase("Vista Premium [+$60.00]")) {
            osVistaPremium.click();
        }
        log.info("Select OS : " + os.toString());
    }

    public void selectSoftware(String software) {

        if (software.equalsIgnoreCase("Microsoft Office [+$50.00]")) {
            softwareMSOffice.click();
        } else if (software.equalsIgnoreCase("Acrobat Reader [+$10.00]")) {
            softwareAcrobatReader.click();
        } else if (software.equalsIgnoreCase("Total Commander [+$5.00]")) {
            softwareTotalCommander.click();
        }
        log.info("Select Software : " + software);

    }

    public void clickOnAddToCart() {

        pmClickOnElement(addToCartButton);
        log.info("Click On add to cart : " + addToCartButton.toString());
    }

    public void verifyProductAddedToCart(String expectedMessage) {
        pmVerifyElements(productAddedToCartMessage, expectedMessage, "product not added");
        log.info("Verify product added to cart : " + expectedMessage);
    }
}
