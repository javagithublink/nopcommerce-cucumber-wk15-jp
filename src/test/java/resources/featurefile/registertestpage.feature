Feature: I should test register functionality successfully

  Background: I am on register page
    Given I click on register link
@Smoke
@Regression
  Scenario: verify I Should Navigate To Register Page Successfully
    When I click on register link
    Then verify I am on register page
@Sanity
@Regression
  Scenario: I should verify That FirstName LastName Email Password And ConfirmPassword Fields Are Mandatory
    When I click register button
    Then I should verify first name is require "First name is required."
    And I should verify last name is require "Last name is required."
    And I should verify email is require "Email is required."
    And I should verify password is require "Password is required."
    And I should verify confirm password is require "Password is required."
@Regression
  Scenario: I should Verify That User Should Create Account Successfully
    When I select gender "Female"
    And I Enter first name "Mehul"
    And I enter last name "Patel"
    And I select birth day "1"
    And I select birth month "1"
    And I select birth year "1980"
    And I enter email "Prime@gmail.com"
    And I enter password "Prime123"
    And I enter confirm password "Prime123"
    Then I click register button
    And I should verify registration complete "Your registration completed"



