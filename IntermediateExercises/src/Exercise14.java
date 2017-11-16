
public class Exercise14 {

	public static void main(String[] args) {
		System.out.println(temperatureChecker(95, true));
		System.out.println(temperatureChecker(40,false));
	}
	
	public static boolean temperatureChecker(int temperature, boolean isSummer) {
		int lowerBound = 60;
		int upperBound = 90;
		
		if (isSummer) {
			upperBound = 100;
		}
		
		if (temperature >= lowerBound && temperature <= upperBound) {
			return true;
		}
		else {
			return false;
		}
	}
}
