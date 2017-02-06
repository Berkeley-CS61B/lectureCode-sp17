import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the methods of the Sort class */
public class TestSort {
    /** Tests Sort.sort. */
    @Test
    public void testSort() {
        String[] input = {"hello", "trump", "hug", "sandwich"};
        String[] expected = {"hello", "hug", "sandwich", "trump"};
        Sort.sort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testFindSmallest() {
        String[] input = {"zebra", "trump", "hug", "sandwich"};
        int expected = 2;
        int actual = Sort.findSmallest(input, 1);

        assertEquals(expected, actual);
    }

    @Test
    public void testSwap() {
        String[] input = {"hello", "trump", "hug", "sandwich"};
        String[] expected = {"hug", "trump", "hello", "sandwich"};
        Sort.swap(input, 0, 2);

        assertArrayEquals(expected, input);

    }
}

/*
        if (input.length != expected.length) {
                System.out.println("Error: Not Equal!");
                }

                int i = 0;
                while (i < input.length) {
        if (input[i] != expected[i]) {

        }
        }
        */