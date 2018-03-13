package steps;


import cucumber.api.java.After;

public class AfterActions {

	@After
	public void tearDown() {
		 System.out.println("----------Test Scenario Completed--------------------");    
		 //driver.quit();
	}
}
