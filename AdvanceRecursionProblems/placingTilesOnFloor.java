package AdvanceRecursionProblems;

public class placingTilesOnFloor{
    public static int NumberOfWays(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            
            return 1;
        }
       int vertical= NumberOfWays(n-m, m);
       int horizontal= NumberOfWays(n-1, m);
       return vertical+horizontal;
    }
    public static void main(String[] args) {
        int n = 4;
        int m =2;
        System.out.println(NumberOfWays(n, m));
    }
}