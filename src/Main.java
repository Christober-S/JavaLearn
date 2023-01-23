import java.util.Scanner;

public class Main {

	//Dynamic-Polymorphism
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Vehicle vehicle;
		
		System.out.println("What vehicle do you want?");
		System.out.println("(1=Car) or (2=Bike): ");
		
		int choice = scanner.nextInt();
		if (choice == 1) {
			vehicle = new Car();
			vehicle.sounds();
		}
		else if (choice == 2) {
			vehicle = new Bike();
			vehicle.sounds();
		}
		else {
			System.out.println("The choice was invalid!");
		}
		

	}

}
