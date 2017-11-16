
public class Exercise8 {

	public static void main(String[] args) {
		
		int a = 10;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(numMath(a, i, true));
		}

	}

	public static int numMath(int num1, int num2, boolean isAdd) {
		if(num1 == 0) {
			return num2;
		}
		else if (num2 == 0) {
			return num1;
		}
		else if(isAdd) {
			return num1+num2;
		}
		else {
			return num1*num2;
		} 
	}
}
