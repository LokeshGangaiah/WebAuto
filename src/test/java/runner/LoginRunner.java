package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/java/feature"},
                 glue={"steps"},
                 monochrome = true,
                 tags = {"@MYtest"})

public class LoginRunner extends AbstractTestNGCucumberTests{

}

