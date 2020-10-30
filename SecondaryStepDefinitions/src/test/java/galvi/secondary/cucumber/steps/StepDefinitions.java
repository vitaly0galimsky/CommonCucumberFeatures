package galvi.secondary.cucumber.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StepDefinitions {
    private static final Logger LOG = LoggerFactory.getLogger(StepDefinitions.class);

    @When("step 1")
    public void step1() {
        LOG.info("Secondary given step 1");
    }

    @Then("step 2")
    public void step2() {
        LOG.info("Secondary when step 2");
    }
}
