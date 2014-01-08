package se.sigma.example.junit;

import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.junit.Test;

public class FuelCarTest {
    @Test
    public void verifyTheInputValueIsReturned() throws Exception {
        SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
        runner.setProjectFile("../soapUI/CAR-Service-soapui-project.xml");
        String[] properties = new String[2];
        properties[0] = "addedFuel=42";
        properties[1] = "expectedFuel=42";
        runner.setProjectProperties(properties);
        runner.run();
    }
}
