import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
        int[] arr={68, 25, 71, 45, 5};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (flag==false) break;
        }
        return arr;
    } 
}
