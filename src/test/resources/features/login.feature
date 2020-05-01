Feature: Login
	As a user, I should be able to login application


	@BO3-157
	Scenario: Login function
		Given user is on login page
		When user enters with valid credentials
		Then user should see main page