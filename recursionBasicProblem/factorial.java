package recursionBasicProblem;

public class factorial {
    public static int calcFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1 = calcFactorial(n-1);
        int fact = n*fact_nm1;
        return fact;
    }
    public static void main(String[] args) {
        int ans=calcFactorial(5);
        System.out.println(ans);
    }
}
