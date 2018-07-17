package screens;

import org.openqa.selenium.support.PageFactory;

import util.AppiumUtil;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class screenobject extends AppiumUtil {

	public screenobject() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
}
