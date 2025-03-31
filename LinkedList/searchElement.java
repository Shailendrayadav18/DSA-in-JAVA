package LinkedList;

import java.util.LinkedList;

class searchElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        //Add (1, 5, 7, 3 , 8, 2, 3)
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        // search 7
        int i =0;
        while(list.get(i)!=7){
            i++;
        }
        System.out.println(i);
    }
}

