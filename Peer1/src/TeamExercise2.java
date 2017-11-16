import java.util.ArrayList;

public class TeamExercise2 {

	public static void main(String[] args) {

		TeamExercise2 dogComp = new TeamExercise2();

		System.out.println(dogComp.doggoCompetition(22));
	}

	public String doggoCompetition(int input) {

		ArrayList<Integer> doggoList = new ArrayList<Integer>();
		String doggoOutput = "";
		int count = 0;

		if (input > 100 || input < 1) {
			return "Not a valid placement.";
		}
		for (int i = 1; i <= 100; i++) {
			doggoList.add(i);
		}

		doggoList.remove(input - 1);

		for (int i = 0; i < doggoList.size(); i++) {

			String tempNum = doggoList.get(i).toString();

			if (tempNum.charAt(tempNum.length() - 1) == '1' && !tempNum.equals("11")) {
				tempNum += "st";
			} else if (tempNum.charAt(tempNum.length() - 1) == '2' && !tempNum.equals("12")) {
				tempNum += "nd";
			} else if (tempNum.charAt(tempNum.length() - 1) == '3' && !tempNum.equals("13")) {
				tempNum += "rd";
			} else {
				tempNum += "th";
			}

			if (count < 9) {
				doggoOutput += tempNum + ", ";
				count++;
			} else {
				doggoOutput += tempNum + "\n";
				count = 0;
			}
		}

		return doggoOutput;

	}
}
