package Coursework2;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private String name;
	private int rooms;
	List<Room> room = new ArrayList<Room>(); 
	
	/*
	 * The hotel constructor is crucial to the work of the whole program as it
	 * gathers all the necessary input to create the room and then the bed
	 * along with the bed sizes for each bed.
	 */
	public Hotel(String name, int rooms, List<String> bedsAmount, List<String> bedSize) {
		setName(name);
		setRooms(rooms);
		for (int x = 0; x < rooms; x++) {
			Room r = new Room(bedsAmount, bedSize);
			room.add(r);
		}
		
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRooms() {
		return this.rooms;
	}
	
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
}
