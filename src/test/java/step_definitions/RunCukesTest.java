package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	dryRun = true,
	strict = true,
	features = "src/test/resources/features/",
	glue = "step_definitions",	
	monochrome = false,
	plugin = {
	"pretty",
	"html:target/cucumber",
	"json:results/cucumber.json",
	"junit:results/cucumber.xml"
	}
)
public class RunCukesTest{
	
}