package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	@Given("^I have (\\d+) cukes in my belly$")
	public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
		Belly belly = new Belly();
		belly.eat(cukes);
	}

	@When("^I wait (\\d+) hour$")
	public void i_wait_hour(int arg1) throws Throwable {
		Belly belly = new Belly();
		belly.wait(arg1);
	}

	@Then("^my belly should growl as (.*)$")
	public void my_belly_should_growl(String arg) throws Throwable {
		Belly belly = new Belly();
		belly.growl(arg);
	}
}
