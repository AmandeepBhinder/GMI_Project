package com.GMI.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class CucumberRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/default-cucumber-reports",
                    "json:target/json-reports/cucumber.json",
                    "junit:target/xml-report/cucumber.xml"},
            features = "src/test/resources/features",
            glue = "com/GMI/step_definitions",
            tags = "",
            dryRun = true
    )
    public class Runner {

    }
}
