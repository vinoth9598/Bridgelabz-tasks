public class BinaryTree {


    public static void main(String[] args){
        MyBinaryTree <Integer> tree = new MyBinaryTree<>();
        tree.add(56);
        tree.add(30);
        tree.add(70);
        tree.add(63);

        System.out.println("Root :" +tree.getRoot().getKey());
        System.out.println("Left Node :" + tree.getRoot().left.getKey());
        System.out.println("Right Node : "+ tree.getRoot().right.getKey());

//        size of the binary tree
        System.out.println("Size of tree :" + tree.size());

//        search method
        boolean found = tree.search(63);
        System.out.println("63 is Found Tree :" + found);
    }

}
interface INode<k>{
    k getKey();
    void setKey(k key);
}
class MyBinaryNode<k extends Comparable<k>> implements  INode<k>{
    private k key ;
    public MyBinaryNode<k> left ;
    public MyBinaryNode<k> right ;

    public MyBinaryNode(k key){
        this.key = key ;
        this.left = null ;
        this.right = null ;
    }

    @Override
    public k getKey(){
        return key ;
    }
    @Override
    public void setKey(k key){
        this.key = key ;
    }

}

class MyBinaryTree<k extends Comparable<k>>{
    private MyBinaryNode<k> root ;

    public void add(k key){
        this.root = addRecursively(root, key);
    }

    private MyBinaryNode <k> addRecursively(MyBinaryNode<k> current, k key){
        if(current == null){
            return new MyBinaryNode<>(key);
        }

        int compareResult = key.compareTo(current.getKey());

        if(compareResult == 0){
            return current ;
        }else if (compareResult < 0){
            current.left = addRecursively(current.left, key);
        }
        else {
            current.right = addRecursively(current.right, key);
        }
        return current ;

    }

    public MyBinaryNode<k> getRoot(){
        return root ;
    }

    public boolean search(k key){
        return searchRecursively(root, key);
    }

    private boolean searchRecursively(MyBinaryNode<k> current, k key){
        if (current == null){
            return false ;
        }

        int compareResult = key.compareTo(current.getKey()) ;

        if (compareResult == 0){
            return true ;
        }else if (compareResult <0){
            return searchRecursively(current.left, key);
        }else {
            return searchRecursively(current.right , key);
        }
    }

    public int size(){
        return getSize(root);
    }
    private int getSize(MyBinaryNode<k> node){
        if(node == null)
            return 0;
        return 1 + getSize(node.left) + getSize(node.right);
    }

}