package sorting;

public class Quick {
    public static void Quick_Sort(int[] array, int first_id, int last_id){
        if(first_id<last_id){
            int q = partition(array, first_id, last_id);
            Quick_Sort(array, first_id, q-1);
            Quick_Sort(array, q+1, last_id);
    }
   }

    public static int partition(int[] array, int first_id, int last_id){
        int X = array[last_id];
        int i = first_id-1;
        for(int j =first_id; j<last_id; j++){
            if(array[j] <= X){
                i++;
                int temp = array[i];
                array[i]= array[j];
                array[j] =temp;
            }
        }
        array[last_id]= array[i+1];
        array[i+1]=X;
        return i+1;
    }
    public static void main(String[] args) {
        int[] array= {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int last_id=array.length-1;
        Quick_Sort(array, 0, last_id);
        for(int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
