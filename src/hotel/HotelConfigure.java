package Coursework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelConfigure {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String name = "";
		int rooms = 0;
		int beds = 0;
		List<String> bedsAmount = new ArrayList<String>();
		List<String> bedSize = new ArrayList<String>();
		
		/* 
		 * This is where the whole user input process is taken care of.
		 * There is some basic validation on the variables so that
		 * we can continue asking for a specific value over and over
		 * if it is incorrect.
		 */
		
		System.out.println("Enter the name of the hotel:");
		name = s.nextLine();
		while (name.length() > 30) {
			System.out.println("Enter the name of the hotel:");
			name = s.nextLine();
		}
		
		System.out.println("Enter the number of rooms:");
		rooms = s.nextInt();
		while (rooms < 0) {
			System.out.println("Enter the number of rooms:");
			rooms = s.nextInt();
		}
		
		for (int i = 0; i < rooms; i++) {
			System.out.println("Enter the number of beds for Room " + (i + 1) + "(maximum of 2):");
			beds = s.nextInt();
			bedsAmount.add(Integer.toString(beds));
			while (beds > 2) {
				System.out.println("Enter the number of beds for Room " + (i + 1) + "(maximum of 2):");
				beds = s.nextInt();
				bedsAmount.add(Integer.toString(beds));
			}
			
			/*
			 * The hotel accepts 3 types of bed - if the user
			 * chooses a single bed then it must be either a Queen or a King size.
			 * If the user chooses two beds in the room, they will only
			 * be able to choose a single bed.
			 */
			
			if (beds > 1) {
				System.out.println("Available sizes - Single");
			} else {
				System.out.println("Available sizes - Queen, King");
			}
			
			System.out.println("Enter the bed size(s):");
			bedSize.add(s.next());
			beds = 0;
		}
		
		Hotel h = new Hotel(name, rooms, bedsAmount, bedSize);
		HotelReport hr = new HotelReport(h);
		
		s.close();
	}
	
}