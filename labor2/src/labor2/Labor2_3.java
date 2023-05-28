package labor2;

import java.util.ArrayList;
import java.util.Scanner;

public class Labor2_3 {
	public static void main(String[] args) {
		double sum = 0;
		ArrayList<Double> tomb = new ArrayList<Double>();
		System.out.println("Add meg a 10 szamot egymas utan: ");
		Scanner f = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			tomb.add(f.nextDouble());
			sum = sum + tomb.get(i);
		}
		double atlag = sum/tomb.size();
		for(int i = 0; i<tomb.size(); i++) {
			if(tomb.get(i)>atlag) {
				System.out.println(tomb.get(i));
			}
		}
	}
}

