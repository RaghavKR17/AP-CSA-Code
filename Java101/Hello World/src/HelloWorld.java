 
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		Car myCar = new Car("Blue", "Nissan Leaf");
		myCar.start();
		String details = myCar.getDescription();
		System.out.println(details);
		
	}
}
