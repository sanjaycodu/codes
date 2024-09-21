import java.util.*;
class DynamicArray <T>{

  static final int initialcap=2;
    int capacity;
    int size;
    T[] arr;

    DynamicArray(){
      capacity=initialcap;
      size=0;
      arr= (T[]) new Object[initialcap];
    }
    
    void add(T val){
      if(size==capacity){ 
          doublesize();
      }
        arr[size]=val;
        size++;
    }
    void doublesize(){

      capacity=capacity*2;
      arr=Arrays.copyOf(arr,capacity);
    }
      void display(){ 
        for (int i = 0; i <size; i++) {
          System.out.print(arr[i]+" ");
        }
        }
        //System.out.println(Arrays.toString(arr));}

      void addAtPos(int pos, T val){
        if(size==capacity)
        doublesize();
         for (int i =size-1; i >=pos; i--) {
          arr[i+1]=arr[i];}
          arr[pos]=val;
          size++;
         
      }
      void deleteAtPos(int pos){
          for (int i = pos+1; i < size; i++){
            arr[i-1]=arr[i];}
            size--;
            if(capacity> initialcap && capacity>size*3){
            shrink();
          }

          
      }

void shrink(){
  
  capacity=capacity/2;
  arr=Arrays.copyOf(arr, capacity);
  
}

}
class vm{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        DynamicArray<Integer>list= new DynamicArray<Integer>();
        int val,pos;
        while(true){
          System.out.println(" ");
        System.out.println("1:insert at end");
        System.out.println("2:Display the elements");
        System.out.println("3:Add at specific position ");
        System.out.println("4:Delete at specific position");
        System.out.println("5:Exit");
        System.out.print("Enter the choice:");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
            System.out.println("enter the data");
             val=scanner.nextInt();
            list.add(val);
            break;
            case 2:
            list.display();
            break;
            case 3:
            System.out.println("Enter to specific pos(starts form 0)");
             pos=scanner.nextInt();
            System.out.println("Enter the dat:");
            val=scanner.nextInt();
            list.addAtPos(pos,val);
            break;
            case 4:
            System.out.println("Enter pos to Delete");
            pos=scanner.nextInt();
            list.deleteAtPos(pos);
            break;
            case 5:
            System.exit(0);

        }
      }
    }
}

