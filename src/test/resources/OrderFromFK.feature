@flipkartPositiveTest
Feature: To check that product can be added to cart on FK

I want to run a test to check that a product can be added to cart from FK

Scenario: Add product to cart on FK

Given user goes to flipkart site
And searches for a product
And checks that the product is in stock
And adds the product to his cart
Then the product is added to cart  