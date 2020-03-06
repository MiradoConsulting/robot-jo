import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Hello - a robot by (your name here)
 */
public class Hello extends Robot
{
	/**
	 * run: Hello's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		 setColors(Color.pink,Color.black,Color.green); // body,gun,radar


		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			drive();			
		}
	}

	public void drive() {
		turnGunRight(360);
	}
	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
	
	   if (e.getDistance() < 100) {
           fire(3);
       } else {
           fire(1);
       }
	}
	

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		
		gtfo();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		gtfo();
	}
	
	public void gtfo() {
		turnLeft(90);
		ahead(100);

	}
	
	public void onHitRobot(HitRobotEvent e) {	
		//turnGunRight(180);
	}	
}
