public class StringMaxThree {

    public static void main(String[] args){
        MaxmiumString<String> myStr = new MaxmiumString<>();

        System.out.println("T.C 1 (Max at 1st ) :" +  myStr.findMax("Apple", "Peach", "Banana"));


        System.out.println("T.C 2 (Max at 2nd) :" + myStr.findMax("Banana", "Apple","Peach"));


        System.out.println("T.C 3 (Max at 3rd) :" + myStr.findMax("Peach", "Banana", "Apple"));
    }
}

class MaxmiumString<T extends Comparable<T>> {
    public T findMax(T first, T second, T third){

        T max = first ;

        if(second.compareTo(max) > 0){
            max = second ;
        }
        if(third.compareTo(max) > 0){
            max = third ;
        }

        return max ;
    }
}