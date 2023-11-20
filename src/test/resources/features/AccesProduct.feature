#FeatureAccessProduct

Feature: AccessProduct
    Scenario: I want to go to ebay to access the product Manually
      Given I Open Ebay
      And I Click Open Shop by category
      And I choose Electronics
      And I choose Cell Phone And SmartPhones
      And I click All Filters
      And I choose the condition
      And I click New Product
      And I choose price
      And I choose price from 20000000
      And I choose price to 24000000
      And I choose location
      And I choose detail location
      And I clilck Apply
      Then verify is filters are apply

      Scenario: I want to Access a product via Search
        Given I Open Ebay
        And typing product "lenovo"
        And change to gadget field
        And click Option
        And click search button
        And verify header contains the keyword "lenovo"





