package Queue;

public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int Rear=-1;
        static int Front=-1;

        Queue(int n) {
            arr=new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return Rear==-1;
        }

        public static void add(int value){
            if((Rear+1)%size==Front){
                System.out.println("Queue is full");
                return;
            }
            if(Front==-1){
                Front=0;
            }
            Rear=(Rear+1)%size;
            arr[Rear]=value;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int out = arr[Front];
            if(Front == Rear){
                Front =-1;
                Rear=-1;
            }else{
                Front = (Front+1)%size;
            }
            return out;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[Front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);
        q.remove();
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
