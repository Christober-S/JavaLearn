public class Main{
	public static void main(String[] args) {
		
		
		Integer[] intArray = {1, 2, 3, 4, 5, 6};
		Double[] doubleArray = {4.4, 8.5, 9.0, 4.1, 3.17};
	
		Character[] charArray = {'c', 'h', 'r', 'i', 's'};
		String[] stringArray = {"H", "E", "L", "L", "O"};
		
		//displayArray(intArray);
		//displayArray(doubleArray);
		//displayArray(charArray);
		//displayArray(stringArray);
		
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));
		
	}
	//public static <T> void displayArray(T[] array) {
	//	for (T x : array) {
	//		System.out.print(x+" ");
	//		}
	//	System.out.println();
	//}
	
	public static <T> T getFirst(T[] array) {
			
		return array[0];
	}
	
}
