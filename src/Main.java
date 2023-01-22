
public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		Bike bike = new Bike();
		Bus bus = new Bus();
		
		car.drive();
		System.out.println();
		bike.stop();
		System.out.println();
		bus.drive();
		bus.stop();

	}

}
