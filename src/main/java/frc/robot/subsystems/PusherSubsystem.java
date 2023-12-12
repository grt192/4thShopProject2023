package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.XboxController;
public class PusherSubsystem{
    private DoubleSolenoid solenoid;
    private XboxController controller;
    public PusherSubsystem(DoubleSolenoid solenoid, XboxController controller){
        this.solenoid = solenoid;
        this.controller = controller;
    } 
    public void  periodic(){
        if(controller.getLeftBumperPressed()){
            solenoid.set(DoubleSolenoid.Value.valueOf("kReverse"));
        }
        else{
            solenoid.set(DoubleSolenoid.Value.valueOf("kForward"));
        }
    }
    
}
