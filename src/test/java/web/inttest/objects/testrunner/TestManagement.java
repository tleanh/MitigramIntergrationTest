package web.inttest.objects.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
If you want to start a feature test, e.g. login.feature, replace "src\features"
by "src\features\login.feature". Otherwise, all test features are selected to run.
If you want select a group of test cases that having the same tag, change the value
og tags. Remove the tags if you want to run all test cases from feature files.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features={"src\\features"},
        glue = {"web.inttest.objects"},
        tags = "@High")
public class TestManagement
{

}
