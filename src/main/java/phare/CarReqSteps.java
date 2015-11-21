
package phare;
import org.jbehave.core.annotations.*;
public class CarReqSteps{
	
	@Given("a car light system")
	@Pending
	public void givenACarLightSystem(){
		 CarLight c1 = new CarLight(0.0, SwitchMode.OFF) ;
	}
	
	@When("when the switch mode is ON")
	@Pending
	public void whenWhenTheSwitchModeIsON(){
		 //TODO 
	}
	@Then("the light should be ON")
	@Pending
	public void thenTheLightShouldBeON(){
		 //TODO 
	}
}