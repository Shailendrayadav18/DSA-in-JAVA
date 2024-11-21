package recursionBestProblems;

public class occuranceofAnElement{

    public static int first_id =-1;
    public static int last_id=-1;

    public static void occuranceofElement(String str, int index, char element){
        if(index == str.length()){
            System.out.println(first_id);
            System.out.println(last_id);
            return;
        }

        if(str.charAt(index)== element){
            if(first_id == -1){
                first_id=index;
            }
            else{
                last_id = index;
            }
        }

        occuranceofElement(str, index+1, element);

    }
    public static void main(String[] args) {
        String str = "bacdaaefabda";
        int index = 0;
        char element='d';
        occuranceofElement(str, index, element);
    }
}