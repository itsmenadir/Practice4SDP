package task4;

public class NameRepository {
    public String names[] = {"John", "Jane", "Alice", "Bob"};
    public Iterator getIterator() {
        return new NameIterator();
    }
}
