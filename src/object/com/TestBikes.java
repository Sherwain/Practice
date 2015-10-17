package object.com;

import object.com.Bicycle;
import object.com.MountainBike;
import object.com.RoadBike;;

public class TestBikes {
	public static void main(String[] args) {
		Bicycle bike01, bike02, bike03;

		bike01 = new Bicycle(20, 10, 1, 15, 67);
		bike02 = new MountainBike(20, 10, 5, "Dual", 13, 34);
		bike03 = new RoadBike(40, 20, 8, 23, 57, 98);

		
		bike01.printDescription();
		bike02.printDescription();
		bike03.printDescription();
	}
}	
