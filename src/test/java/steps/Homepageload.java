package steps;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import actions.HomepageDoraActions;
import locators.HomepageDoraLocators;
import util.WebDriverUtil;

public class Homepageload {

	
	String expectedURL = "https://www.carsguide.com.au/buy-a-car/all-new-and-used/all-states/all-locations/all-bodytypes/all-makes";
	String actualURL = "";
	String homepageURL = "https://www.carsguide.com.au/";
	
	HomepageDoraActions homepageDoraActions = new HomepageDoraActions(); ;
	//HomepageDoraLocators homepageDoraLocators = new HomepageDoraLocators(); 
	
	/*public Homepageload() {
		this.homepageDoraActions = new HomepageDoraActions();
		PageFactory.initElements((WebDriver) WebDriverUtil.getDriver(), homepageDoraActions);
	}
	
	public WebDriver driver = (WebDriver) WebDriverUtil.getDriver();
	*/
	public WebDriver driver;
	@Given("^I open the URL on Chrome$")
	public void I_open_the_URL_on_Chrome() throws Exception {
		System.out.println("inside this");
		
        
	}

	@And("^I hit search$")
	public void I_hit_search() throws Throwable {
		System.out.println("hitsearch");
		homepageDoraActions.moresearchoptionsbtnClick();
	}

	@Then("^Dora page should be loaded$")
	public void The_Dora_page_should_be_loaded() throws Throwable {

		actualURL = driver.getCurrentUrl();
		assertTrue(actualURL.contains(expectedURL));
		
	}

}
