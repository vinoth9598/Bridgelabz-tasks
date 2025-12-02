package HashTableRemove.java;

public class HashTableRemove {
    public static void main(String[] args){

        String sentence = "“Paranoids are not paranoid \n" +
                "because they are paranoid but \n" +
                "because they keep putting themselves \n" +
                "deliberately into paranoid avoidable \n" +
                "situations”";

        String[] words = sentence.toLowerCase().split(" ");

        MyHashMap<String, Integer> hashMap = new MyHashMap<>();

        for(String word : words){
            Integer count = hashMap.get(word);

            if(count == null){
                hashMap.put(word, 1);
            }else {
                hashMap.put(word, count + 1);
            }
        }

        System.out.println("Word Frequencies :");
        for(String word : words){
            System.out.println(word + " - " +hashMap.get(word));
        }

        System.out.println("\nRemoving 'avoidable'...");
        hashMap.remove("avoidable");

        System.out.println("Frequency of 'avoidable' after removal = " + hashMap.get("avoidable"));
    }
}

class MyMapNode<K, V> {
    public K key;
    public V value;
    public MyMapNode<K, V> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return key + " : " + value;
    }
}
class MyLinkedList<K, V> {
    public MyMapNode<K, V> head;

    public void add(MyMapNode<K, V> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            MyMapNode<K, V> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public MyMapNode<K, V> search(K key) {
        MyMapNode<K, V> temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean remove(K key) {
        if (head == null) return false;

        // If first node is the key
        if (head.key.equals(key)) {
            head = head.next;
            return true;
        }

        MyMapNode<K, V> temp = head;
        while (temp.next != null) {
            if (temp.next.key.equals(key)) {
                temp.next = temp.next.next;  // skip node
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


}
class MyHashMap<K, V> {
    private final int size = 10;
    private MyLinkedList<K, V>[] buckets;

    public MyHashMap() {
        buckets = new MyLinkedList[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new MyLinkedList<>();
        }
    }

    private int getBucketIndex(K key) {
        int hash = Math.abs(key.hashCode());
        return hash % size;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        MyLinkedList<K, V> bucket = buckets[index];

        MyMapNode<K, V> searchedNode = bucket.search(key);

        if (searchedNode == null) {
            MyMapNode<K, V> newNode = new MyMapNode<>(key, value);
            bucket.add(newNode);
        } else {
            searchedNode.value = value; // Update existing value
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        MyMapNode<K, V> node = buckets[index].search(key);
        return (node == null) ? null : node.value;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        buckets[index].remove(key);
    }
}

