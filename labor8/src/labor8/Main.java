package labor8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	protected static File wd = new File(System.getProperty("user.dir"));
	protected static void pwd() {
        try {
			System.out.println(wd.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected static void ls(String s)  {
		if(s == null) {
			String[] pathnames;
			File f = wd;
			pathnames = f.list();
			for (String pathname : pathnames) {
				System.out.println(pathname);
			}
		}
		else if (s.equals("-l")) {
			File[] l = wd.listFiles();
			for (int i=0;i<l.length;i++) {
				 if(l[i].isDirectory()) {
					 System.out.println(l[i]+" " + l[i].length() +" d");
				 }
				 else if(l[i].isFile()) {
					 System.out.println(l[i]+" " + l[i].length()+" f");
				 }
			 }
		}
	}
	
	protected static void cd(String s) {
		if(s.equals("..")) {
			wd = wd.getParentFile();
			return;
		}
		File newWd = new File(wd, s);
		if(newWd.isDirectory()) {
			wd = newWd;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true){
			String l = sc.nextLine();
			String cmd[] = l.split(" ");
			if (cmd[0].equals("exit")){
				sc.close();
				break;
			}
			else if(cmd[0].equals("pwd")) {
				pwd();;
			}
			else if(cmd[0].equals("ls")) {
				if(cmd.length == 1) {
					ls(null);
				}
				else if(cmd.length == 2) {
					ls(cmd[1]);
				}
			}else if(cmd[0].equals("cd")) {
				cd(cmd[1]);
			}
		}
	}
}
