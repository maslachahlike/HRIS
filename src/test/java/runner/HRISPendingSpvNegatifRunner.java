package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = "src/test/resources/features/HRISPendingSPVNegatifTest.feature", glue = "definitions.RequestStaff")
public class HRISPendingSpvNegatifRunner extends AbstractTestNGCucumberTests {

}
