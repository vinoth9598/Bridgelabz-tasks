package CompareArray_hashset_Treeset;

import java.util.HashSet;

public class HashSearch {

    public static void main(String[] args){
        HashSet <Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        int key = 30 ;
        boolean found = set.contains(key);

        System.out.println("Fount :" + found);
    }
}
