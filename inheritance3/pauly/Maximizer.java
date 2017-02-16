public class Maximizer {
	public static Object max(Object[] items) {
		int maxDex = 0;
		for (int i = 0; i < items.length; i += 1) {
			if (items[i] > items[maxDex]) {
				maxDex = i;                 
			}
		}
		return items[maxDex];

	}
} 