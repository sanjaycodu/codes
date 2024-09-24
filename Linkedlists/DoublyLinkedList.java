public class DoublyLinkedList {
    Node head;
    Node tail;
    public class Node{
        int data;
        Node next;
        Node prev;
         Node(int val){
            data=val;
            next=null;
            prev=null;
        }
    }
    DoublyLinkedList(){head=null;tail=null;}
    void insertAtFirst(int val){
    Node newnode=new Node(val);
        newnode.next=head;
    if(head==null){
        tail=newnode;
    }
    else{
        head.prev=newnode;
    }
    head=newnode;
}
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }public void displayrev(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println("");
    }
    void insertAtSpecific(int pos,int val){
        if(pos==0){insertAtFirst(val);
        return; }
        Node newnode=new Node(val);
        Node temp=head;
        for (int i = 1; i <pos; i++) {
            temp=temp.next;
        if(temp==null){
            throw new IllegalArgumentException("Invalid pos: "+pos) ;
        }
        }
        newnode.next=temp.next;
        newnode.prev=temp;
        if(temp==tail){
            tail=newnode;
        }else{
        //assing for doublylinked
        temp.next.prev=newnode;}
        temp.next=newnode;
    }
    void deleteAtspecificpos(int pos){
        Node temp=head;
        Node prev=null;
        for (int i = 1; i <=pos; i++) {
            prev=temp;
            temp=temp.next;
            if(temp==null)
                throw new ArrayIndexOutOfBoundsException("Invalid pos "+pos);
        }
        prev.next=temp.next;
        if(temp.next==null)
            temp=tail;
        else
        temp.next.prev=prev;
    }
    void deleteAtBegining(){
        head=head.next;
        if(head==null)
            tail=null;
        else
        head.prev=null;
    }

}
