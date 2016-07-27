public class Larger {
	/** Returns the larger of x and y. */
	public static int larger(int x, int y) {
		if (x < y) {
			return y;
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(larger(9, 10));
	}
}

/*
Notes: 
1. The equivalent of def in Java (for today) is 
    public static 
2. Parameters need a type.
3. Return value needs a type.

*/

