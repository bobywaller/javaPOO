package fr.umlv.military;

import java.util.ArrayList;
import java.util.List;

public class ArmyTruck implements Units {

	private final int speed = 10;
	private int health;

	private final ArmyType type;
	private List<Soldier> passengers = new ArrayList<Soldier>();

	public ArmyTruck(ArmyType type, Soldier...soldier) {
		this.type = type;
		for(Soldier toAdd: soldier) {
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

	public int fire() {
		return passengers.stream()
				.filter(soldier -> this.type == soldier.getType())
				.mapToInt(s -> s.fire())
				.sum();
	}

	@Override
	public ArmyType getType() {
		return type;
	}

}
