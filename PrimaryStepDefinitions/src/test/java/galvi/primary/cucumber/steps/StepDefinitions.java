package galvi.primary.cucumber.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @When("step 1")
    public void step1() {
        System.out.println("Primary given step 1");
    }

    @Then("step 2")
    public void step2() {
        System.out.println("Primary when step 2");
    }

    @Then("step 3")
    public void step3() {
        System.out.println("Primary then step 3");
    }
}
