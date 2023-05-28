package labor2;

public class Labor2_1 {
	//a
	static int osztokSzama(int szam) {
		int osztok = 0;
		for (int i = 1; i<=szam; i++) {
			if(szam%i == 0) {
				osztok++;
			}
		}
		return osztok;
	}
	//b
	static boolean prim_e(int szam) {
		int osztok = osztokSzama(szam);
		return osztok == 2;
	}
	
	public static void main(String[] args) {
		//c
		for (int i = 2; i<=100; i++) {
			if(prim_e(i)) {
				System.out.println(i);
			}
		}
	}
}

