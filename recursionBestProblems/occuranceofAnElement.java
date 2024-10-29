package recursionBestProblems;

public class occuranceofAnElement{
    public static void occuranceofElement(String str, int index, char element){
        if(index == -1){
            return;
        }
        int first_id=-1;
        int last_id=-1;

        occuranceofElement(str, index-1, element);

        if(str.charAt(index)== element){
            if(first_id == -1){
                first_id=index;
            }
            else{
                last_id = index;
            }
        }
        if(index==str.length()-1){
            System.out.println(first_id);
            System.out.println(last_id);
        }
    }
    public static void main(String[] args) {
        String str = "abacdaaefabda";
        int index = str.length()-1;
        char element='a';
        occuranceofElement(str, index, element);
    }
}