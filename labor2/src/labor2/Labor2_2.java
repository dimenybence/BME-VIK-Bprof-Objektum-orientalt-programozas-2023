package labor2;

import java.util.Scanner;

public class Labor2_2 {
	public static void main(String[] args) {
		double sum = 0;
		double[] tomb = new double[10];
		System.out.println("Add meg a 10 szamot egymas utan: ");
		Scanner f = new Scanner(System.in);
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = f.nextDouble();
			sum = sum + tomb[i];
		}
		double atlag = sum/tomb.length;
		for(int i = 0; i<tomb.length; i++) {
			if(tomb[i]>atlag) {
				System.out.println((int)tomb[i]);
			}
		}
	}
}
