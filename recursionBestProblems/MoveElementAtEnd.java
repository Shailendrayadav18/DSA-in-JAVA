package recursionBestProblems;

public class MoveElementAtEnd {
    public static void moveElement(String str, String new_String, int index, char element, int count){
        if(index == str.length()){
            for(int i=0; i<count; i++){
                new_String += 'x';
            }
            System.out.println(new_String);
            return;
        }
        if(str.charAt(index)==element){
            count++;
        }else{
            new_String += str.charAt(index);
        }
        moveElement(str, new_String, index+1, element, count);
    }
    public static void main(String[] args) {
        String str = "abxhjxdbxkjx";
        String new_String = "";
        char element='x';
        moveElement(str, new_String, 0, element, 0);
    }    
    
}
