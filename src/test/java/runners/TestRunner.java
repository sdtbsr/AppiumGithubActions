package runners;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase;

@CucumberOptions(features = "src/test/resources/features",
glue = {"step_defs"},
plugin = {"pretty","html:target/cucumber-html-report.html"})
public class TestRunner extends TestBase {
}
