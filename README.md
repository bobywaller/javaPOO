Rapport TD4 B - Szymanski/Galland
=============

Exercice 1
----------

 1. L'héritage implique que l'on ne controle pas l'implémentation de la classe mère. Or avec un programme comme cité dans la question utilisant l'héritage, il nous sera plus difficile de faire des changements, cela nous obligerait à modifier toutes les classes (mères et filles).
 
 2. Comme nous avons vu dans le TD4 A:

    public class LoggerComposite implements Logger{

	private final Logger[] loggers;

	public LoggerComposite(Logger...loggers){
		this.loggers = loggers;
	}
	
	@Override
	public void log(Level level, String message) {
		Arrays.stream(loggers).forEach(loggers -> loggers.log(level, message));
	}

}

Dans ce cas cela est un composite transparent car les utilisteurs on accès aux champs et méthodes de cette classe et donc peuvent modifier ses champs.



Exercice 2
----------

 1. Nous avons implémenter un test:

    @Test
	public void testOnFourSoldier() {
		List<Soldier> listSoldier = new ArrayList<Soldier>();
		listSoldier.add(new Soldier(Units.ArmyType.AIRFORCE, SoldierKind.Medic));
		listSoldier.add(new Soldier(Units.ArmyType.AIRFORCE, SoldierKind.FlameThrower));
		listSoldier.add(new Soldier(Units.ArmyType.AIRFORCE, SoldierKind.InfantryMan));
		listSoldier.add(new Soldier(Units.ArmyType.AIRFORCE, SoldierKind.Aviator));
		assertEquals(10, listSoldier.stream().mapToInt(s -> s.speed()).sum());
		assertEquals(70, listSoldier.stream().mapToInt(s -> s.health()).sum());
		assertEquals(80, listSoldier.stream().mapToInt(s -> s.fire()).sum());
	}

 3. Afin de pouvoir représenter nos soldats et camions en un seul et unique type nous allons utiliser une interface. Cela nous permettra d'ajouter un niveau d'abstraction et gérer plus souplement nos unitées.

 4. La classe ArmyTruck nous permet d'ajouter d'autres unités mais pas d'autres trucks. Cela n'aurait absolument aucun sens. Alors qu'une composite va nous permettre de manipuler une collections d'objets de la même manière que nous manipulons une seul et unique classe. Cela peut posser problème car nous n'aurons pas la possibilité de regrouper toutes nos unités dans un même groupe.

 5. ![enter image description here](http://i.imgur.com/jBUQ6e1.jpg "Notre diagramme UML.")

