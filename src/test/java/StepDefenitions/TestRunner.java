package StepDefenitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Qbuser/eclipse-workspace/SOMSmokeTestcases/Features",glue={"StepDefenitions"},
plugin = {"pretty","html:target/HtmlReports/somreports.html"})
//plugin = {"pretty","json:target/JSONReports/reports.json"})
//plugin = {"pretty","junit:target/Junitreports/junit.xml"})
public class TestRunner {

}
