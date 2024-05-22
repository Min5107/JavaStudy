package generic.test.ex2;

public class Pair <K, V>{
    private K key;
    private V value;

    public K getFirst() {
        return key;
    }

    public void setFirst(K key) {
        this.key = key;
    }

    public V getSecond() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public void setSecond(V value) {
        this.value = value;
    }
}
