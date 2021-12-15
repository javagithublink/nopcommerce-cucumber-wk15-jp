Feature: I able to test login functionality successfully

  Background: I click on login
    Given I click on login link
@Smoke
@Regression
  Scenario: I Should Navigate To Login Page SuccessFully
    When I click on login link
    Then I should verify the welcome message "Welcome, Please Sign In!"
@Sanity
@Regression
  Scenario:I should verify The Error Message With InValid Credentials
    When I enter email "Prime@gmail.com"
    And I enter password " "
    And I click on login button
    Then I should verify invalid credentials error message
@Regression
  Scenario: I should verify That User Should LogIn SuccessFully With Valid Credentials
    When I enter email "Prime@gmail.com"
    And I enter password "Prime123"
    And I click on login button
    Then I should verify logout link "Log out"
    Scenario: I should Verify That User Should LogOut SuccessFully
      When I enter email "Prime@gmail.com"
      And I enter password "Prime123"
      And I click on login button
      And I click on logout button
      Then I should verify login link "Log in"


