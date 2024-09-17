import java.util.*;
class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={64,25,12,22,11};
        System.out.print(Arrays.toString(sorting(arr)));
    }
    static int[] sorting(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while(0<j && arr[j-1]>arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
}
