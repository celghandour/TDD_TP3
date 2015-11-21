package phare;

enum SwitchMode{
	 ON, OFF, AUTO
};
public class CarLight {
   private double intensity;      //input
   private SwitchMode switch_pos; //input
   private boolean is_on;         //output

   
   public CarLight(double li, SwitchMode sm) {
       setIntensity(li);
       switch_pos = sm;
   }
   public void setIntensity(double li) {
       intensity = li;
   } 
   public void setSwitch(SwitchMode sm) {
       switch_pos = sm;
   } 
   public boolean isOn() {
       return is_on;
   }
   
   
   // calcule is_on en fonction de intensity et switch_pos
   // FINISH ME!
   public void step() {
   	if(switch_pos == SwitchMode.ON){
   		is_on = true;
   	}
   	else if(switch_pos == SwitchMode.OFF){
   		is_on = false;
   	}
   	else if(switch_pos == SwitchMode.AUTO){
   		if(intensity <= 70){
   			is_on = true;
   		}
   		else if(intensity > 70){
   			is_on = false;
   		}
   	}
  }
   
   public void wait(CarLight cl, double n) {
   	   double t = 0.0;
   	   while (t <= n) {
   	      t = t + 0.5;
   	      cl.step();
   	   }
   	}
}