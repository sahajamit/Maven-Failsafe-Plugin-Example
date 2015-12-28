package com.cucumber.testng.examples;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests.
 */
@CucumberOptions(features = "src/test/resources/com.cucumber.testng.examples/date_calculator1.feature", format = { "pretty",
        "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" })
public class RunCukesByCompositionGrp1_Test1 extends BaseTestCase {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This is beforeSuite");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("This is beforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is beforeMethod");
    }
    /**
     * Create one test method that will be invoked by TestNG and invoke the
     * Cucumber runner within that method.
     */
    @Test(groups = "examples-testng", description = "Example of using TestNGCucumberRunner to invoke Cucumber")
    public void runCukes() {
        new TestNGCucumberRunner(getClass()).runCukes();
    }
}
