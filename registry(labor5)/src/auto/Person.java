package auto;

import java.util.ArrayList;

public class Person {
	private int szuletesiEV;
	private String nev, lakcim;
	private ArrayList<Vehicle> cars;
	
	public Person(int szuletesiEv, String nev, String lakcim) {
		this.szuletesiEV = szuletesiEv;
		this.nev = nev;
		this.lakcim = lakcim;
		this.cars = new ArrayList<>();
	}
	
	public int getSzuletesiEv() {
		return szuletesiEV;
	}
	
	public String getNev() {
		return nev;
	}
	
	public String getLakcim() {
		return lakcim;
	}
	
	public void addCar(Vehicle v) {
        cars.add(v);
        v.setOwner(this);
    }
	
	public void removeCar(String rendszam) {
        for (int i = 0; i < cars.size(); i++) {
            Vehicle v = cars.get(i);
            if (v.getRendszam().equals(rendszam)) {
                v.setOwner(null);
                cars.remove(i);
                return;
            }
        }
    }
	
	public void listCars() {
        if (cars.isEmpty()) {
            System.out.println(nev + " nem rendelkezik járművel.");
            return;
        }
        System.out.println(nev + " járművei:");
        for (Vehicle v : cars) {
            System.out.println("- " + v);
        }
    }
	
	public String toString() {
		String s = (this.szuletesiEV+" "+this.nev+" "+this.lakcim);
		return s;
	}
}
