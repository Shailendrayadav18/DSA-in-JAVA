package sorting;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {7, 6, 8,3,2,9};

        for(int i=0; i<arr.length-1; i++){
            int index = i;
            int min = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<min){
                    index =j;
                    min = arr[j];
                }
            }
            arr[index]=arr[i] ;
            arr[i]=min;
        }

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
