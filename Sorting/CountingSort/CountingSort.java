import java.util.*;
public class CountingSort {
    public static void main(String[] args) {
        int[] arr ={6,1,4,2,3,2};
        System.out.print(Arrays.toString(sorting(arr)));
    }
    static int[] sorting(int[] arr){
        int size=arr.length;
        int[] count_arr= new int[7]; //don't give size. should give highest element+1;
        for (int j : arr) {
            count_arr[j] += 1; //or we can use i++;
        }
        for (int i = 1; i < 7; i++) {
            count_arr[i]=count_arr[i-1]+count_arr[i];
        }
        int[] ans=new int [6];
        List<Integer> list=new ArrayList<>();
        for (int i = arr.length-1; i >=0 ; i--) { //so that will give stabelsort
            ans[count_arr[arr[i]]-1]=arr[i];
            count_arr[arr[i]]--;
        }
        return ans;
    }
}
