package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.XboxController;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;


public class PusherSubsystem{
    private DoubleSolenoid solenoid;
    private XboxController controller;
    public PusherSubsystem(DoubleSolenoid solenoid, XboxController controller){
        this.solenoid = solenoid;
        this.controller = controller;
    } 
    public void periodic(){
        if(controller.getLeftBumperPressed()){
            solenoid.set(kForward);
            System.out.println("kForward");
        }
        else{
            solenoid.set(kReverse);
            System.out.println("kReverse");
        }
    }
    
}
