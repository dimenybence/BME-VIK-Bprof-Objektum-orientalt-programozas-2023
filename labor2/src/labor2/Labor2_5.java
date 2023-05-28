package labor2;

public class Labor2_5 {
	
	static void tombKi(int[] tomb) {
		for (int i = 0; i < tomb.length; i++) {
			System.out.print(tomb[i] + " ");
		}
		System.out.println(" ");
	}
	
	static void tombPoz(int[] tomb) {
		for (int i = 0; i < tomb.length; i++) {
			if(tomb[i]<0) {
				tomb[i]*=-1;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] tomb = {1, -2, 3, 4, -5, 6, 7, -8, 9, -10};
		tombKi(tomb);
		tombPoz(tomb);
		tombKi(tomb);
	}
	//(1) A megadott tomb
	//(2) Pozitivak
	//(3) Ugyanugy pozitivak, mert a tomb tartalmat valtoztatta
}
