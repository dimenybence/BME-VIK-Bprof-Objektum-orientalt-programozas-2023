package hello;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		/**
		//1.
		System.out.println("Hello World!");
		
		//2.
		int x1, x2, y1, y2;
		double tav;
		System.out.println("Add meg x1 kordinatat:");
		x1 = f.nextInt();
		System.out.println("Add meg x2 kordinatat:");
		x2 = f.nextInt();
		System.out.println("Add meg y1 kordinatat:");
		y1 = f.nextInt();
		System.out.println("Add meg y2 kordinatat:");
		y2 = f.nextInt();
		tav = Math.sqrt((y1-x1)*(y1-x1)+(y2-x2)*(y2-x2));
		System.out.println("Tav = " + tav);
		
		//3.
		System.out.println("Add meg ax2+bx+c=0 egyutthatoit:");
		System.out.println("a = ");
		int a,b,c;
		double x2;
		double x1;
		a = f.nextInt();
		System.out.println("b = ");
		b = f.nextInt();
		System.out.println("c = ");
		c = f.nextInt();
		int delta;
		delta = (b*b)-(4*a*c);
		if (delta < 0) {
			System.out.println("Nincs valos megoldas!");
		}
		else if (delta == 0) {
			x1 = -b/(2*a);
			System.out.println("Eredmeny = " + x1);
		}
		else {
			x1 = ((-b-Math.sqrt(delta))/(2*a));
			x2 = ((-b+Math.sqrt(delta))/(2*a));
			System.out.println("Eredmeny: x1 = " + x1 + ", x2 = " + x2);
		}
		**/
		int szam = f.nextInt();
		int fakt = 1;
		
		for (int i = 1; i <= szam; i++) {
			fakt *= i; 
		}
		System.out.println(fakt);
		
		fakt = 1;
		
		int i = 1;
		while (i <= szam) {
			fakt *= i;
			i++;
		}
		System.out.println(fakt);
	}
}
