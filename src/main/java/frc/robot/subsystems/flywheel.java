package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.XboxController;
import static frc.robot.Constants.flywheelConstants.*;

public class flywheel extends SubsystemBase{
    private final WPI_TalonSRX wheelmotor;
    private final XboxController controller;

    public flywheel(){
        wheelmotor = new WPI_TalonSRX(WHEEL_MOTOR_ID);
        controller = new XboxController(CONTROLLER_ID);
    }
    
    public void periodic(){
        if(controller.getRightBumperPressed())
            wheelmotor.set(FLYSPEED);
        
        if(controller.getRightBumperReleased())
            wheelmotor.set(0);

    }    
}
