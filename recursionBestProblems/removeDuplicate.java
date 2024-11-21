package recursionBestProblems;

public class removeDuplicate {

    public static boolean[] bool = new boolean[26];

    public static void removeDup (String str, int index, String new_String){
        if(index == str.length()){
            System.out.println(new_String);
            return;
        }
        char currChar = str.charAt(index);

        if(bool[currChar - 'a']){
            removeDup(str, index+1, new_String);
        }else{
            bool[currChar - 'a']=true;
            new_String += currChar;
            removeDup(str, index+1, new_String);
        }    
    }
    public static void main(String[] args) {
        String str = "abaccbdcadbf";
        String new_String ="";
        removeDup(str, 0, new_String);
    }
}
