package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.BuildYourOwnComputerPage;
import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.DesktopsPage;
import com.nopcommerce.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputerPageSteps {
    @Given("^I click on computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerTab();
    }

    @Then("^I should verify computer page text \"([^\"]*)\"$")
    public void iShouldVerifyComputerPageText(String com)  {
       new ComputerPage().verifyComputerPage(com);
    }

    @When("^I click on desktop link$")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktop();
    }

    @Then("^I should verify desktop page text \"([^\"]*)\"$")
    public void iShouldVerifyDesktopPageText(String dpText)  {
       new DesktopsPage().verifyDesktopPage(dpText);
    }

    @And("^I click on product name Build your own computer$")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildYourOwnComputer();
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor)  {
       new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^I select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram)  {
       new BuildYourOwnComputerPage().selectRAM(ram);
    }

    @And("^I select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String hdd)  {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os)  {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software)  {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @Then("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @And("^I verify product added message \"([^\"]*)\"$")
    public void iVerifyProductAddedMessage(String eMessage)  {
        new BuildYourOwnComputerPage().verifyProductAddedToCart(eMessage);
    }
}
