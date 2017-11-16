
public class Exercise12 {

	public static void main(String[] args) {
		
		System.out.println(blackjack(10, 18));
		System.out.println(blackjack(20, 22));
		System.out.println(blackjack(22, 22));

	}
	
	public static int blackjack(int a, int b) {
		int greaterNumber = 0;
		int lowerNumber;
		
		if (a >= b) {
			greaterNumber = a;
			lowerNumber = b;
		} else {
			greaterNumber = b;
			lowerNumber = a;
		}
		
		
		if (greaterNumber <= 21) {
			return greaterNumber;
		} else if (lowerNumber <= 21){
			return lowerNumber;
		} else {
			return 0;
		}
		
	}

}
