package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;

    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;

    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement display;

    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement selectProductList;
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;



    public DesktopsPage() {
        PageFactory.initElements(driver,this);
    }
    public void verifyDesktopPage(String expectedMessage){

        pmVerifyElements(desktopsText,expectedMessage,"wrong page");
        log.info("Verify Desktop Page : " + desktopsText.toString());
    }
    public void clickOnBuildYourOwnComputer(){

        pmClickOnElement(buildYourOwnComputer);
        log.info("Click on Build your own Computer : " + buildYourOwnComputer.toString());
    }



}
