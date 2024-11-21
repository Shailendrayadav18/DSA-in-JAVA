package recursionBestProblems;

public class printSubsequences{
    public static void subSequences(String str, int index, String new_String){
        if(index == str.length()){
            System.out.println(new_String);
            return;
        }
        char currChar = str.charAt(index);
        subSequences(str, index+1, new_String+currChar);
        subSequences(str, index+1, new_String);
    }
    
    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, 0, "");
    }
}