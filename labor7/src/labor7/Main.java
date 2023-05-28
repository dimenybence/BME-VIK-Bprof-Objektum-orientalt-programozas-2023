package labor7;

import java.util.*;

public class Main {
	
	static ArrayList<Beer> tarolo = new ArrayList<Beer>();
	
	protected static void add(String[] cmd) {
		tarolo.add(new Beer(cmd[1],cmd[2],Double.parseDouble(cmd[3])));
	}
	
	protected static void list(String[] cmd) {
		if(cmd[2].equals("name")) {
			Collections.sort(tarolo, new NameComparator());
		} else if(cmd[2].equals("style")) {
			Collections.sort(tarolo, new StyleComparator());
		} else if(cmd[2].equals("strength")) {
			Collections.sort(tarolo, new StrengthComparator());
		} 
		for(int i=0; i < tarolo.size();i++) {
			System.out.println(tarolo.get(i).toString());
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		tarolo.add(new Beer("B", "Light", 4.5));
		tarolo.add(new Beer("A", "Dark", 5));

		while(true) {
			String line = s.nextLine();
			String[] cmd = line.split(" ");
			if(cmd[0].equals("exit")) {
				s.close();
				break;
			} else if(cmd[0].equals("add")) {
				add(cmd);
			} else if(cmd[0].equals("list")) {
				list(cmd);
			}
		}
	}

}
