package _99_extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {




	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot Dan = new Robot("batman");
		// 2. Set the speed to 100
		Dan.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "What color do you want?", "Whatever you desire?",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "Blue", "Red", "Black"}, 0);

		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		Dan.penDown();
		if (colorChoice == 0) {
			Dan.setPenColor(Color.blue);
		}
		if (colorChoice == 1) {
			Dan.setPenColor(Color.red);
		}
		if (colorChoice == 2) {
			Dan.setPenColor(Color.black);
		}
		if (colorChoice == 2) {
			Dan.setPenColor(Color.white);
		}
			if (colorChoice == 2) {
				Dan.setPenColor(Color.orange);
			}
				if (colorChoice == 2) {
					Dan.setPenColor(Color.pink);
				}
		// 4. Ask the use how many polygons they want to be drawn.
String Dry=JOptionPane.showInputDialog("How many polys do you want");
int Nrg=Integer.parseInt(Dry);
		// 5. Use the robot to draw the number of polygons the user requested.
for (int i = 0; i < Nrg; i++) {
	      Dan.move(90);
	      Dan.turn(360/Nrg);
}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.

	}

			}
