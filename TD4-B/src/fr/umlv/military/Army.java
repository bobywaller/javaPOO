package fr.umlv.military;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Army implements Units {

	private List<Units> army = new ArrayList<Units>();
	private final Units unit;

	public Army(Units unit) {
		Objects.requireNonNull(unit);
		this.unit = unit;
	}

	public void addUnit(Units unit) {
		Objects.requireNonNull(unit);
		army.add(unit);
	}

	@Override
	public int speed() {
		return unit.speed();
	}

	@Override
	public int health() {
		return unit.health();
	}

	public int fire() {
		return unit.fire();
	}

	@Override
	public ArmyType getType() {
		return unit.getType();
	}

}
