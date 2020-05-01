Feature: Create Quotation
  As a user, I should be able to create quotations

  @BO3-158 @Odoo
  Scenario: user should be able to create quotation
    Given user is on login page
    When user enters with valid credentials
    Then user should navigates to "Sales" module
    Then user should create quotation