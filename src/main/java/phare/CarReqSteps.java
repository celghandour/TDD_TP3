
package phare;
import org.jbehave.core.annotations.*;
import org.junit.Assert;
public class CarReqSteps{
	CarLight c1 ;
	
	@Given("a car light system")

	public void givenACarLightSystem(){
		   c1 = new CarLight(0.0, SwitchMode.OFF) ;
	}
	
	@When("when the switch mode is ON")
	public void whenWhenTheSwitchModeIsON(){
		c1.setSwitch(SwitchMode.ON);
		c1.step();
	}
	@Then("the light should be ON")
	public void thenTheLightShouldBeON(){
		
		Assert.assertTrue(c1.isOn());
		
	}

	
	
	
}