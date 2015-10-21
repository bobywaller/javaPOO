package fr.umlv.military;

public interface Units {
	
	enum ArmyType {
		MARINES,
		AIRFORCE,
		NAVY,
		MEDIC;
	}
	
	public abstract ArmyType getType();

	public abstract int speed();

	public abstract int health();

	public abstract int fire();

}