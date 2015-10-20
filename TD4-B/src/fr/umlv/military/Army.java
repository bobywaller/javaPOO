package fr.umlv.military;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Army implements Units {
	
	private List<Units> army = new ArrayList<Units>();
	private ArmyType type;
	
	public Army(ArmyType type, Units...units) {
		Objects.requireNonNull(type);
		Objects.requireNonNull(units);
		for(Units toAdd : units) {
			if(toAdd.getType() != this.type) {
				throw new IllegalArgumentException("This unit have nothing to do here.");
			}
			army.add(toAdd);
		}
	}
	
	public void addUnit(Units unit) {
		Objects.requireNonNull(unit);
		if(unit.getType() != type) {
			throw new IllegalArgumentException("Trying to add the wrong type.");
		}
		army.add(unit);
	}

	@Override
	public int speed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int health() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fire() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArmyType getType() {
		return type;
	}

}
