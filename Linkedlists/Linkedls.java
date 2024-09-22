public class  Linkedls {
    Node head;
   public class Node{
        int data;
        Node next=null;
        Node(int val){data=val; next=null;}
    }Linkedls(){head=null;}

    void addListFirstPlace(int val) {
        Node newnode = new Node(val);
      //  Node temp=head;
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }
    void addSpecificpos(int pos,int val){
        Node newnode = new Node(val);
            Node temp=head;
        for (int i = 1; i < pos; i++) {
            temp=temp.next;
            if(temp==null){
                throw new IllegalArgumentException("Invalid pos: "+pos) ;
            }
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    void deleteSpecficpos(int pos){
       Node temp=head;
       Node prev=null;
        for (int i = 1; i <=pos; i++) {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
      public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
}
