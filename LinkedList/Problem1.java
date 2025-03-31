package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        //Number of value you want to add
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();

        // Add value in range 1-50
        int value;
        for (int i = 0; i < element; i++) {
            value = sc.nextInt();
            list.add(i, value);
        }

        //Delete all value greater than 25
        int i=0;
        while(i!=list.size()){
            if(list.get(i)>25){
                list.remove(i);
            }
            else{
                i++;
            }
        }

        System.out.println(list);
    }
}
