
public class Exercise11 {

	public static void main(String[] args) {

		int[] numberArray = new int[10]; 
		
		for(int i = 0; i < 10; i++) {
			numberArray[i] = i;
			System.out.println(numberArray[i]);
		}
		
		for(int i = 0; i < numberArray.length; i++) {
			numberArray[i] *= 10;
			System.out.println(numberArray[i]);
		}

	}

}
