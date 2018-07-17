package steps;

import java.net.MalformedURLException;

import util.AppiumUtil;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.homeScreen;

import static org.junit.Assert.assertTrue;

public class homeSteps extends AppiumUtil {
	
	@Given("^the home screen is being displayed$")
	public void start_app() throws MalformedURLException
	{
		startApp();
	}

	@Then("^all three categories of cheese will be displayed$")
	public void homeScreenIsDisplayed()
	{
		homeScreen homescreen = new homeScreen();
		homescreen.exists();
	}

	@When("^the first category of cheese is tapped$")
	public void firstCategoryTapped()
	{
		homeScreen homescreen = new homeScreen();
		homescreen.firstTapped();
	}
	
	@Then("^the contents for the first category of cheese will be displayed$")
	public void firstCategoryDisplayed()
	{
		homeScreen homescreen = new homeScreen();
		homescreen.firstCategoryDisplayed();
	}
	
	@When("^the second category of cheese is tapped$")
	public void secondCategoryTapped()
	{
		homeScreen homescreen = new homeScreen();
		homescreen.secondTapped();
	}
	
	@Then("^the contents for the second category of cheese will be displayed$")
	public void secondCategoryDisplayed()
	{
		homeScreen homescreen = new homeScreen();
		homescreen.secondCategoryDisplayed();
	}
	@When("^the third category of cheese is tapped$")
	public void thirdCategoryTapped()
	{
		homeScreen homescreen = new homeScreen();
		homescreen.thirdTapped();
	}
	
	@Then("^the contents for the third category of cheese will be displayed$")
	public void thirdCategoryDisplayed()
	{
		homeScreen homescreen = new homeScreen();
		homescreen.thirdCategoryDisplayed();
	}
	
	@When("^the mode button is tapped$")
	public void modeButtonTapped()
	{
		homeScreen homescreen = new homeScreen();
		homescreen.modeTapped();
	}
	
	@When("^the time of day menu is opened$")
	public void timeOfDayMenuTapped()
	{
		homeScreen homescreen = new homeScreen();
		homescreen.timeOfDayMenu();
	}
	
	@When("^Night \\(always\\) is selected$")
	public void nightModeSelected()
	{
		homeScreen homescreen = new homeScreen();
		homescreen.nightAlwaysTapped();
	}
	
	@Then("^the app will be displayed in night mode$")
	public void closeAppDownStuff5()
	{
		homeScreen homescreen = new homeScreen();
		homescreen.nightModeOn();
	}

	@After
	public void closeAppDown(){
		if(driver != null && driver.getSessionId() != null)
		{
			driver.closeApp();
			driver.quit();
		}
	}
	
}