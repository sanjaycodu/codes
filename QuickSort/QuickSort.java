import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
    int low=0;
    int high=arr.length-1;
        QuickSort.qsort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
   static void qsort(int[] arr,int low,int high) {

       if (low > high)
           return;
       int start = low;
       int end = high;
       int mid = (low + high) / 2;
       int pivot = arr[mid];
       while (start <= end) {
           while (arr[start] < pivot)
               start++;
           while (arr[end] > pivot)
               end--;
           if(start<=end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
           }
       }
       qsort(arr, low, end);
       qsort(arr, start, high);
   }
}

