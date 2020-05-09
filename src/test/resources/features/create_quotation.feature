Feature: Create Quotation

  As a user, I should be able to create quotations


  Background: User on login page
    Given user is on login page
    When user enters as "sales manager"

  Scenario: User should be able to create quotations
    Then user should navigates to "Sales" module
    And user should be able to click on "create" button
    Then user should enter this following information for creating new quote:
      | Customer       | Invoice Address | Delivery Address | Expiration Date | Pricelist | Payment Terms |
      | ABC LLC        | ABC LLC         | ABC LLC          | 05/25/2020      | 11000     | 15 DAYS       |
      | Ada yesilcabut | 1021 NY         | ADA LLC          | 06/30/2020      | 25000     | 30 DAYS       |




