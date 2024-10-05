public class Queue2 {
    public static void main(String[] args) {
        QueueDemo1 queue= new QueueDemo1();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.display();
        queue.dequeue();
        queue.dequeue();
    }
}
class QueueDemo1{
    class Node{
        int data;
        Node next;
        Node(int val){data=val; next=null;}
    }
    Node front,rear;
    QueueDemo1(){
        front =null; rear=null;}
    void enqueue(int val){
        Node newnode=new Node(val);
        if(front ==null){
            front =newnode;
        }else{
        rear.next=newnode;
         }
        rear=newnode;
    }
     void dequeue(){
        if(front ==null)
            System.out.println("list is empty");
        else{
            int temp1=front.data;
        front = front.next;
        if(front==null)
            rear=null;
            System.out.println(temp1+" is dequeued");
        }
     }
     void display(){
         if(front ==null){
             throw new IndexOutOfBoundsException("list is ewmpty");}
         System.out.println("-------Queue has-------");
        Node temp= front;
         while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
         }
         System.out.println("");
     }
}
