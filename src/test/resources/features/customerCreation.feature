@customer_creation
Feature:Customer creation

  As a user I should be able to create new customer

  Background:
    Given user is on login page
    When user enters with valid credentials
    And user should navigates to "Sales" module
    Then user should navigates to "Customers" submodule

  Scenario: Access Customers Page
    And user should verify page title is "Customers"


  Scenario Outline: Create new Individual Customer
    And user should create new customer with following info
      | Name   | Street   | Street2   | City   | State   | Zip   | Country   | TIN   | Tags   | Job Position   | Phone   | Mobile   | Email   | Website   | Title   | Language   |
      | <Name> | <Street> | <Street2> | <City> | <State> | <Zip> | <Country> | <TIN> | <Tags> | <Job Position> | <Phone> | <Mobile> | <Email> | <Website> | <Title> | <Language> |
    Examples:
      | Name         | Street  | Street2 | City  | State | Zip   | Country | TIN    | Tags | Job Position       | Phone      | Mobile     | Email                  | Website       | Title  | Language |
      | Arzu Gonul   | 1234 nw | 24th st | Doral | FL    | 33004 | USA     | 987456 | 8585 | Purchasing Manager | 9876543211 | 3639875214 | arzugonul@blabla.com   | www.nike.com  | Senior | English  |
      | Ahmet Furkan | 8754 nw | 29th st | Miami | FL    | 33009 | USA     | 987487 | 8574 | CEO                | 9876543278 | 3635655214 | ahmetfurkan@blabla.com | www.honda.com | Senior | English  |