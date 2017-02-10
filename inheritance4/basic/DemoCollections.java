import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class DemoCollections {

	public static String cleanString(String s) {
		return s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
	}

	public static List<String> getWords(String inputFilename) {
		In in = new In(inputFilename);
		
		List<String> w = new ArrayList<String>();
		while (!in.isEmpty()) {
			String rawString = in.readString();
			w.add(cleanString(rawString));
		}
		return w;
	}

public static Set<String> findUniqueWords(List<String> words) {
	Set<String> ss = new HashSet<String>();
	for (int i = 0; i < words.size(); i += 1) {
		ss.add(words.get(i));
	}
	return ss;
}

	public static Map<String, Integer> findWordCount(List<String> words, List<String> targets) {
		Map<String, Integer> wordCounts = new HashMap<String, Integer>();
		for (int i = 0; i < targets.size(); i += 1) {
			wordCounts.put(targets.get(i), 0);
		}

		for (int i = 0; i < words.size(); i += 1) {
			String ithWord = words.get(i);
			if (wordCounts.containsKey(ithWord)) {
				int oldCount = wordCounts.get(ithWord);
				wordCounts.put(ithWord, oldCount += 1);
			}
		}
		return wordCounts;
	}

	public static void main(String[] args) {
		List<String> w = getWords("libraryOfBabylon.txt");
		List<String> targets = new ArrayList<String>();
		targets.add("lottery");
		targets.add("the");
		targets.add("babylon");
		System.out.println(findWordCount(w, targets));
	}
} 