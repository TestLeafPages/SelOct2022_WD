package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features={"src/test/java/features"},
                 glue="steps",
                 monochrome=true,
                 publish=true,
                 //tags="@Regression" //To execute smoke testcase alone//invalid credential
                // tags="not @Regression"//To execute the testcases other than regression
                 tags="@Smoke or @Regression or @Sanity"//To execute any  testcases
                 
              )
public class CucumberRunner extends BaseClass{

}
