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
        int fornt=-1;
        int rear=-1;
        void enqeue(int val){
            if(fornt==-1)
                fornt++;
            if(rear==MAX_SIZE-1)
                throw new IndexOutOfBoundsException("queue is full");
            arr[++rear]=val;
        }
        void dequeue(){
            if(fornt==-1 || fornt>rear)
                throw new IndexOutOfBoundsException("queue is empty");
            else{
            System.out.println(arr[fornt++]);

            }
        }
        void display() {
            for (int i = fornt; i <=rear; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
