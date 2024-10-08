public class queue {
    public static void main(String[] args) {
        queueDemo queue=new queueDemo();
        queue.enqeue(5);
        queue.enqeue(6);
         queue.display();
         queue.dequeue();
         queue.display();
    }
    }
     class queueDemo{
        static final int MAX_SIZE=20;
        int[] arr=new int[MAX_SIZE];
        int front=0;
        int rear=-1;
        void enqeue(int val){
            if(rear==MAX_SIZE-1)
                throw new IndexOutOfBoundsException("queue is full");
            arr[++rear]=val;
        }
        void dequeue(){
            if(rear==-1)
                throw new IndexOutOfBoundsException("queue is empty");
            else{ 
            int temp=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
                rear--;
            }
            System.out.println(temp+" is dequeued");
            }
        }
        void display() {
            System.out.println("-----------Qeue has---------- ");
            for (int i = front; i <=rear; i++) {
                System.out.println(arr[i]+" ");
            }
            System.out.println("");
        }
    }
