package fb;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Hariprakash\\eclipse work\\fb\\target\\fb.feature"},
extraGlue= {"fb.steps"},tags="@smoke",
plugin={"pretty","html:\\target\\reports.html"})
public class TestRunner {
 
}
