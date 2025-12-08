package CompareArray_hashset_Treeset;

public class ArraySearch {

    public static void main(String[] args){
        int arr[] = {10, 50, 30, 40, 20};

        int key =30 ;
        boolean found = false ;

        for(int i =0; i < arr.length; i++){
            if(arr[i] == key){
                found = true ;
                break;
            }
        }

        System.out.println("Array Search Found :" + found);
    }
}
