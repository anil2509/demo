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
  "line": 20,
  "name": "Add product to cart on FK and search for ps4",
  "description": "",
  "id": "to-check-that-product-can-be-added-to-cart-on-fk;add-product-to-cart-on-fk-and-search-for-ps4",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@Scenario_2"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user goes to flipkart site",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "searches for item \u003cSearch Item\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "checks that the product is in stock",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "adds the product to his cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "the product is added to cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "to-check-that-product-can-be-added-to-cart-on-fk;add-product-to-cart-on-fk-and-search-for-ps4;",
  "rows": [
    {
      "cells": [
        "Search Item"
      ],
      "line": 29,
      "id": "to-check-that-product-can-be-added-to-cart-on-fk;add-product-to-cart-on-fk-and-search-for-ps4;;1"
    },
    {
      "cells": [
        "ps4"
      ],
      "line": 30,
      "id": "to-check-that-product-can-be-added-to-cart-on-fk;add-product-to-cart-on-fk-and-search-for-ps4;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11481583937,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Add product to cart on FK and search for ps4",
  "description": "",
  "id": "to-check-that-product-can-be-added-to-cart-on-fk;add-product-to-cart-on-fk-and-search-for-ps4;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@flipkartPositiveTest"
    },
    {
      "line": 19,
      "name": "@Scenario_2"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user goes to flipkart site",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "searches for item ps4",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "checks that the product is in stock",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "adds the product to his cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "the product is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefFK.user_goes_to_flipkart_site()"
});
