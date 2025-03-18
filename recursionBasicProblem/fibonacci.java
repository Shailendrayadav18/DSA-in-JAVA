package recursionBasicProblem;

public class fibonacci{
    public static void printFibonacci(int pre, int current, int i, int n){
        if (i==n){
            int next = pre + current;
            System.out.println(next);
            return;
        }
        int next = pre + current;
        System.out.println(next);
        printFibonacci(current, next, i+1, n);
    }

    public static void main(String[] args) {
        int pre = 0;
        int current= 1;
        System.out.println(pre);
        System.out.println(current);
        int i= 3;
        int n= 10;
        printFibonacci(pre, current, i, n);
    }
}