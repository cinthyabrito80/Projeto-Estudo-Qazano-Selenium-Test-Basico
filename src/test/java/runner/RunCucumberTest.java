package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        tags = "~@ignore",
        glue = {"steps"}
)
public class RunCucumberTest {
}
