package labor6;

import java.util.ArrayList;
import java.util.Random;

public class Asztal {
	
	private ArrayList<Jatekos> jatekosok;
	private double tet, goal;
	private int kor;
	
	public Asztal() {
        this.tet = 0;
        this.kor = 0;
        this.goal = 0;
        this.jatekosok = new ArrayList<Jatekos>();
    }
	
	public void ujJatek() {
        this.tet = 0;
        this.kor = 0;
        Random random = new Random();
        this.goal = random.nextInt(101);
        System.out.println("Uj jatek, celertek: " + this.goal);
    }
	
	public void addJatekos(Jatekos j) {
        if (this.jatekosok.size() == 10) {
            System.out.println("Az asztal megtelt!");
        } else {
            this.jatekosok.add(j);
            j.setAsztal(this);
        }
    }
	
	public void kor() {
		for(int i=0;i<jatekosok.size();i++) {
			jatekosok.get(i).lep();
			System.out.println(i+".jatekos");
		}
		kor++;
	}
	
	public int getKor() {
		return kor;
	}
	
	public double getTet() {
		return tet;
	}
	
	public void emel(double d) {
        this.tet += d;
    }
}
