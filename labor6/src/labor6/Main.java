package labor6;

public class Main {
	public static void main(String[] args) {
		Asztal ujasztal=new Asztal();
		/*Kezdo j1=new Kezdo("Jani");
		Kezdo j2=new Kezdo("Peti");
		Robot j3=new Robot();
		j1.setAsztal(ujasztal);
		j2.setAsztal(ujasztal);
		j3.setAsztal(ujasztal);
		*/
		Mester j1 = new Mester(5);
		Nyuszi j2 = new Nyuszi("Fekete");
		
		ujasztal.addJatekos(j1);
		ujasztal.addJatekos(j2);
		//ujasztal.addJatekos(j3);

		ujasztal.ujJatek();
		ujasztal.kor();
		ujasztal.kor();
		ujasztal.kor();
	}
}