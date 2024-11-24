@assignment


Feature: FitPeo Assigment

Scenario Outline: Login to FitPeo ,adjust revenue calculator value and validate Total Recurring Reimbursement
	Given Navigate to FitPeo website
	Then Navigate to Revenue calculator page
	Then Scroll page till slider is visible
	Then Adjust the value of slider to <value>
	Then set input value as <amount>
	Then Select checkboxes
	Then Validate the total recurring reimbursment amount in the header of page
	Then Close the application
	
	Examples:
	|value|amount|
	|820  | 560  |
	
	
