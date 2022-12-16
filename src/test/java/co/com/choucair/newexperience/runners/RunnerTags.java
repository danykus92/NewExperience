package co.com.choucair.newexperience.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/newExperience.feature",
        glue = "co.com.choucair.newexperience.stepdefinitions",
        tags = "@Cases",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}