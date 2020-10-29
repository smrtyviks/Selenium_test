package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features={"src//test//java//features"}
        ,glue={"stepDefinitons","Utility"}
        ,plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
        ,tags = ("@web")

)
@Test
public class RunTest extends AbstractTestNGCucumberTests {

}