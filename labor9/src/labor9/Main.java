package labor9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TreeMap;

public class Main implements Serializable{
	static TreeMap<LocalDate, String> events = new TreeMap<LocalDate, String>();

	private static void printMonth(LocalDate t) {
		System.out.println(t.getMonth()+" "+ t.getYear());
		System.out.println("Mo  "+"Tu  "+"We  "+"Th"+"  Fr"+"  Sa"+"  Su");	
		LocalDate first=t.minusDays(t.getDayOfMonth()-1);
		int n=1;
		for(int i=0;i<t.lengthOfMonth()+first.getDayOfWeek().getValue()-1;i++) {
			if((i)%7==0 &&i!=0) {
				System.out.println();
			}
			if(i<first.getDayOfWeek().getValue()-1) {
				System.out.print("    ");
			}
			else {
	            String nap;
	            if (10 > n) {
	                nap = " " + n;
	            } else {
	                nap = Integer.toString(n);
	            }

	            String event = events.get(LocalDate.of(t.getYear(), t.getMonth(), n));
	            if (event != null) {
	                System.out.print(nap + "* ");
	            } else {
	                System.out.print(nap + "  ");
	            }
	            n++;
	        }
	    }
	}
	
	private static void printYear(LocalDate t) {
		int ev=t.getYear();
		System.out.println();
		for(int i=1;i<13;i++) {
			LocalDate today=LocalDate.of(ev, i, 21);
			System.out.println();
			printMonth(today);
		}
	}
	
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		LocalDate l= (LocalDate.now());
		System.out.println(l);
		//LocalDate apr1 = LocalDate.of(l.getYear(), 4, 1);
		
		System.out.println(cal.getActualMinimum(Calendar.DATE));
		System.out.println("");
		printYear(l);
		System.out.println("");
		System.out.println("");
		//printMonth(apr1);
		System.out.println("");
		
		Scanner sc=new Scanner(System.in);
		
		while(true){
			String sor = sc.nextLine();
			String cmd[] = sor.split(" ");
			if (cmd[0].equals("exit")){
				sc.close();
				break;
			}
			else if(cmd[0].equals("add")) {
				LocalDate date = LocalDate.parse(cmd[1]);
	            String event = cmd[2];
	            events.put(date, event);
			}
			else if(cmd[0].equals("list")) {
				for (LocalDate d : events.keySet()) {
	                System.out.println(d + ": " + events.get(d));
	            }
			}else if(cmd[0].equals("save")) {
				String filename = cmd[1];
	            try {
	                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
	                oos.writeObject(events);
	                oos.close();
	            } catch (IOException e) {
	                System.out.println(e.getMessage());
	            }
			}
			else if(cmd[0].equals("load")) {
				String filename2 = cmd[1];
	            try {
	                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename2));
	                events = (TreeMap<LocalDate, String>) ois.readObject();
	                ois.close();
	            } catch (IOException e)  {
	                e.getMessage();
	            } catch (ClassNotFoundException e) {
					e.getMessage();
				}
			}
			else if(cmd[0].equals("month")) {
				LocalDate monthToPrint;
				if(cmd.length > 1) {
					int month = Integer.parseInt(cmd[1]);
					monthToPrint = LocalDate.of(l.getYear(), month, 1);
				} 
				else {
					monthToPrint = l.withDayOfMonth(1);
				}
				printMonth(monthToPrint);
			}
			else if(cmd[0].equals("year")) {
				LocalDate yearToPrint;
				if(cmd.length > 1) {
					int year = Integer.parseInt(cmd[1]);
					yearToPrint = LocalDate.of(year, 1, 1);
				} 
				else {
					yearToPrint = l.withDayOfYear(1);
				}
				printYear(yearToPrint);
			}
		}
	}
}