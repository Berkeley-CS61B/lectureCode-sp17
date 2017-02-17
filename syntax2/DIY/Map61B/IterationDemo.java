package Map61B;

public class IterationDemo {
    public static void main(String[] args) {
		ArrayMap<String, Integer> am =
  			new ArrayMap<String, Integer>();

		am.put("hello", 5);
		am.put("syrups", 10);
		
		/*ArrayMap.KeyIterator ami =
		   am.new KeyIterator();

		while (ami.hasNext()) {
		   System.out.println(ami.next());
		}*/
    }
}
