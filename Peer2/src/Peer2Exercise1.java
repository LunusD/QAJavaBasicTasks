import java.util.ArrayList;

public class Peer2Exercise1 {

	public static void main(String[] args) {
		Peer2Exercise1 pe1 = new Peer2Exercise1();
		System.out.println(pe1.condense("live verses summer dog"));
	}

	public String condense(String input) {
		String[] wordsInSentence = input.split(" ");
		String output = "";
		ArrayList<String> outputWords = new ArrayList<String>();

		for(int i = 0; i < wordsInSentence.length - 1; i++) {
			for(int j = 0; j < wordsInSentence[i].length()-1; j++) {
				String endOfWord = wordsInSentence[i].substring(wordsInSentence[i].length()-j);
				if(wordsInSentence[i+1].startsWith(endOfWord)) {
					wordsInSentence[i+1] = wordsInSentence[i+1].substring(j);
				}
			}
		}
		
		for (int i = 0; i < outputWords.size(); i++) {
			output += outputWords.get(i);
		}
		return output;
		
	}

}
