package Queue;

public class ImplementUsingArray{
    static class Queue{
        static int arr[];
        static int size;
        static int Rear = -1;

        Queue(int n) {
            arr=new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            if(Rear==-1){
                return true;
            }
            else{
                return false;
            }
        }
        
        public static void add(int value){
            if(Rear==size-1){
                System.out.println("Queue is not empty");
                return;
            }
            Rear++;
            arr[Rear]=value;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int Front = arr[0];

            for(int i=0; i<Rear; i++){
                arr[i]=arr[i+1];
            }
            Rear--;
            return Front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}