import java.io.File;

public class Main{
	public static void main(String[] args) {
		//file 
		File file = new File("message.txt");
		
		if (file.exists()) {
			System.out.println("That file exists! ");
		}
		else {
			System.out.println("That file does not exist! ");
		}
	}
}
