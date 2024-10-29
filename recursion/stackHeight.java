package recursion;

public class stackHeight {
    public static int calcValue(int x, int n){
        if(n==1){
            return 2;
        }
        if(x==0){
            return 0;
        }
        int valueNm1 = calcValue(x, n-1);
        int valueN = x * valueNm1;
        return valueN;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcValue(x, n);
        System.out.println(ans);
    }
    
}
