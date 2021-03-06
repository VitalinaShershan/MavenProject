package com.hrms.TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",// need to give a path for our feature files
        glue="com/hrms/stepdefenitions", // we need to glue our step definitions - implementation
        //dryRun = true, // when set as true, will run over the feature steps and reveal unimplemented steps in console
        dryRun = false ,// when set as "true",will run over the feature steps and reveal unimplemented
        tags={"@pim"},//adding tag
        strict = false,//when set as true, will fail the execution when unindefined step
        plugin = {"pretty",//will print exectuted steps onside console
                "html:target/cucumber-default-reports",//generates default html report
                "rerun:target/FailedTests.txt", //generates a txt file with failed tests only
                "json:target/cucumber.json"

        }
)
public class TestRunner {



}
