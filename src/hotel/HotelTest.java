package Coursework2;

import java.util.ArrayList;
import java.util.List;

public class HotelTest {

	public static void main(String[] args) {
		List<String> bedsAmount = new ArrayList<String>();
		List<String> bedSize = new ArrayList<String>();
		
		/*
		 * Test data used to populate the Array Lists with data
		 * so that they can be used in creating the room and bed 
		 * objects in the Hotel class.
		 */
		
		bedsAmount.add("1");
		bedSize.add("King");
		bedsAmount.add("2");
		bedSize.add("Single");
		bedsAmount.add("1");
		bedSize.add("Queen");
		
		//					 NAME  #ROOMS  #BEDS    BED SIZE
		Hotel h = new Hotel("Royal", 2, bedsAmount, bedSize);
		
		int totalOccupancy = 0;
		
		/*
		 * Calculate the total occupancy and then display
		 * the data using the HotelReport class. 
		 */
		
		for (Room r : h.room) {
			for (Bed b : r.getBeds()) {
				totalOccupancy += (h.room.size() / r.getBedsAmount());
				
				if (bedsAmount.contains("1")) {
					totalOccupancy += 1;
				}
			}
		}
		
		HotelReport hr = new HotelReport(h);
		System.out.println("Total hotel occupancy: " + totalOccupancy);
	}
	
}
