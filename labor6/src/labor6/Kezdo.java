package labor6;

import java.util.Scanner;
import java.util.Random;
public class Kezdo extends Jatekos{
	String name;
	public Kezdo(String name) {
		this.name=name;
	}
	public String toString() {
		return this.name;
	}
	public void lep() {
		Scanner sc=new Scanner(System.in);
		System.out.println(this.toString());
		System.out.println(asztal.getKor()+".kor");
		System.out.println("Ha nem kivan emelni irjon 0-t tetnek");
		Random s=new Random(6);
		double sa=s.nextDouble();
		asztal.emel(sa);
		System.out.println(asztal.getTet());
		sc.close();
		
	}
}

