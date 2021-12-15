package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registrationSteps {
    @Given("^I click on register link$")
    public void iClickOnRegisterLink() {
        new RegisterPage().clickOnRegisterLink();
    }

    @Then("^verify I am on register page$")
    public void verifyIAmOnRegisterPage() {
        new RegisterPage().verifyRegisterText();
    }

    @When("^I click register button$")
    public void iClickRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I should verify first name is require \"([^\"]*)\"$")
    public void iShouldVerifyFirstNameIsRequire(String errorMessage)  {
        new RegisterPage().verifyTheErrorMessageFirstNameIsRequired(errorMessage);
    }

    @And("^I should verify last name is require \"([^\"]*)\"$")
    public void iShouldVerifyLastNameIsRequire(String errorMessage)  {
        new RegisterPage().verifyTheErrorMessageLastNameIsRequired(errorMessage);

    }

    @And("^I should verify email is require \"([^\"]*)\"$")
    public void iShouldVerifyEmailIsRequire(String errorMessage)  {
        new RegisterPage().verifyTheErrorMessageEmailIsRequired(errorMessage);

    }

    @And("^I should verify password is require \"([^\"]*)\"$")
    public void iShouldVerifyPasswordIsRequire(String errorMessage)  {
        new RegisterPage().verifyTheErrorMessagePasswordIsRequired(errorMessage);

    }

    @And("^I should verify confirm password is require \"([^\"]*)\"$")
    public void iShouldVerifyConfirmPasswordIsRequire(String errorMessage)  {
        new RegisterPage().verifyTheErrorMessageForConfirmPasswordIsRequired(errorMessage);

    }


    @When("^I select gender \"([^\"]*)\"$")
    public void iSelectGender(String gender)  {
       new RegisterPage().selectGender(gender);
    }

    @And("^I Enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String fName)  {
       new RegisterPage().enterFirstName(fName);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lName)  {
        new RegisterPage().enterLastName(lName);

    }

    @And("^I select birth day \"([^\"]*)\"$")
    public void iSelectBirthDay(String bDay)  {
       new RegisterPage().selectBirthDay(bDay);
    }

    @And("^I select birth month \"([^\"]*)\"$")
    public void iSelectBirthMonth(String bMonth)  {
        new RegisterPage().selectBirthMonth(bMonth);

    }

    @And("^I select birth year \"([^\"]*)\"$")
    public void iSelectBirthYear(String bYear)  {
        new RegisterPage().selectBirthYear(bYear);

    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String cPassword)  {
        new RegisterPage().enterConfirmPassword(cPassword);

    }

    @And("^I should verify registration complete \"([^\"]*)\"$")
    public void iShouldVerifyRegistrationComplete(String eMessage)  {
        new RegisterPage().verifyRegistrationComplete(eMessage);

    }
}
