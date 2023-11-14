package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.XboxController;
public class Pusher{
    private Solenoid solenoid;
    private XboxController controller;
    public Pusher(Solenoid solenoid, double uptime, XboxController controller){
        this.solenoid = solenoid;
        this.controller = controller;
    } 
    public void  periodic(){
        if(controller.getLeftBumperPressed()){
            solenoid.set(true);
        }
        else{
            solenoid.set(false);
        }
    }
    
}
