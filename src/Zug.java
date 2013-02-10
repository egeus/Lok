public class Zug {
	Lokomotive erstelleZug(int countPersonenwaggon, int countViehwaggon,
			int countKippwaggon, int countGueterwaggon) {
		Lokomotive lok = new Lokomotive(80000);
		for (int i = 0; i < countPersonenwaggon; i++) {
			Personenwaggon p = new Personenwaggon(2000, 3);
			lok.ankoppelnPerso(p);
		}
		for (int i = 0; i < countViehwaggon; i++) {
			Viehwaggon v = new Viehwaggon(2000, 10000, 100);
			lok.ankoppelnVieh(v);
		}
		for (int i = 0; i < countKippwaggon; i++) {
			Kippwaggon k = new Kippwaggon(10000, 2000);
			lok.ankoppelnKipp(k);
		}
		for (int i = 0; i < countGueterwaggon; i++) {
			Gueterwaggon g = new Gueterwaggon(2000, 10000);
			lok.ankoppelnGueter(g);
		}
		return lok;
	}
}
/*
 * Die Züge können auf diese Weise in einer beliebigen Kombination zueinander
 * erstellt werden. Auf Null und Ungültigkeitsabfragen wurde
 * Übersichtlichkeitshalber verzichtet. Der Nachteil unseres Konzeptes liegt
 * darin, dass keine unterschiedlichen Gewichte fuer die verschiedenen Waggongs
 * angegeben werden kann. Bei uns besteht im Grunde ein singleton pattern. Es
 * wird von jeder Classe immer nur ein Objekt erzeugt. Template: es waehre
 * besser, wenn die bisherigen Waggongarten, welche alle einen Aufbau haben
 * (haben alle ein eigen und ein maximalgewicht, nur verschiedene Aufbauten auf
 * dem Fahrgestell) von einer abstrakten Klasse erben wuerden. 
 */