package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		// create a client object and use it to
		// - connect to the broker - user "sensor" as the user name
		Client sensor = new Client("sensor",Common.BROKERHOST,Common.BROKERPORT);
		sensor.connect();
		// - publish the temperature(s)
		sensor.publish("temp",Integer.toString(sn.read()));
		// - disconnect from the broker
		sensor.disconnect();

		// TODO - end

		System.out.println("Temperature device stopping ... ");

		throw new UnsupportedOperationException(TODO.method());

	}
}
