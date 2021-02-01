
package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Conveyor;
import frc.robot.subsystems.Wing;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.conveyorWithButton;
import frc.robot.commands.wingsWithButton;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

  private Conveyor m_Conveyor = new Conveyor();
  private Wing m_Wing = new Wing();
  private Joystick findHitoABoyfriend = new Joystick(0);


  public RobotContainer() {
    configureButtonBindings();
   }


  private void configureButtonBindings() {
    new JoystickButton(findHitoABoyfriend,1).whenHeld(new wingsWithButton(m_Wing));
    new JoystickButton(findHitoABoyfriend,2).whenHeld(new conveyorWithButton(m_Conveyor));
    // new JoystickButton(findHitoABoyfriend, 3).whenHeld(new InstantCommand(()->m_Wing.Forward()));
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {

    return null;
  }
}