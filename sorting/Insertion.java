package sorting;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {7,4,2,9,5,1};

        for(int i=1; i<arr.length; i++){
            int temp =arr[i];
            int j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
