@regression
Feature: Product Add to cart in homepage

  Background: 
    Given I have launched the application
    When I enter the correct username as "standard_user" and correct Password as "secret_sauce"
    And I click on the Login Button

	
  Scenario Outline: This scenario is adding product to cart
    And I should Add to cart Product as "<ProductName>"
    Then I should see the item number of cart be 2

    Examples: 
      | ProductName             |
      | Sauce Labs Bolt T-Shirt |
      | Sauce Labs Bike Light   |
