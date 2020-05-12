package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = false,
        tags = "@quotation",//you can use tags option to run specific test case, we use some Jira ticket numbers as tag name
        plugin = {
                "html:target/default-report",//to create default report from Cucumber
                "json:target/cucumber1.json",//to create json report
                "rerun:target/rerun.txt"//to store which test case failed
        }
)


public class CucumberRunner {
}
// tags = "@quotation",
// tags ="@BO3-157",