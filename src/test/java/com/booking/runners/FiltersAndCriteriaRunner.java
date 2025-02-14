package com.booking.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/stepDefinitions/filtersBooking.feature",
        glue = "com.booking.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class FiltersAndCriteriaRunner {
}
