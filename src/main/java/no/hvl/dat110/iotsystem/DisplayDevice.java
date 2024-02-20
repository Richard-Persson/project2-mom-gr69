package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");

		/*
		You are required to complete the implementation of the display device such that it connects to
		the same broker as the sensor device, creates a temperature topic, subscribes to this topic and
		then receives the same number of messages as the sensor device is sending on the topic. Upon
		completion, the display device should disconnect from the broker.
		 */



		// TODO - START
		// create a client object and use it to
		Client client = new Client("display", Common.BROKERHOST, Common.BROKERPORT);


		// - connect to the broker - use "display" as the username
		client.connect();

		// - create the temperature topic on the broker
		client.createTopic(Common.TEMPTOPIC);

		// - subscribe to the topic

		client.subscribe(Common.TEMPTOPIC);
		// - receive messages on the topic


		// - unsubscribe from the topic
		client.unsubscribe(Common.TEMPTOPIC);

		// - disconnect from the broker

		client.disconnect();
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
	}
}
