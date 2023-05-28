package auto;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle(2010, "HR11DML", "VW");
		Vehicle vehicle2 = new Vehicle(2002, "CV21RMD", "LADA");
		Vehicle vehicle3 = new Vehicle(2023, "HR19STR", "Dacia");
		
		Person p1 = new Person(1971, "Dezso", "Aurora utca 11");
		Person p2 = new Person(2002, "Joska", "Viragok setanya 9");
		
		System.out.println(vehicle1);
		System.out.println(vehicle2);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println();
		
		p1.addCar(vehicle1);
		p1.addCar(vehicle3);
        vehicle1.setOwner(p1);
        vehicle3.setOwner(p1);
        
        p2.addCar(vehicle2);
        vehicle2.setOwner(p2);
        
        p1.listCars();
        p2.listCars();
        
        System.out.println();
        
        p1.removeCar("HR19STR");
        p1.listCars();
	}
}
