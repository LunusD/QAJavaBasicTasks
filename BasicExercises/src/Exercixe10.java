
public class Exercixe10 {

	public static void main(String[] args) {
		int[] numberArray = new int[10];
		
		for(int i = 0; i < 10; i++) {
			numberArray[i] = i;
		}
		
		for(int i = 0; i < numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}
	}
}
