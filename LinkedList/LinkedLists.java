package LinkedList;
import java.util.LinkedList;

class LinkedLists{
    public static void main(String[] args) {
        //Declare a Linked List
        LinkedList<String> list = new LinkedList<>();

        //Add value
        list.add("is");
        list.add("a");
        list.add("linked");
        
        //Add at first position
        list.addFirst("This");

        //Add at last position
        list.addLast("list");

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.size());

        //Remove element
        list.remove();  // By default first element
        System.out.println(list);

        //Remove using index
        list.remove(1);
        System.out.println(list);

        //Remove first
        list.removeFirst();

        //Remove last
        list.removeLast();

        System.out.println(list);

    }
}

