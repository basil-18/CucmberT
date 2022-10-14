Feature: To validate Search functinality of amazon application

  Scenario: To validate Searchbox with product name
    Given user need to be in amazon homepage
    When user should enter product name in searchbox
      | Smart Watch | iphone     |
      | Shoe        | tshirt     |
      | camera      | mac laptop |
    And user should click search button
    Then user will navigate to the product page
