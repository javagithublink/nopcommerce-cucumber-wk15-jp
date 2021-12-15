package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLogInLink();
    }

    @Then("^I should verify the welcome message \"([^\"]*)\"$")
    public void iShouldVerifyTheWelcomeMessage(String expectedMessage) {

        new LoginPage().verifyWelcomeMessage(expectedMessage);
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmail(email);


    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @Then("^I should verify logout link \"([^\"]*)\"$")
    public void iShouldVerifyLogoutLink(String logoutLink) {

        new LoginPage().verifyLogOutOption(logoutLink);

    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new LoginPage().clickOnLogOutButton();
    }

    @Then("^I should verify login link \"([^\"]*)\"$")
    public void iShouldVerifyLoginLink(String loginLink) {
        new LoginPage().verifyLoginOption(loginLink);
    }

    @Then("^I should verify invalid credentials error message$")
    public void iShouldVerifyInvalidCredentialsErrorMessage() {
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect";
        new LoginPage().verifyLoginUnsuccessful(expectedMessage);
    }
}
