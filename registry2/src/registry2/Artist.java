package registry2;

public class Artist extends Person {
    private String art;

    public Artist(String name, String neptun, int yob, String art) {
        super(name, neptun, yob);
        this.art = art;
    }

    public String getArt() {
        return art;
    }

    public String toString() {
        return super.toString() + ", " + art;
    }

	@Override
	public String greetings() {
		return null;
	}
}

