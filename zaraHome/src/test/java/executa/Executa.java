package executa;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
		glue = "steps",
		tags = "@tag01",
		plugin = { "pretty", "html:target/report.html" },
		dryRun = false, monochrome = true)

public class Executa {

}
