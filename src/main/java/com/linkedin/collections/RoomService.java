package com.linkedin.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class RoomService {

	// 1. Declare a Collection to store Room Inventory
	Collection<Room> RoomInventory ;
	public RoomService() {
		
	// 2. Initialize Collection and assign it to the Room Inventory
		RoomInventory = new HashSet<>();
	}

	public Collection<Room> getInventory(){
		
	// 3. Return the Room Inventory
		
		return this.RoomInventory;
		
		// to ensure that inventory is immutable use
		// return new HashSet<>(this.RoomInventory);
	}
	
	public void createRoom(String name, String type, int capacity, double rate) {
	
	// 4. Add a new Room to the Room Inventory using the provided parameters
		this.RoomInventory.add(new Room(name, type,capacity,rate));
	}

	public void createRooms(Room[] rooms) {
	
	// 5. Add the Rooms provided in the Array to the Room Inventory
		this.RoomInventory.addAll(List.of(rooms));
	}
	
	public void removeRoom(Room room) {
		
	// 6. Remove the provided Room from the Room Inventory
		if(RoomInventory.contains(room))
		RoomInventory.remove(room);
	}
	
}
