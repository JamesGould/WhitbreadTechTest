Feature: Scenario3

Scenario: Change the mode to Night Always
	Given the home screen is being displayed
	When the mode button is tapped
	And the time of day menu is opened
	And Night (always) is selected
	Then the app will be displayed in night mode