package actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.locator.*;
import locators.HomepageDoraLocators;
import util.WebDriverUtil;

public class HomepageDoraActions {

	HomepageDoraLocators homepageDoraLocators = new HomepageDoraLocators();

	public HomepageDoraActions() {
		this.homepageDoraLocators = new HomepageDoraLocators();
		PageFactory.initElements((WebDriver) WebDriverUtil.getDriver(), homepageDoraLocators);
	}

	// moresearchoptions
	public boolean moresearchoptionsbtnDis() {
		boolean a = false;
		try {
			a = homepageDoraLocators.moresearchoptionsbtn.isDisplayed();
			System.out.println("Element is displayed");
		} catch (NoSuchElementException e) {
			System.out.println("Element not found for moresearchoptions");
		}
		return a;
	}

	public void moresearchoptionsbtnClick() {
		try {
			System.out.println("hitsearch inside action");
			homepageDoraLocators.moresearchoptionsbtn.click();
			System.out.println("Element is clicked");
		} catch (NoSuchElementException e) {
			System.out.println("Element not found for moresearchoptions");
		}
	}

	
}
