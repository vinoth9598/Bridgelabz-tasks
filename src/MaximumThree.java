public class MaximumThree {

    public static void main(String[] args){
        MaximumNumber <Integer> maxObj = new MaximumNumber<>();

        System.out.println("T.C 1 (Max at 1st ) :" +  maxObj.findMax(30, 20, 10));


        System.out.println("T.C 2 (Max at 2nd) :" + maxObj.findMax(10, 40, 20));


        System.out.println("T.C 3 (Max at 3rd) :" + maxObj.findMax(10, 20, 50));


    }
}

class MaximumNumber<T extends Comparable<T>> {

    public T findMax(T a, T b, T c){
        T max = a;

        if(b.compareTo(max) > 0){
            max = b ;
        }
        if(c.compareTo(max) > 0){
            max = c ;        }
        return max ;
    }
}
