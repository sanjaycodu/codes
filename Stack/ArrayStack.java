public class ArrayStack<T>{
    static final int MAX_SIZE=30;
    T arr[]= (T[]) new Object[MAX_SIZE];
    int top;
    ArrayStack(){ top=-1;}

    void push(T val){
        if(top== MAX_SIZE-1 )
            throw new IndexOutOfBoundsException("Stack is overflow");
        arr[++top]=val;
        System.out.println(val+" is pushed");
    }
    void pop(){
        if(top==-1)
            throw new IndexOutOfBoundsException("Stack is underflow");
        System.out.println(arr[top--]+" is deleted");
    }
    void peek(){

        System.out.println(arr[top]+" is in the peek");
    }
    void isEmpty(){
        if(top==-1)
            System.out.println("Yes,Stack is empty");
        else
            System.out.println("No,Stack is not empty");
    }
}
