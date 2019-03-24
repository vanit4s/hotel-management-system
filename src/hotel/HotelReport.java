package Coursework2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HotelReport {

	public HotelReport(Hotel h) {
		print(h);
	}
	
	public void print(Hotel h) {
		
		System.out.format("Hotel name:\t\t%s %nAmount of rooms:\t%d %n%n", h.getName(), h.getRooms());
		
		/*
		 * Declaring a count variable since all of the looping
		 * is done by a for each statement
		 */
		int roomCount = 1;
		int bedCount = 1;
		List<String> list = new ArrayList<String>();
		for (Room r : h.room) {		
			System.out.println("Room " + roomCount + ":");
			for (Bed b : r.getBeds()) {
				/*
				 * This check is done so that the report is neatly displayed.
				 * There is no need to display the number of the bed if there only
				 * 
				 * If there is only one bed, display - Bed size: Size
				 * else
				 * If there is more than one bed, display - Bed #: Size
				 */
				if (r.getBedsAmount() <= 1) {
					System.out.print("Bed size: ");
					System.out.println(b.getSize());
				} else {
					System.out.print("Bed " + bedCount + ": ");
					System.out.println(b.getSize());
					if (bedCount == r.getBedsAmount()) {
						bedCount = 1;
					} else {
						bedCount += 1;
					}
				}

			}
		roomCount += 1;
		System.out.println();
		}
	}
	
}
