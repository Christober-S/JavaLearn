
public class Bus implements Drive, Stop{

	@Override
	public void stop() {
		System.out.println("The bus has been stopped");
		
	}

	@Override
	public void drive() {
		System.out.println("The bus has been driving");
		
	}

}
