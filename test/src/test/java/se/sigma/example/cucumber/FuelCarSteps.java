package se.sigma.example.cucumber;

import com.eviware.soapui.tools.SoapUITestCaseRunner;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class FuelCarSteps {
    private String[] properties = new String[2];

    @Given("^a car with an empty gas tank$")
    public void a_car_with_an_empty_gas_tank() {
        // Nothing to do here, it will be taken care of in the SoapUI script
    }

    @When("^you fill it with (.*) litres of fuel$")
    public void you_fill_it_with_litres_of_fuel(String addedFuel) {
        properties[0] = "addedFuel=" + addedFuel;
    }

    @Then("^the tank contains (.*) litres$")
    public void the_tank_contains_litres(String expectedFuel) throws Exception {
        properties[1] = "expectedFuel=" + expectedFuel;

        SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
        runner.setProjectFile("../soapUI/CAR-Service-soapui-project.xml");
        runner.setProjectProperties(properties);
        runner.run();
    }
}