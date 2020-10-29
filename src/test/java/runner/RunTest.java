package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features={"src//test//java//features"}
        ,glue={"stepDefinitons","Utility"}
        ,plugin= {"pretty","html:target/cucumber-reports/advanced-reports/cucumber-pretty.html", "json:target/cucumber-reports/cucumber.json" }
        ,tags = ("@web")

)
@Test
public class RunTest extends AbstractTestNGCucumberTests {

}