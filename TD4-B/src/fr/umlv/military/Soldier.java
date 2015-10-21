package fr.umlv.military;

public class Soldier implements Units {
	public enum SoldierKind {
		InfantryMan  (30, 3, 20), 
		Medic        (0,  2, 10),
		Marine       (30, 3, 20),
		Aviator      (10, 3, 20),
		FlameThrower (40, 2, 20),
		;

		final int fire;
		final int speed;
		final int health;

		private SoldierKind(int fire,int speed, int health){
			this.fire = fire;
			this.speed = speed;
			this.health = health;
		}
	}

	private final SoldierKind kind;
	private int health;
	private final ArmyType type;

	public Soldier(ArmyType type, SoldierKind kind){
		this.health = kind.health;  // implicit null check
		this.kind = kind;
		this.type = type;
	}

	@Override
	public int speed() {
		return kind.speed;
	}

	@Override
	public int health() {
		return health;
	}

	@Override
	public ArmyType getType() {
		return type;
	}

	public int fire() {
		return kind.fire;
	}

	public SoldierKind kind() {
		return kind;
	}

	@Override
	public String toString() {
		return kind.name();
	}
}