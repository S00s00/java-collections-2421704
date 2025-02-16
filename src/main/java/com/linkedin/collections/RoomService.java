package com.linkedin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RoomService {

	private Collection<Room> inventory;

	public RoomService() {
		this.inventory = new LinkedHashSet<>();
	}
	
	public boolean hasRoom(Room room) {
		
	// 1. Returns a boolean that indicates if the Room Inventory contains a Room.
		return this.inventory.contains(room);
	}
	
	public Room[] asArray() {
		
	// 2. Returns all Rooms as an Array of Rooms in the **order** they were Added.
		// my solution, don't know why I chose such a difficult approach 
		Room[] rooms = new Room[this.getInventory().size()];
		List<Room> toreturn = this.inventory.stream().toList();

		for(int i = 0; i< rooms.length;i++){
			rooms[i] = toreturn.get(i);
		}

		return rooms;
		//Course solution
		//return this.inventory.toArray(Room[]::new);
	}
	
	public Collection<Room> getByType(String type){

	/*
	   3. Return a new Collection of Rooms where Room#type matches the provided String.
		  The original Room Inventory collection MUST NOT BE MODIFIED.
	*/
		// my solution
		Collection<Room> rooms = this.getInventory();
		Collection<Room> toreturn = new HashSet<>();

		for (Room r : rooms) {
			if(r.getType().equalsIgnoreCase(type))
			toreturn.add(r);
		}

		return toreturn;
		// course solution
		// Collection<Room> copy =  new HashSet<>(this.inventory);
		// copy.removeIf(r->!r.getType().equals(type));
		// return copy;
	}

	public Collection<Room> getInventory() {
		return new HashSet<>(this.inventory); 
	}

	public void createRoom(String name, String type, int capacity, double price) {
		this.inventory.add(new Room(name, type, capacity, price));
	}

	public void createRooms(Room[] rooms) {
		this.inventory.addAll(Arrays.asList(rooms));
	}

	public void removeRoom(Room room) {
		this.inventory.remove(room);
	}

}
