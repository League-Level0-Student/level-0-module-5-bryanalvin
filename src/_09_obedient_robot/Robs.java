package _09_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Robs {
public static void main(String[] args) {
	Robot Draner = new Robot("batman");
	Draner.penDown();
	Draner.setSpeed(100);
	Draner.move(90);
	Draner.turn(90);
	Draner.move(90);
	Draner.turn(90);
	Draner.move(90);
	Draner.turn(90);
	Draner.move(90);
	Draner.turn(90);
}
}
