public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int element=7;
        System.out.println(search(arr,element));
    }
    static int search(int[] arr,int element){
        boolean asecnding= arr[0]<arr[1];
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if (arr[mid]==element){System.out.print("element index: "); return mid;}
            if(asecnding){
            if(arr[mid]>element){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }else{
            if(arr[mid]<element){
            end=mid-1;
        }
        else{
            start=mid+1;
        }

        }
    }
        return -1;
    }
    
}
