package com.alkomprar.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "com.alkomprar.stepDefinitions",
        tags = "@registroExitoso",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
