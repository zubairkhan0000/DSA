//import java.util.Arrays;
import java.util.LinkedList;

class HashTable2 {
    private LinkedList<Integer>[] data;
    private int size; 
    private static final int INITIAL_CAPACITY = 10; 
    //public static final int c1 = 1;
    //public static final int c2 = 1;

    @SuppressWarnings("unchecked")
    public HashTable2() {
        data = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < data.length; i++) {
            data[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int hash(int key) {
        return key % data.length;
    }

    public void put(int key) {
        if (size >= data.length * 0.75) {
            rehash();
        }
        int hashKey = hash(key);
        data[hashKey].add(key);
        size++;
    }

    private void rehash() {
        int newSize = data.length * 2;
        @SuppressWarnings("unchecked")
        LinkedList<Integer>[] newData = new LinkedList[newSize];
        for (int i = 0; i < newSize; i++) {
            newData[i] = new LinkedList<>();
        }
        for (LinkedList<Integer> list : data) {
            for (int value : list) {
                int hashKey = hash(value);
                newData[hashKey].add(value);
            }
        }
        data = newData;
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print("Index: " + i + " -> ");
            for (int value : data[i]) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

public class ReHashingEx {
    public static void main(String[] args) {
        HashTable2 h1 = new HashTable2();
        h1.put(5);
        h1.put(10);
        h1.put(15);
        h1.put(100);
        h1.display();
    }
}
