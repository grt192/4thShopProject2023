package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;


public class PusherSubsystem extends SubsystemBase{
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
