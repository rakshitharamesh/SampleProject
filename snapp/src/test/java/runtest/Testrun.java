package runtest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber .class)
@CucumberOptions(features="TestSample",glue="testrun",plugin= {"json:target/cucumber.json"})
public class Testrun {

}
