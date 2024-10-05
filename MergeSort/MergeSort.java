import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
         mSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mSort(int[] arr,int start,int end) {
        if (end-start == 1)
            return;
        int mid = (start+end) / 2;
          mSort(arr, start, mid);
          mSort(arr, mid, end);
         merge(arr, start,mid,end);
    }

    static void merge( int[] arr,int s,int m,int e) {
        int[] joined = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                joined[k++] = arr[i++];
            } else{
                joined[k++] = arr[j++];
            }
        }
        while (i < m) {
            joined[k++] = arr[i++];
        }
        while (j < e) {
            joined[k++] = arr[j++];
        }
        for (int l = 0; l < joined.length; l++) {
            arr[s+l]=joined[l];
        }
    }
}
