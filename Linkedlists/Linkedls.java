public class  Linkedls {
    Node head;
   public class Node{
        int data;
        Node next=null;
        Node(int val){data=val; next=null;}
          //  System.out.println("hai");}
    }Linkedls(){head=null;}

    void addListFirstPlace(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }
      public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
}
