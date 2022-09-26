package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;

public class DriveSubsystem extends SubsystemBase {

    private final MotorController m_frontRight = new Spark(0);
    private final MotorController m_rearRight  = new Spark(1);
    private final MotorController m_rearLeft = new Spark(2);
    private final MotorController m_frontLeft = new Spark(3);

    private final MotorControllerGroup leftMotor = new MotorControllerGroup(m_frontLeft, m_rearLeft);
    private final MotorControllerGroup rightMotor = new MotorControllerGroup(m_frontRight, m_rearRight);

    private final DifferentialDrive robotDrive = new DifferentialDrive(leftMotor, rightMotor);

    /**
     * This method moves the robot using the DifferentialDrive by the given x and y
     * @param moveAmount the amount the robot will move
     * @param rotation   the amount the robot will rotate
     */
    public void move(double moveAmount, double rotation) {
        robotDrive.arcadeDrive(moveAmount, rotation);
    }

}
