@flipkartPositiveTest
Feature: To check that product can be added to cart on FK

I want to run a test to check that a product can be added to cart from FK

Scenario Outline: Add product to cart on FK

Given user goes to flipkart site
And searches for item <Search Item>
And checks that the product is in stock
And adds the product to his cart
Then the product is added to cart  

Examples:
|Search Item|
|nike deo|
|ps4|