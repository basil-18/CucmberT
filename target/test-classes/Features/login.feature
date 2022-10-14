Feature: To validate login functionality of Fb application

  Background: 
    Given user need to be in login page

  Scenario Outline: To validate login with invalid username and invalid password
    When user should enter invalid "<username>" and invalid "<password>"
    And user should click login button
    Then user will navigate to invalid credential page

    Examples: 
      | username     | password |
      | java@123     | java     |
      | selenium@123 | selenium |
      | Greens@123   | greens   |

  Scenario: To validate login with empty username and empty password
    When user clicks login button
    Then user will redirect to invalid credential page
