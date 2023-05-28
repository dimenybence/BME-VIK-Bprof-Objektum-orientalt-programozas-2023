package auto;

public class Vehicle {
	private int gyartasEv;
	private String rendszam, tipus;
	private Person owner;
	
	public Vehicle(int gyartasEv, String rendszam, String tipus){
		this.gyartasEv = gyartasEv;
		this.rendszam = rendszam;
		this.tipus = tipus;
	}
	
	public int getGyartasEv() {
		return gyartasEv;
	}
	
	public String getRendszam() {
		return rendszam;
	}
	
	public String getTipus() {
		return tipus;
	}
	
	public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
	
	public String toString() {
		String s = (this.rendszam+" "+ this.gyartasEv+ " "+ this.tipus);
		return s;
	}
}
