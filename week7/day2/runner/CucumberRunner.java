package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = {"src/test/java/features"}, 
				 glue = "steps",
				 monochrome = true,
				 publish = true,
			//	 tags = "@functional" //execute only functional test scenarios
			//	 tags = "@smoke or @regression" //execute all the scenarios having @smoke or @regression
			//	 tags = "@smoke and @regression" // execute scenarios having both @smoke and @regression
				 tags = "not @regression" // all testcases except regression will be executed
				 )
public class CucumberRunner extends BaseClass{

}
