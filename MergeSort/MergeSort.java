import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        arr = mSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mSort(int[] arr) {
        if (arr.length == 1)
            return arr;
        int mid = arr.length / 2;
        int[] left = mSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] joined = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                joined[k++] = first[i++];
            } else if (first[i] > second[j]) {
                joined[k++] = second[j++];
            }
        }
        while (i < first.length) {
            joined[k++] = first[i++];
        }
        while (j < second.length) {
            joined[k++] = second[j++];
        }
        return joined;
    }
}
