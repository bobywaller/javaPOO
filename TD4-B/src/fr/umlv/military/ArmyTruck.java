package fr.umlv.military;

import java.util.ArrayList;
import java.util.List;

public class ArmyTruck {
	
	private final int speed = 10;
	private final int fire = 20;
	private int health;
	private List<Soldier> passengers = new ArrayList<Soldier>();
	
	public ArmyTruck(Soldier...soldier) {
		for(Soldier toAdd: soldier) {
			passengers.add(toAdd);
			health += toAdd.health();
		}
	}

	public int getHealth() {
		return health;
	}

	public List<Soldier> getPassengers() {
		return passengers;
	}
	
	public int getSpeed() {
		return speed;
	}

	public int getFire() {
		return fire;
	}
	
}
