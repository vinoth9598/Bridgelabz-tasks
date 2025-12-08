package CompareArray_hashset_Treeset;


import java.util.TreeSet;

public class TreeSearch {

    public static void main(String[] args){
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(40);

        int key = 40;

        boolean found = treeSet.contains(key);

        System.out.println("Found : " + found);
    }
}
