# BDD_Selenium
Instructions:
First you’ll need to setup a Java project for Maven to build. To keep the focus on Maven, make the project as simple as possible for now. Create this structure in a project folder of your choosing. Or you can just clone the Git repository on your local machine

Dependencies
https://github.com/smrtyviks/Selenium_test/blob/main/pom.xml
 Please add all the dependencies and plugins added in the POM.XML file
 I have used Cucumber-TestNG for supporting BDD framework.
 I have used TESTNG framework for setting up the Selenium Tests.
  

How to Run test:
I have created a TestNG Runner class which takes care of the execution of the Feature files in the src/test/java/features directory. Runner class i glues with the step definitions directory name.

So if you wanna run the test you just need to run the RunTest.java if you are running on your local machine.

Also you can run the maven test from terminal with below mentioned command.

mvn  test -DdefaultSuiteFiles="src/test/java/resources/TestNG.xml


Limitations:
I have setup the ChromeWebdriver for executing the test so the machine on which you are running the test should have chrome browser installed.

Highlights:

I have used Page Object model to achieve reusability and also it makes it simple to maintain the test by makin changes at one place and it gets refleted in the tests where it is referred.

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EggtimerHome{

    public static By txtStarttimer=By.id("start_a_timer");
    public static By btnGo=By.id("timergo");

}

I have used TestNG runner class to run all the feature files at once:

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

Hook:
I have implemented Hook for setup and cleanup processes before test and after test execution also it holds most commonly used functions which helps code more maintainable and tests are modularised.
https://github.com/smrtyviks/Selenium_test/blob/main/src/test/java/Utility/Hook.java

I have used TAG "@web" to show that we can use them to include or exclude tests/scenarios depending on the environment/testing need.


Improvements:

Cross Browser support
Add Data provider in the Runner class to fetch all the Feature files to be executed









