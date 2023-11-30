package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.XboxController;

public class flywheel extends SubsystemBase{
    private final WPI_TalonSRX wheelmotor;
    private final XboxController controller;

    public flywheel(){
        wheelmotor = new WPI_TalonSRX(0);
        controller = new XboxController(0);
    }
    

    public void periodic(){
        if(controller.getRightBumperPressed())
            wheelmotor.set(0.5);
        
        if(controller.getRightBumperReleased())
            wheelmotor.set(0);

    }    
}
