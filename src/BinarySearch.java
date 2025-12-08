public class BinarySearch {

    public static void main(String[] args){
        int[] arr = {10,20,30,40, 50};
        int key = 30;

        int result = binarySearch(arr, key);
        if(result != -1){
            System.out.println("Element found at index :" + result);
        }else {
            System.out.println("Element not found!");
        }
    }

    public static int binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right)/2;

            if(arr[mid] == key){
                return mid ;
            }

            if(key < arr[mid]){
                right = mid - 1;
            }else {
                left = mid + 1 ;
            }
        }

        return -1;
    }
}
