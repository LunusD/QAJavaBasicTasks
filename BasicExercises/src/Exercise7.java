
public class Exercise7 {

	public static void main(String[] args) {
		System.out.println(numMath(0,1,true));
		System.out.println(numMath(1,2,true));

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
