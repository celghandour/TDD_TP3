package phare;
import org.jbehave.core.annotations.*;
import org.junit.Assert;
public class CarReqSteps{
	public CarLight cl;
	
	
	@Given("a car light system")
	public void givenACarLightSystem(){
		cl = new CarLight(0.0, SwitchMode.OFF);
		
	}
	@When("the switch mode is ON")
	public void whenTheSwitchModeIsON(){
		cl.setSwitch(SwitchMode.ON);
		 cl.step(); 
	}
	
	@Then("the light should be ON")
	public void thenTheLightShouldBeON(){
		 Assert.assertTrue(cl.isOn()); 
	}
	
	

	
	@When("the switch mode is OFF")
	public void whenTheSwitchModeIsOFF(){
		cl.setSwitch(SwitchMode.OFF);
		 cl.step(); 
	}
	
	@Then("the light should be OFF")
	public void thenTheLightShouldBeOFF(){
		 Assert.assertTrue(!cl.isOn()); 
	}
	
	

	
	@When("the switch mode is AUTO")
	public void whenTheSwitchModeIsAUTO31(){
		 cl.setSwitch(SwitchMode.AUTO); 
	}
	@When("the light intensity is 65%")
	public void whenTheLightIntensityIs65_31(){
		 cl.setIntensity(65.0); 
		 cl.step();
	}
	@Then("the light should be ON in auto")
	public void thenTheLightShouldBeON31(){
		 Assert.assertTrue(cl.isOn());
	}


	
	

	@When("the switch mode is AUTO 003.2")
	public void whenTheSwitchModeIsAUTO_32(){
		 cl.setSwitch(SwitchMode.AUTO); 
	}
	@When("the light intensity is 75%")
	public void whenTheLightIntensityIs75_32(){
		cl.setIntensity(75.0); 
		 cl.step();
	}

	@Then("the light should be OFF 003.2")
	public void thenTheLightShouldBeOFF32(){
		 Assert.assertTrue(!cl.isOn());
	}
	
	@When("the light intensity is 65% 003.2")
	public void whenTheLightIntensityIs65_32(){
		cl.setIntensity(65.0); 
		 cl.step();
	}
		
	@Then("the light should be ON 003.2")
	public void thenTheLightShouldBeON_32(){
		Assert.assertTrue(cl.isOn());
	}
	
	
	

	
	@When("the switch mode is AUTO 003.3")
	public void whenTheSwitchIsModeIsAUTO_33(){
		 cl.setSwitch(SwitchMode.AUTO); 
	}
	@When("the light intensity is 75% 003.3")
	public void whenTheLightIntensityIs65_33(){
		cl.setIntensity(75.0); 
		cl.step();
	}
	@Then("the light is OFF 003.3")
	public void thenTheLightIsOFF_33(){
		Assert.assertTrue(!cl.isOn()); 
	}
	
	@When("light intensity is 55% 003.3")
	public void thenLightIntensityIs55_33(){
		cl.setIntensity(55.0); 
		cl.step();
	}
	@When("last for 2s 003.3")
	public void thenLastFor2s_33(){
		cl.wait(cl, 2.0);
	}
	
	@Then("the light should be ON 003.3")
	public void thenTheLightShouldBeON_33(){
		Assert.assertTrue(cl.isOn()); 
	}
	
	
	
	@When("the switch mode is AUTO 003.4")
	public void whenTheSwitchIsModeIsAUTO_34(){
		 cl.setSwitch(SwitchMode.AUTO); 
	}
	@When("the light intensity is 65% 003.4")
	public void whenTheLightIntensityIs65_34(){
		cl.setIntensity(65.0); 
		cl.step();
	}
	@Then("the light should be ON 003.4")
	public void thenTheLightShouldBeON_34(){
		Assert.assertTrue(cl.isOn()); 
	}
	@When("the light intensity is 75% 003.4")
	public void whenTheLightIntensityIs75_34(){
		cl.setIntensity(75.0); 
		cl.step();
	}
	@When("last for 3s 003.4")
	public void whenLastFor3s_34(){
		cl.wait(cl, 3.0);
	}
	@Then("the light should be OFF 003.4")
	public void thenTheLightShouldBeOFF_34(){
		Assert.assertTrue(!cl.isOn());
	}
	
	
}