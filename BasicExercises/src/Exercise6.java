
public class Exercise6 {

	public static void main(String[] args) {
		System.out.println(numberMath(2,3, true));
		System.out.println(numberMath(2,3,false));
	}
	
	public static int numberMath(int a, int b, boolean isAdd) {
		if(isAdd) {
			return a+b;
		}
		else {
			return a*b;
		}
	}
}
