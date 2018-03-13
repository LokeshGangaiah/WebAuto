package steps;

import org.testng.annotations.BeforeTest;
import cucumber.api.java.Before;
import java.net.MalformedURLException;
import util.WebDriverUtil;

public class BeforeActions {
	
	@Before
	public static void setup() throws MalformedURLException {
		
		 System.out.println("----------Test Scenario Starting-------------------");      
		 WebDriverUtil.launchWebApp();
	}
}