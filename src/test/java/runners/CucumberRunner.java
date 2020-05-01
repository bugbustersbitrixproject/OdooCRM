package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = true,
        tags = "",//you can use tags option to run specific test case
        plugin = {
                "html:target/default-report",//to create default report from Cucumber
                "json:target/cucumber1.json",//to create json report
                "rerun:target/rerun.txt"//to store which test case failed
        }
)


public class CucumberRunner {
}
