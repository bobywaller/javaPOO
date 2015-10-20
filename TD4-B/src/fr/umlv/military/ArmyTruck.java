package fr.umlv.military;

import java.util.ArrayList;
import java.util.List;

public class ArmyTruck implements Units {
	
	private final int speed = 10;
	private final int fire = 20;
	private int health;
	
	private final ArmyType type;
	private List<Soldier> passengers = new ArrayList<Soldier>();
	
	public ArmyTruck(ArmyType type, Soldier...soldier) {
		this.type = type;
		for(Soldier toAdd: soldier) {
			if(toAdd.getType() != this.type) {
				throw new IllegalArgumentException("You tried to add the wrong guy..");
			}
			passengers.add(toAdd);
			health += toAdd.health();
		}
	}

	@Override
	public int health() {
		return health;
	}

	public List<Soldier> getPassengers() {
		return passengers;
	}
	
	@Override
	public int speed() {
		return speed;
	}

	@Override
	public int fire() {
		return fire;
	}

	@Override
	public ArmyType getType() {
		return type;
	}
	
}
