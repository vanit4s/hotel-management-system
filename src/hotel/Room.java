package Coursework2;

import java.util.ArrayList;
import java.util.List;

public class Room {
	
	List<Bed> beds = new ArrayList<Bed>();
	List<String> bedsAmount = new ArrayList<String>();
	
	public Room(List<String> bedsAmount, List<String> bedSize) {
		this.bedsAmount = bedsAmount;
		/*
		 * Using this to initially debug the HotelReport with randomised values
		 * of the bed size in the Bed object
		 
		 * sizes.add("Queen");
		 * sizes.add("King");
		 * sizes.add("Single");
		*/
		
		/*
		 * As long as an element exists in the arraylist,
		 * the code will execute adding more beds
		 */
		int i = 0;
		while (i < bedsAmount.size()) {
			Bed b = new Bed(bedSize.get(i));
			beds.add(b);
			//bedSize.remove(0);
			i++;
		}
			
			//Bed b = new Bed(sizes.get(0 + (int)(Math.random() * ((2 - 0) + 1))));
	}
		
	public List<Bed> getBeds() {
		return this.beds;
	}
	
	public int getBedsAmount() {
		return this.bedsAmount.size();
	}
	
	public void setBeds(int room, Bed bed) {
		beds.set(room, bed);
	}
	
}
