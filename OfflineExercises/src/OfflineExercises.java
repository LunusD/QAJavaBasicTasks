import java.util.ArrayList;

public class OfflineExercises {

	public static void main(String[] args) {

		OfflineExercises offlineExe = new OfflineExercises();

		System.out.println(offlineExe.doubleChar("The"));
		System.out.println(offlineExe.doubleChar("AAbb"));
		System.out.println(offlineExe.getSandwich("xxbreadbutter"));
		System.out.println(offlineExe.getSandwich("breadpiebread"));
		System.out.println(offlineExe.evenlySpaced(2, 4, 6));
		System.out.println(offlineExe.evenlySpaced(2, 6, 4));
		System.out.println(offlineExe.evenlySpaced(4, 6, 3));
		System.out.println(offlineExe.nTwice("hello", 2));
		System.out.println(offlineExe.nTwice("Chocolate", 3));
		System.out.println(offlineExe.nTwice("Chocolate", 1));
		System.out.println(offlineExe.endsLy("oddly"));
		System.out.println(offlineExe.endsLy("y"));
		System.out.println(offlineExe.endsLy("oddy"));
		// System.out.println(offlineExe.);

	}

	/*
	 * Given a string, return a string where for every char in the original, there
	 * are two chars.
	 * 
	 * doubleChar("The") "TThhee" doubleChar("AAbb") "AAAAbbbb"
	 * doubleChar("Hi-There") "HHii--TThheerree"
	 */

	public String doubleChar(String input) {
		String doubledString = "";
		for (int i = 0; i < input.length(); i++) {
			doubledString += input.charAt(i);
			doubledString += input.charAt(i);
		}
		return doubledString;
	}

	/*
	 * A sandwich is two pieces of bread with something in between. Return the
	 * string that is between the first and last appearance of "bread" in the given
	 * string, or return the empty string "" if there are not two pieces of bread.
	 * 
	 * getSandwich("breadjambread") "jam" getSandwich("xxbreadjambreadyy") "jam"
	 * getSandwich("xxbreadyy") ""
	 */
	public String getSandwich(String input) {
		String filling = "";
		int indexOfFirstBread = input.indexOf("bread") + 5;
		String inputFirstBreadRemoved = input.substring(indexOfFirstBread);
		int indexOfSecondBread = inputFirstBreadRemoved.indexOf("bread");
		if (!inputFirstBreadRemoved.contains("bread")) {
		} else {
			filling = inputFirstBreadRemoved.substring(0, indexOfSecondBread);

		}
		return filling;
	}

	/*
	 * Given three ints, a b c, one of them is small, one is medium and one is
	 * large. Return true if the three values are evenly spaced, so the difference
	 * between small and medium is the same as the difference between medium and
	 * large.
	 * 
	 * evenlySpaced(2, 4, 6) true evenlySpaced(4, 6, 2) true evenlySpaced(4, 6, 3)
	 * false
	 */
	public boolean evenlySpaced(int num1, int num2, int num3) {
		int[] numbers = new int[] { num1, num2, num3 };
		int largestNumber = Integer.max(Integer.max(num1, num2), num3);

		int lowestNumber = Integer.min(Integer.min(num1, num2), num3);

		int middleNumber = 0;
		
		for(int number : numbers) {
			if(number == largestNumber || number == lowestNumber) {
			} else {
				middleNumber = number;
			}
		
		}

		if (middleNumber - lowestNumber == largestNumber - middleNumber) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * Given a string and an int n, return a string made of the first and last n
	 * chars from the string. The string length will be at least n.
	 * nTwice("Hello",2) "Helo" nTwice("Chocolate", 3) "Choate" nTwice("Chocolate",
	 * 1) "Ce"
	 */

	public String nTwice(String input, int n) {
		String startChars = input.substring(0, n);
		String endChars = input.substring(input.length() - n, input.length());

		String output = startChars + endChars;
		return output;
	}

	/*
	 * Task 5 Given a string, return true if it ends in "ly". endsLy("oddly") true
	 * endsLy("y") false endsLy("oddy") false
	 */

	public boolean endsLy(String input) {
		if (input.endsWith("ly")) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Given a string, return recursively a "cleaned" string where adjacent chars
	 * that are the same have been reduced to a single char. So "yyzzza" yields
	 * "yza". stringClean("yyzzza") "yza" stringClean("abbbcdd") "abcd"
	 * stringClean("Hello") "Helo"
	 */
	/*
	 * The fibonacci sequence is a famous bit of mathematics, and it happens to have
	 * a recursive definition. The first two values in the sequence are 0 and 1
	 * (essentially 2 base cases). Each subsequent value is the sum of the previous
	 * two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
	 * Define a recursive fibonacci(n) method that returns the nth fibonacci number,
	 * with n=0 representing the start of the sequence.
	 * 
	 * fibonacci(0) 0 fibonacci(1) 1 fibonacci(2) 1
	 */
}
