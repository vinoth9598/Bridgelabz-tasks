public class HashTable2 {

    public static void main(String[] args){

        String sentence = "“Paranoids are not \n" +
                "paranoid because they are paranoid but \n" +
                "because they keep putting themselves \n" +
                "deliberately into paranoid avoidable \n" +
                "situations”";
        String[] words = sentence.toLowerCase().split(" ");

        MyHashMaps <String, Integer> hashMap = new MyHashMaps<>();

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

    }
}

class MyMapNodes<K, V> {
    public K key;
    public V value;
    public MyMapNodes<K, V> next;

    public MyMapNodes(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return key + " : " + value;
    }
}
class MyLinkedLists<K, V> {
    public MyMapNodes<K, V> head;

    public void add(MyMapNodes<K, V> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            MyMapNodes<K, V> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public MyMapNodes<K, V> search(K key) {
        MyMapNodes<K, V> temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
class MyHashMaps<K, V> {
    private final int size = 10;
    private MyLinkedLists<K, V>[] buckets;

    public MyHashMaps() {
        buckets = new MyLinkedLists[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new MyLinkedLists<>();
        }
    }

    private int getBucketIndex(K key) {
        int hash = Math.abs(key.hashCode());
        return hash % size;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        MyLinkedLists<K, V> bucket = buckets[index];

        MyMapNodes<K, V> searchedNode = bucket.search(key);

        if (searchedNode == null) {
            MyMapNodes<K, V> newNode = new MyMapNodes<>(key, value);
            bucket.add(newNode);
        } else {
            searchedNode.value = value; // Update existing value
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        MyMapNodes<K, V> node = buckets[index].search(key);
        return (node == null) ? null : node.value;
    }
}

