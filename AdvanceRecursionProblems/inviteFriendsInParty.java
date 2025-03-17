package AdvanceRecursionProblems;

public class inviteFriendsInParty {
    public static int TotalWaysToInvite(int n){
        if(n<=0){
            return 1;
        }
        int single= TotalWaysToInvite(n-1);
        int couple = (n-1)*TotalWaysToInvite(n-2);
        return single + couple;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(TotalWaysToInvite(n));
    }
}
