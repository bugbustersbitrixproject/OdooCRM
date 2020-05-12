@quotation
Feature:  Quotation Table

  As a user, I should be able to see quotations table


  Background: User on login page
    Given user is on login page
    When user enters as "sales manager"

  Scenario: User should be able to see quotations table
    Then user should navigates to "Sales" module
    Then user able to click first column of the table
    And user able to see this title on Quotation table
      | Quotation Number |
      | Quotation Date   |
      | Customer         |
      | Salesperson      |
      | Total            |
      | Status           |
