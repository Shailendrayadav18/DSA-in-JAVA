package recursionBasicProblem;

public class Program2 {
    public static int calculateSum(int n){
        if(n==1){
            return n;
        }
        return n + calculateSum(n-1); 
        
    }
    public static void main(String[] args) {
        System.out.println(calculateSum(5));
    }
}
