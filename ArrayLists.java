import java.util.ArrayList;
import java.util.Collections;
class ArrayLists {
    public static void main(String[] args) {
        //Declare an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        //Add values
        list.add(4);
        list.add(2);
        list.add(6);
        list.add(10);

        //Print value
        System.out.println(list);

        //Sort ArrayList
        Collections.sort(list);
        System.out.println(list);

        //Get a value from it's index
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        //Add value in between
        list.add(1, 3);
        System.out.println(list);

        //Set value or update value
        list.set(0, 0);
        System.out.println(list);

        //Delete value
        list.remove(0);
        System.out.println(list);

        //Size of list
        int size = list.size();
        System.out.println(size);

        //Loop on list
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
