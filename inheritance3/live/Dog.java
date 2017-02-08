public class Dog implements Comparable<Dog> {
    private String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

    /** Returns negative number if this dog is less than the dog pointed at by o, and so forth. */
    public int compareTo(Dog uddaDog) {
        return this.size - uddaDog.size;
    }

}