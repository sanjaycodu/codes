import java.util.*;
public class sort {
    public static void main(String[] args) {
            int[] arr={68,25,71,43,5};
            int[] ans=sort(arr);
            System.out.print(Arrays.toString(ans));
    }
            public static int[] sort(int[] arr){

                for(int i=0;i<=arr.length-2;i++){
                    int minindex=i;
                    for(int j=i+1;j<=arr.length-1;j++){
                        if(arr[minindex]>arr[j]){
                            minindex=j;
                        }
                    }
                    if(minindex !=i){
                        int temp= arr[i];
                        arr[i]=arr[minindex];
                        arr[minindex]=temp;
                    }
                }
                return arr;
            }
    
}
