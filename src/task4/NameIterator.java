package task4;



public class NameIterator implements Iterator {
    int index;
    public boolean hasNext() {
        return index < names.length;
    }

    public Object next() {
        if (this.hasNext()) {
            return names[index++];
        }
        return null;
    }
}

