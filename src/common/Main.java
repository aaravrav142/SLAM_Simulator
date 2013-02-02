package common;

import simulator.*;
import slam.Slam;

import monitor.MonitorView;

import org.eclipse.swt.widgets.Display;

public class Main {

	public static void main(String[] args) {
		Display display = new Display();

		SimulatorController simulator = new SimulatorController(display, Config.MAP_SIZE);
		simulator.robot.addSensor("left sensor", 315);
		simulator.robot.addSensor("right sensor", 45);
		simulator.robot.addSensor("front sensor", 0);
		simulator.robot.addSensor("rear sensor", 180);
		
//		simulator.view.open();

		Slam slam = new Slam(200);
		MonitorView monitor = new MonitorView(display, slam);
		monitor.open();


		display.dispose();
	}
}
