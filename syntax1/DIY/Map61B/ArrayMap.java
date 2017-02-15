package Map61B;

import org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * An array based implementation of the Map61B class.
 */
public class ArrayMap<K, V> implements Map61B<K, V> {
    private K[] keys;
    private V[] values;
    int size;

    public ArrayMap() {
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    /** Returns the index of the given key if it exists,
     *  -1 otherwise. */
    private int keyIndex(K key) {
        for (int i = 0; i < size; i += 1) {
            if (keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }


    public boolean containsKey(K key) {
        return keyIndex(key) > -1;
    }

    public void put(K key, V value) {
        int keyIndex = keyIndex(key);
        if (keyIndex > 0) {
            values[keyIndex] = value;
            return;
        }
        keys[size] = key;
        values[size] = value;
        size = size + 1;
    }

    public V get(K key) {
        int keyIndex = keyIndex(key);
        return values[keyIndex];
    }

    public int size() {
        return size;
    }

    public List<K> keys() {
        ArrayList<K> keylist = new ArrayList<>();
        for (int i = 0; i < size; i += 1) {
            keylist.add(keys[i]);
        }
        return keylist;
    }

    /*@Test
    public void test() {
        ArrayMap<Integer, Integer> am = new ArrayMap<Integer, Integer>();
        am.put(2, 5);
        int expected = 5;
        assertEquals(expected, am.get(2));
    }*/

    public static void main(String[] args) {
        ArrayMap<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);
    }
}
