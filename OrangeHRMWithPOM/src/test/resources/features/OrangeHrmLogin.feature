Feature: This feature file is create to cover testing of OrangeHRM login functionality

  #Scenario: Login into OrangeHrm with valid data
  #Given user is on OrangeHrm login page
  #When user enters a valid username as "Admin"
  #And user enters a valid password as "admin123"
  #And user clicks on Login button
  #Then user should be able to navigate to Home Page of OrangeHrm having "dashboard" in URL
  #And close the browser for OrangeHRM
  Scenario Outline: Test login functionality of OrangeHRM
    Given user is on OrangeHrm login page
    When user enters a valid username as <username>
    And user enters a valid password as <passsword>
    And user clicks on Login button
    Then user should be able to navigate to Home Page of OrangeHrm having <urlKey> in URL
    And close the browser for OrangeHRM

    Examples: 
      | username | passsword | urlKey    |
      | Admin    | admin123  | dashboard |
      | Admin    | admin     | auth      |
      | ""       | ""        | auth      |
