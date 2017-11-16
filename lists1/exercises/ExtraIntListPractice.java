public class ExtraIntListPractice {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        if (L == null){
            return null;
        }
        return new IntList(L.first + x, incrList(L.rest, x));
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        if (L == null){
            return L;
        }
        L.first = L.first + x;
        L.rest = dincrList(L.rest, x);
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.tail = new IntList(7, null);
        L.tail.tail = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));        
    }
}
