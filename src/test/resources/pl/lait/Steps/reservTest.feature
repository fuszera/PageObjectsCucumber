Feature: Reservation process 

Scenario: One way ticket reservation 
	When I open main page 
	And I click link sign-on 
	And I login as "fuszera" "123QW!@#" 
	And I choose one-way radio
	And I choose "2" passengers
	And I choose "Paris" from port
	And I choose "December" from month
	And I choose "30" from day
	And I choose "Seattle" to port
	And I choose "January" to month
	And I choose "5" to day
	Then form should be filled with data above