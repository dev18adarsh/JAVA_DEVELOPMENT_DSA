package Basics_Learning.algo;

public class binary_search {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{2, 3, 1, 34, 2, 5},34));
    }
    public static int binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target > arr[mid]){
                low = mid + 1;
            }
            else{//how to make binary search imp.
                high = mid - 1;
            }
        }
        return -1;//if element not found// return -1.
    }
}
