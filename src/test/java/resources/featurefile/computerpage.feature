Feature: I should test computer page functionality

  Background: I am on a computer page
    Given I click on computer tab
@Smoke
@Regression
  Scenario: verify I Should Navigate To Computer Page Successfully
    When I click on computer tab
    Then I should verify computer page text "Computers"
@Sanity
@Regression
  Scenario: verify I Should Navigate To Desktops Page Successfully
    When I click on desktop link
    Then I should verify desktop page text "Desktops"
@Regression
  Scenario Outline: Verify I Should Build Your Own Computer And Add Them To Cart Successfully
    When I click on desktop link
    And I click on product name Build your own computer
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    Then I click on add to cart button
    And I verify product added message "The product has been added to your shopping cart"
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |


