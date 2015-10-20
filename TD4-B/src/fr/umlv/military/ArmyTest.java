package fr.umlv.military;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import fr.umlv.military.Soldier.SoldierKind;

public class ArmyTest {

	@Test
	public void testOnFourSoldier() {
		List<Soldier> listSoldier = new ArrayList<Soldier>();
		listSoldier.add(new Soldier(SoldierKind.Medic));
		listSoldier.add(new Soldier(SoldierKind.FlameThrower));
		listSoldier.add(new Soldier(SoldierKind.InfantryMan));
		listSoldier.add(new Soldier(SoldierKind.Aviator));
		assertEquals(10, listSoldier.stream().mapToInt(s -> s.speed()).sum());
		assertEquals(70, listSoldier.stream().mapToInt(s -> s.health()).sum());
		assertEquals(80, listSoldier.stream().mapToInt(s -> s.fire()).sum());
	}
	
	@Test
	public void testTruck() {
		Soldier flamethrower = new Soldier(SoldierKind.FlameThrower);
		Soldier marine = new Soldier(SoldierKind.Marine);
		ArmyTruck truck = new ArmyTruck(marine, flamethrower);
		assertEquals(40, truck.getHealth());
	}

}
