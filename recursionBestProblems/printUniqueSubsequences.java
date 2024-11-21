package recursionBestProblems;

import java.util.HashSet;

public class printUniqueSubsequences {
    public static void UniqueSubsequence(String str, int index, String newString, HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(index);
        UniqueSubsequence(str, index+1, newString+currChar, set);
        UniqueSubsequence(str, index+1, newString, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        UniqueSubsequence(str, 0, "", set);
    }
}
