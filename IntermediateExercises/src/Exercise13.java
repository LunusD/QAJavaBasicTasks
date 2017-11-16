
public class Exercise13 {

	public static void main(String[] args) {
		System.out.println(uniqueSum(1,2,3));
		System.out.println(uniqueSum(1,1,3));
		System.out.println(uniqueSum(3,3,3));
		System.out.println(uniqueSum(1,2,2));
		System.out.println(uniqueSum(1,2,1));

	}
	
	public static int uniqueSum(int a, int b, int c) {
		if (a == b && b == c) {
			return 0;
		}
		else if (a == b) {
			return c;
		}
		else if (a == c) {
			return b;
		}
		else if (b == c) {
			return a;
		}
		else {
			return a+b+c;
		}
	}

}
