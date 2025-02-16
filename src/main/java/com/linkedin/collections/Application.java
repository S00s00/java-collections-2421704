package com.linkedin.collections;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
public class Application {

	public static void main(String[] args) {
	
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room manchester = new Room("Manchester", "Suite", 5, 250.0);
		Room piccadilly = new Room("Picacadily", "Guest Room", 3, 125.0);

		Collection<Room> rooms =  List.of(cambridge, manchester,piccadilly);

		double total = getPotentialRevenue(rooms);
		System.out.println(total);
		Room[] arr = { cambridge, manchester,piccadilly};

		System.out.println("Copy of arrays with extra space: " + Arrays.toString(cloneArray(arr)));
	}
	
	// private static double getPotentialRevenue(Room room1, Room room2, Room room3) {
	// 	return room1.getRate() + room2.getRate() + room3.getRate();
	// }

	private static double getPotentialRevenue(Collection<Room> rooms){
		return rooms.stream()
		.mapToDouble(r->r.getRate())
		.sum();
	}


	private static Room[] cloneArray(Room[] arr){
		Room[] moreArr = new Room[arr.length *2]; // resizing the array 
        System.arraycopy(arr, 0, moreArr, 0, arr.length);
		return moreArr;
	}

}
