package AdvanceRecursionProblems;

import java.util.ArrayList;

public class printSubset {
    public static void printArrayList(ArrayList<Integer> subset){
        for(int i=0; i< subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printArrayList(subset);
            return;
        }
        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        int n=3;
        findSubsets(n, subset);
    }
}
