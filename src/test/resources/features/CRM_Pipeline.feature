Feature: Create pipeline


  Scenario: User checks the titles and toggle menu
    Given user is on login page
    When user enters with valid credentials
    Then user navigates to 'CRM' page Pipeline Modules
    And user verifies that page subTitle is 'Pipeline'
    And user verifies that page Title is 'Pipeline - Odoo'

    Then user verifies that toggle setting is enabled
    And user verifies that dropdown-toggle contains following:
      | Fold            |
      | Edit Stage      |
      | Delete          |
      | Archive Records |
      | Restore Records |



