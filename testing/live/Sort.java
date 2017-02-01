public class Sort {
	/** Returns input strings in sorted order.
	 * Non-destructive. */
	public static void sort(String[] inputs) {
		sort(inputs, 0);
	}

	/** Sorts inputs starting at index k. */
	private static void sort(String[] inputs, int k) {
		if (k == inputs.length) {
			return;
		}

		int smallest = findSmallest(inputs, k);
		swap(inputs, k, smallest);
		sort(inputs, k + 1);
	}

	public static void swap(String[] inputs, int a, int b) {
		String oldA = inputs[a];
		inputs[a] = inputs[b];
		inputs[b] = oldA;
	}

	/** Returns the smallest item starting at index k. */
	public static int findSmallest(String[] inputs, int k) {
		int i = k;
		String smallest = inputs[k];
		int smallestLocation = k;
		while (i < inputs.length) {
			int cmp = inputs[i].compareTo(smallest);

			if (cmp < 0) {
				smallest = inputs[i];
				smallestLocation = i;
			}
			i = i + 1;
		}
		return smallestLocation;
	}

	/** Prints out all strings in inputs. */
	public static void print(String[] inputs) {
	}

	/** Outputs the command line arguments
	 * in alphabetical order. */
	public static void main(String[] args) {
	}
}