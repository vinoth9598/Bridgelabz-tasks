package Sorting;

public class BubbleSort {

    public static void main(String[] args){
        int arr[] = {6, 8, 7, 9, 10, 5, 4, 3, 2, 1};

        int[] result = bubbleSort(arr);

        for(int sortArray : result){
            System.out.print(sortArray + " ");
        }
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length ;

        for(int i = 0; i< n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }

        }
        return arr ;
    }

}
