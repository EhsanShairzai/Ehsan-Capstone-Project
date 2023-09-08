package tek.sdet.framework.runner​​​​​​​;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions

      (tags = "@Unit", // Specifies which scenario(s) to run using the given tag
      features = ("classpath:features"), // Specifies the path to the feature files
      glue = "tek.sdet.framework", // Specifies the package containing step definition classes
      dryRun = false, // If set to true, it prints the steps without executing them; if false, it runs the tests
      plugin = { // Specifies the plugins to generate different types of reports

              "pretty",
              "html:target/htmlReports/cucumber-pretty.html",
              "json:target/jsonReports/cucumber.json"

      },

      snippets = CAMELCASE, // Specifies the naming convention for step definitions snippets
      monochrome = true // Displays the console output in a more readable format

)

public class TestRunner {

}
