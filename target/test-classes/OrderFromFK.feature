@flipkartPositiveTest
Feature: To check that product can be added to cart on FK

I want to run a test to check that a product can be added to cart from FK

@Scenario_1
Scenario Outline: Add product to cart on FK and search for nike deo

Given user goes to flipkart site
And searches for item <Search Item>
And checks that the product is in stock
And adds the product to his cart
Then the product is added to cart  

Examples:
|Search Item|
|nike deo|

@Scenario_2
Scenario Outline: Add product to cart on FK and search for ps4

Given user goes to flipkart site
And searches for item <Search Item>
And checks that the product is in stock
And adds the product to his cart
Then the product is added to cart  

Examples:
|Search Item|
|ps4|