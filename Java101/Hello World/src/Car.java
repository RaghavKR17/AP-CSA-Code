
public class Car {
	String color;
	String type;
	void start() {
		System.out.println("\nGet Started!\n");
	}
	Car() {
		color = "White";
		type = "Honda Pilot";
	}
	Car(String c1, String t1) {
		color = c1;
		type = t1;
	}
	public String getDescription() {
		String description = "This is a " + color + " " + type;
		return description;
	}
}