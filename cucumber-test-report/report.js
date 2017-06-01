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
formatter.scenarioOutline({
  "line": 6,
  "name": "Add product to cart on FK",
  "description": "",
  "id": "to-check-that-product-can-be-added-to-cart-on-fk;add-product-to-cart-on-fk",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "user goes to flipkart site",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "searches for item \u003cSearch Item\u003e",
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
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "to-check-that-product-can-be-added-to-cart-on-fk;add-product-to-cart-on-fk;",
  "rows": [
    {
      "cells": [
        "Search Item"
      ],
      "line": 15,
      "id": "to-check-that-product-can-be-added-to-cart-on-fk;add-product-to-cart-on-fk;;1"
    },
    {
      "cells": [
        "nike deo"
      ],
      "line": 16,
      "id": "to-check-that-product-can-be-added-to-cart-on-fk;add-product-to-cart-on-fk;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10848596293,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Add product to cart on FK",
  "description": "",
  "id": "to-check-that-product-can-be-added-to-cart-on-fk;add-product-to-cart-on-fk;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@flipkartPositiveTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user goes to flipkart site",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "searches for item nike deo",
  "matchedColumns": [
    0
  ],
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
  "duration": 7744313295,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nike deo",
      "offset": 18
    }
  ],
  "location": "StepDefFK.searches_for_item(String)"
});
formatter.result({
  "duration": 1602607007,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFK.checks_that_the_product_is_in_stock()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 12417225729,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFK.adds_the_product_to_his_cart()"
});
formatter.result({
  "duration": 404573859,
  "status": "passed"
});
formatter.match({
  "location": "StepDefFK.the_product_is_added_to_cart()"
});
formatter.result({
  "duration": 3483322534,
  "status": "passed"
});
});