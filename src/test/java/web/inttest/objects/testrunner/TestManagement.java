package web.inttest.objects.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features={"src\\features"},
        glue = {"web.inttest.objects"},
        tags = "@High")
public class TestManagement
{

}
