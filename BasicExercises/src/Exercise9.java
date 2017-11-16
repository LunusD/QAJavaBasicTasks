
public class Exercise9 {

	public static void main(String[] args) {
		
		int[] numberArray = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(numMath(numberArray[4], numberArray[6], false));

	}

	public static int numMath(int a, int b, boolean isAdd) {
		if(a == 0) {
			return b;
		}
		else if (b == 0) {
			return a;
		}
		else if(isAdd) {
			return a+b;
		}
		else {
			return a*b;
		} 
	}
}
