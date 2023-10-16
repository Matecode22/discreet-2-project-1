/*Test Cases for Tarea Integradora 1 - Algoritmos y Estructuras Discretas 

El código es copiado y pegado de lo que está en github.

*/


class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //Testing: HashMap

    //Case 1:
    CustomHashMap<String, Integer> hash1 = new CustomHashMap<>();

    assert hash1.size() == 0;
    System.out.println(hash1.size());
    
    //Los tests 2.x sirven para comprobar los métodos:
    // put, get, size
    //2.b también comprueba resize()
    
    //Case 2.a:
    hash1.put("example1", 11);
    assert hash1.size() == 1;
    assert hash1.get("example1") == 11;
    System.out.println(hash1.size() +", "+ hash1.get("example1"));

    //Case 2.b
    hash1.put("example2", 22);
    hash1.put("example3", 33);
    hash1.put("example4", 44);
    hash1.put("example5", 55);
    hash1.put("example6", 66);
    hash1.put("example7", 77);
    hash1.put("example8", 88);
    hash1.put("example9", 99);
    hash1.put("example10", 1010);
    hash1.put("example11", 1111);
    hash1.put("example12", 1212);
    hash1.put("example13", 1313);
    assert hash1.size() == 13;
    assert hash1.get("example13") == 1313;
    System.out.println("Size: " + hash1.size() + ", Value: " + hash1.get("example13"));

    //Case 2.c
    hash1.put("example69420", 69420);
    assert hash1.size() == 14;
    assert hash1.get("example69420") == 69420;
    System.out.println("Size: " + hash1.size() + ", Value: " + hash1.get("example69420"));

    /*Case 2.d
    hash1.put(null, 1616);
    it DOES throw an exception, so it stays as a comment
    */

    //comprobando remove
    //Case 3.a
    hash1.remove("example1");
    assert hash1.size() == 13;
    assert hash1.get("example1") == null;
    System.out.println("Size: " + hash1.size() + ", Value: " + hash1.get("example1"));

    //Case 3.b
    hash1.remove("example2");
    hash1.remove("example69420");
    assert hash1.size() == 11;
    assert hash1.get("example2") == null;
    assert hash1.get("example69420") == null;
    assert hash1.get("example3") == 33;
    System.out.println("Size: " + hash1.size() + ", Value1: " + hash1.get("example2") + ", Value2: " + hash1.get("example69420") + ", Value3: " + hash1.get("example3"));

    //Case 3.c
    hash1.remove("example1"); //already gone
    assert hash1.size() == 11;
    assert hash1.get("example1") == null;
    System.out.println("Size: " + hash1.size() + ", Value: " + hash1.get("example1"));


    //Testing: LinkedList
    //Case 4.a
    CustomLinkedList<String> ll = new CustomLinkedList<>();
    assert ll.size() == 0;
    System.out.println(ll.size());

    //Case 5.a
    ll.add("ex1");
    assert ll.size() == 1;
    assert ll.get(0).equals("ex1");
    System.out.println("Size: " + ll.size() + ", Value: " + ll.get(0));

    //Case 5.b
    ll.add("ex2");
    ll.add("ex3");
    ll.add("ex4");
    ll.add("ex5");
    ll.add("ex6");
    ll.add("ex7");
    assert ll.size() == 7;
    assert ll.get(0).equals("ex7");
    assert ll.get(6).equals("ex1");
    System.out.println("Size: " + ll.size() + ", Value0: " + ll.get(0) + ", Value6: " + ll.get(6));

  }
}


class CustomLinkedList<E> implements Iterable<E> {

    private Node<E> head;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public CustomIterator<E> iterator() {
        return new CustomIterator<>(head);
    }

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class CustomIterator<E> implements java.util.Iterator<E> {
        private Node<E> current;

        public CustomIterator(Node<E> head) {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements");
            }
            E data = current.data;
            current = current.next;
            return data;
        }
    }
}


class CustomHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private Entry<K, V>[] table;
    private int size;

    public CustomHashMap() {
        this.table = new Entry[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }

        int hash = hash(key);
        int index = getIndex(hash);

        if (table[index] == null) {
            table[index] = new Entry<>(hash, key, value, null);
            size++;
        } else {
            Entry<K, V> entry = table[index];
            while (entry != null) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
                entry = entry.next;
            }
            entry = table[index];
            table[index] = new Entry<>(hash, key, value, entry);
            size++;
        }

        if (size > table.length * LOAD_FACTOR) {
            resize();
        }
    }

    public V get(K key) {
        int hash = hash(key);
        int index = getIndex(hash);

        Entry<K, V> entry = table[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }

        return null;
    }

    public V remove(K key) {
        int hash = hash(key);
        int index = getIndex(hash);

        Entry<K, V> prev = null;
        Entry<K, V> current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }

        return null;
    }

    public int size() {
        return size;
    }

    public CustomLinkedList<K> keySet() {
        CustomLinkedList<K> keys = new CustomLinkedList<>();
        for (Entry<K, V> entry : table) {
            while (entry != null) {
                keys.add(entry.key);
                entry = entry.next;
            }
        }
        return keys;
    }

    private int hash(K key) {
        return key.hashCode();
    }

    private int getIndex(int hash) {
        return (hash & 0x7FFFFFFF) % table.length;
    }

    private void resize() {
        Entry<K, V>[] oldTable = table;
        table = new Entry[table.length * 2];
        size = 0;

        for (Entry<K, V> entry : oldTable) {
            while (entry != null) {
                put(entry.key, entry.value);
                entry = entry.next;
            }
        }
    }

    private static class Entry<K, V> {
        final int hash;
        final K key;
        V value;
        Entry<K, V> next;

        Entry(int hash, K key, V value, Entry<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}