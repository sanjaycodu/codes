public class LinkedStack<T> {
    Node top;
    public class Node{
        T data;
        Node next;
        Node(T val){
            data=val;
            next=null;
        }
    }

    LinkedStack(){top=null;}
    void push(T val){
        Node newnode= new Node(val);
        newnode.next=top;
        top=newnode;
        System.out.println(newnode.data+" is pushed");
    }
    void pop(){
        if(top==null)
            throw  new IndexOutOfBoundsException("Stack is underflow");
        else {
            T temp= top.data;
            top = top.next;
            System.out.println(temp+" is deleted");
        }
    }
    void peek(){
        if(top==null)
            throw new IndexOutOfBoundsException("Stack is empty");
        else
            System.out.println(top.data+" is at peek");
    }
}
