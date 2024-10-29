package recursion;

public class stackHeight2 {
    public static int calcXpowerN(int x, int n){
        if(n==1){
            return x;
        }
        if(x == 0){
            return 0;
        }

        int ans= calcXpowerN(x, n/2);
        if(n%2==0){
            return ans*ans;
        }
        else{
            return ans*ans*x;
        }
    }
    public static void main(String[] args) {
        int x=5;
        int n=4;
        int ans =calcXpowerN(x, n);
        System.out.println(ans);
    }
}
