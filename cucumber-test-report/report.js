$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrderFromFK.feature");
formatter.feature({
  "line": 2,
  "name": "To check that product can be added to cart on FK",
  "description": "\r\nI want to run a test to check that a product can be added to cart from FK",
  "id": "to-check-that-product-can-be-added-to-cart-on-fk",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@flipkartPositiveTest"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Add product to cart on FK",
  "description": "",
  "id": "to-check-that-product-can-be-added-to-cart-on-fk;add-product-to-cart-on-fk",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user goes to flipkart site",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "searches for a product",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "checks that the product is in stock",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "adds the product to his cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the product is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefFK.user_goes_to_flipkart_site()"
});
formatter.result({
  "duration": 36778435006,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFK.searches_for_a_product()"
});
formatter.result({
  "duration": 1653446466,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFK.checks_that_the_product_is_in_stock()"
});
formatter.result({
  "duration": 60187824233,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFK.adds_the_product_to_his_cart()"
});
formatter.result({
  "duration": 169001,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFK.the_product_is_added_to_cart()"
});
formatter.result({
  "duration": 4230166279,
  "status": "passed"
});
});