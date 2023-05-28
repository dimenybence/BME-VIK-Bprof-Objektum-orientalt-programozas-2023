package registry2;

import java.util.ArrayList;

public class Main {
	static public void main(String[] args) {
		
		// 1. példa, Person
		Student s1 = new Student("Gipsz Jakab", "1A2B3C", 1996);
		Teacher t1 = new Teacher("Rend Elek", "Q1W2E3", 1973);
		//Person  p1 = new Person("Nagy Károly", "XXX111", 1998);

		Person p2 = s1;
		Person p3 = t1;

		System.out.println(s1); //Gipsz Jakab (1A2B3C), 1996, 0.0, 0
		System.out.println(t1); //Rend Elek (Q1W2E3), 1973, assis...
		//System.out.println(p1); //Nagy Károly (XXX111), 1998
		System.out.println(p2); //Gipsz Jakab (1A2B3C), 1996, 0.0, 0
		System.out.println(p3); //Rend Elek (Q1W2E3), 1973, assis...

		// 2. példa, kivételek
		Course c = new Course("Zabhegyezés", "BMEVIIIZZ00", 24);
		Teacher t = new Teacher("Vastagh Béla", "VSTGBL", 1975);
		c.setTeacher(t);
		try {
		  c.addStudent(new Student("Lutz Ernő", "LTZRN0",1996));
		  c.addStudent(new Student("Szőke Barna", "BRN123",1996));
		  c.addStudent(new Student("Hervadt Virág", "HRVDTV",1995));
		} catch (Exception e) {
		  System.err.println(e.getMessage());
		  // e.printStackTrace();
		}
		System.out.println();
		s1.whatever();	//b)nem lathato yob 
		System.out.println(s1);
		//d) Publicra ha mindenki el tudja érni
		//	 private-re ha csak az osztályon belül érjük el
		//	 protected-re megengedi, hogy a leszármazott osztályok is elérhessék
		
		//3. pelda Artist
		Artist a1 = new Artist("Muvesz Bela", "ASDASD", 1786, "zabhegyezo");
		Artist a2 = new Artist("Lakatos Alehandro", "DASDAS", 1789, "zenesz");
		ArrayList<Artist> muveszek  = new ArrayList<Artist>();
		muveszek.add(a1);
		muveszek.add(a2);
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println();
		//4.
		Course course = new Course("Java", "JAVA123", 2);
	    try {
	        course.addStudent(new Student("Szilvas Bukta", "SB123",19));
	        course.addStudent(new Student("Csokis Csigusz", "CS123",22));
	        course.addStudent(new Student("Bananos Joe", "BJO123",43));
	    } catch (CourseFullException e) {
	        System.out.println("Tele van");
	    } catch (NeptunNotFoundException e) {
	        System.out.println("Nincs ilyen");
	    } catch (CourseException e) {
	        System.out.println(e.getMessage());
	    }
	}
}
