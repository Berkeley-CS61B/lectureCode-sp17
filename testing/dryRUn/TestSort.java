import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the methods of the Sort class */
public class TestSort {
	@Test
	public void testSort() {
		String[] input = {"cows", "dwell", "above", "clouds"};
		String[] expected = {"above", "clouds", "cows", "dwell"};
		Sort.sort(input);

		assertArrayEquals(expected, input);
	}

	@Test
	public void testFindSmallest() {
		String[] input = {"cows", "dwell", "above", "clouds"};
		int expected = 2;
		int actual = Sort.findSmallest(input, 0);
		assertEquals(expected, actual);

		input = new String[]{"cows", "dwell", "zebra", "clouds"};
		expected = 3;
		actual = Sort.findSmallest(input, 0);
		assertEquals(expected, actual);

		input = new String[]{"cows", "dwell", "above", "clouds"};
		expected = 2;
		actual = Sort.findSmallest(input, 2);
		assertEquals(expected, actual);
	}

	@Test
	public void testSwap() {
		String[] input = {"cows", "dwell", "above", "clouds"};
		String[] expected = {"above", "dwell", "cows", "clouds"};
		Sort.swap(input, 0, 2);
		assertArrayEquals(expected, input);
	}
}