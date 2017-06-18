Feature: Main page testing top bar 

Scenario: Open main page and click sign-on link 
	Given I open main page 
	When I click link sign-on 
	Then I should see login page 
	
	
Scenario: Open main page and click all links 
	Given  I open main page 
	When I click link "REGISTER" 
	And I click link "SUPPORT" 
	And I click link "CONTACT" 
	And I click link "SIGN-ON" 
	Then I should see "Sign-on: Mercury Tours" page title