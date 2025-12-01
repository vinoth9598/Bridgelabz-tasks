
import java.util.LinkedList ;

public class Dsa {

    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<>();

//      uc list add new integer
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list.toString());

        System.out.println("______________________________");
        System.out.println("find the 30 key in linked list");
        findNode(list);
        System.out.println("______________________________");


//        list pop method is used
        int newList = list.pop();
        System.out.println(newList);

//        list remote last element
        list.removeLast();
        System.out.println(list.toString());


    }

    private static void findNode(LinkedList<Integer> list) {
        for(int lists : list){
            if(lists == 30){
                System.out.println(lists + " Key found to the linked list");
            }
        }

        //    add new elements in list
        list.add(2, 40);
        System.out.println("Add new element is : " + list.toString());

//      remove elements 40
        list.remove(2);
        System.out.println("Remove element is : " + list.toString());

//      sort to linkedList ;
        list.add(2, 40);


    }
}



