package Queue;

public class ImplementUsingLinkedList {
    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
            this.next=null;
        }
    }

    static class Queue{
        static Node head;
        static Node tail;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        public static void add(int value){
            Node node=new Node(value);
            if(isEmpty()){
                head=node;
                tail=node;
                return;
            }
            tail.next=node;
            tail=node; 
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int value=head.value;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return value;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return head.value;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.remove();
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
