import java.util.Comparator;

public class MaxmiumFloatThree {

    public static void main(String[] args){
        MaximumNumbers <Float> maxObj = new MaximumNumbers<>();

        System.out.println("T.C 1 (Max at 1st ) :" +  maxObj.findMax(30.23f, 20.43f, 10.45f));


        System.out.println("T.C 2 (Max at 2nd) :" + maxObj.findMax(10.54f, 40.89f, 20.65f));


        System.out.println("T.C 3 (Max at 3rd) :" + maxObj.findMax(10.18f, 20.90f, 50.67f));
    }
}

class MaximumNumbers<T extends Comparable<T>> {
    public T findMax(T a, T b, T c){
        T max = a;

        if(b.compareTo(max) > 0){
            max = b ;
        }
        if(c.compareTo(max) >0){
            max = c ;
        }
        return max ;
    }
}
