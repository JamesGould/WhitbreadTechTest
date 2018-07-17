Feature: Scenario2

Scenario Outline: Check if all the three sections are displayed for the selected cheese
	Given the home screen is being displayed
	When the <categoryName> category of cheese is tapped
	Then the contents for the <categoryItems> category of cheese will be displayed
	
Examples:
	|categoryName|categoryItems|
	|first|first|
	|second|second|
	|third|third|