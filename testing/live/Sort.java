public class Sort {
	/** Sorts strings destructively. */
	public static void sort(String[] x) {
		sort(x, 0);
	}

	/** Sorts x starting at position k. */
	public static void sort(String[] x, int k) {
		// find the smallest item
		// swap it into the front position
		// sort the rest (recursion??)
		if (k == x.length) {
			return;
		}
		int smallest = findSmallest(x, k);
		swap(x, k, smallest);
		sort(x, k + 1);
	}


		/** Swaps x[a] and x[b] */
	public static void swap(String[] x, int a, int b) {
		String temp = x[a];
		x[a] = x[b];
		x[b] = temp;
	}

	/** Return the position of the smallest String starting at k. */
	public static int findSmallest(String[] x, int k) {
		int smallestIndex = k;
		int i = k;
		while (i < x.length) {
			int cmp = x[i].compareTo(x[smallestIndex]);

			if (cmp < 0) {
				smallestIndex = i;
			}
			i = i + 1;
		}
		return smallestIndex;
	}


	/** Prints out all strings in x. */
	public static void print(String[] x) {
	}

	/** Outputs the command line arguments
	 * in alphabetical order. */
	public static void main(String[] args) {
	}
}