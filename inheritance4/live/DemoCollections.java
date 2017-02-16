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
		for (String s : words) {
			ss.add(s);			
		}
		return ss;
	}

	public static Map<String, Integer> findWordCount(List<String> words, List<String> targets) {
		Map<String, Integer> wordCounts = new HashMap<String, Integer>();
		for (String s : targets) {
			wordCounts.put(s, 0);
		}

		for (String s : words) {
			if (wordCounts.containsKey(s)) {
				int oldCount = wordCounts.get(s);
				wordCounts.put(s, oldCount + 1);
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