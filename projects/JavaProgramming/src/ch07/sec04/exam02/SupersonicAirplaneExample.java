package ch07.sec04.exam02;

import ch07.sec04.exam02.SupersonicAirplane.*;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sap = new SupersonicAirplane();
		sap.takeOff();
		sap.fly();
		sap.flyMode = FlyMode.SUPERSONIC;
		sap.fly();
		sap.flyMode = FlyMode.SUPERSONIC;
		sap.fly();
		sap.land();
	}

}
