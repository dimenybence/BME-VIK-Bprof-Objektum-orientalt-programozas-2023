package labor2;

public class Labor2_4 {

	static void ki2(int n, int m) {
		System.out.println(n);
		System.out.println(m);
	}
	
	static void elo2(int n, int m) {
		n *= -1;
		m *= -1;
		ki2(n,m);
	}
	
	public static void main(String[] args) {
		int n = 1, m = 2;
		ki2(n,m);
		elo2(n,m);
		ki2(n,m);
		//(1) Siman kiirja a megadott ertekeket.
		//(2) Negativ elojelet kaptak.
		//(3) Ugyanugy, ahogy az (1)-s pontban, mert csak az elo2-ben valtozott meg az elojeluk, a mainbe nem.
	}

}
