/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Conveyor;

/**
 * An example command that uses an example subsystem.
 */
public class conveyorWithButton extends CommandBase {
  private Conveyor m_subsystem = new Conveyor();

  /**
   * Creates a new ExampleCommand.
   *
   * @param m_Conveyor The subsystem used by this command.
   */
  public conveyorWithButton(Conveyor m_Conveyor) {
    this.m_subsystem =m_Conveyor;
    addRequirements(m_Conveyor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_subsystem.Forward();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.Stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
