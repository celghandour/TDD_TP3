package phare;
public class CarLight {
    private double intensity;      //input
    private SwitchMode switch_pos; //input
    private boolean is_on;         //output

    public CarLight(double li, SwitchMode sm) {
        setIntensity(li);
        switch_pos = sm;
    }
    public void setIntensity(double li) {
        setIntensity(li);
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
   }
}