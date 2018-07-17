package screens;

import java.util.Locale.Category;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class homeScreen extends screenobject {

	@AndroidFindBy(id="com.support.android.designlibdemo:id/toolbar") public AndroidElement homeScreenMenuCheese;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.TextView") public AndroidElement category1;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView") public AndroidElement category2;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.TextView") public AndroidElement category3;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]") public AndroidElement category1Item1;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]") public AndroidElement category2Item1;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]") public AndroidElement category3Item1;
	
	@AndroidFindBy(accessibility="More options") public AndroidElement MenuButton;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView") public AndroidElement NightModeMenu;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RadioButton") public AndroidElement NightModeAlwaysButton;
	
	@AndroidFindBy(accessibility="More options") public AndroidElement NightModeOn;	

	public Boolean exists() {
		return checkElementDisplayed(waitUntillTappable(homeScreenMenuCheese));
	}
	
	public void firstTapped() {
		tap_button(category1);
	}
	
	public Boolean firstCategoryDisplayed() {
		return checkElementDisplayed(waitUntillTappable(category1Item1));
	}

	public void secondTapped() {
		tap_button(category2);
	}
	
	public Boolean secondCategoryDisplayed() {
		return checkElementDisplayed(waitUntillTappable(category2Item1));
	}
	public void thirdTapped() {
		tap_button(category3);
	}
	
	public Boolean thirdCategoryDisplayed() {
		return checkElementDisplayed(waitUntillTappable(category3Item1));
	}
	
	public void modeTapped() {
		tap_button(MenuButton);
	}

	public void timeOfDayMenu() {
		tap_button(NightModeMenu);
	}
	
	public void nightAlwaysTapped() {
		tap_button(NightModeAlwaysButton);
	}
	
	public Boolean nightModeOn() {
		// This one needs to check that the night mode has been enabled, can be done by checking the selected/enabled state of the button
		return checkElementDisplayed(waitUntillTappable(NightModeOn));
	}
	
}