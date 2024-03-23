Feature: It contains TCs related to OrangeHRML Login page
	@Smoke
  Scenario Outline: check OrangeHRML login functinality with <Flow> user
    Given user in on OrangeHRML login page
    When enters username as <username> in the username field
    And user enters password as <password> in OrangeHRML password field
    And clicks on Login button of OrangeHRML
    Then dashboard page URL should contains <endURL> on OrangeHRML Dashboard

    Examples: 
      | Flow  | username | password | endURL               |
      | valid | Admin    | admin123 | dashboard |
       | invalid | Admin    | admin | login |
