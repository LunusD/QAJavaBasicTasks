
public class Factorials {

	public static void main(String[] args) {

		Factorials factorial = new Factorials();

		System.out.println(factorial.factoral(147));
	}

	public String factoral(int input) {
		int counter = 1;
		double tempNumber = input;

		// while (tempNumber > 1) {
		// if (counter == 1) {
		// tempNumber = input / counter;
		//
		// } else {
		// tempNumber = tempNumber / counter;
		//
		// }
		// counter++;
		// }

		do {
			tempNumber = tempNumber / counter;
			counter++;
		} while (tempNumber > 1);

		if (tempNumber == 1) {
			return "The factorial of: " + input + " is: " + (counter - 1);
		} else {
			return "NONE";
		}
	}
}
