package recursionBestProblems;

public class mapping {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printMappedValue(String str, int index, String combination){
        if(index==str.length()){

        }
        int value = str.charAt(index);
        for(int i=0; i<keypad[value].length(); i++){
            char currChar = keypad[value].charAt(i);
            printMappedValue(str, index+1, combination+currChar);
            
        }
    }
    public static void main(String[] args) {
        
    }
}
