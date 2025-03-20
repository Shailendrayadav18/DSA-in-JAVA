package sorting;

public class Merge {
    public static void merge_sort(int[] array, int first_id, int last_id){
        if(first_id<last_id){
            int mid = (first_id+last_id)/2;
            merge_sort(array, first_id, mid);
            merge_sort(array, mid+1, last_id);
            merge(array, first_id, last_id, mid);
        }
        
    }

    public static void merge(int[] array, int first_id, int last_id, int mid){
        int n1= mid-first_id+1;
        int n2 = last_id - mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i =0; i<n1; i++){
            arr1[i] = array[first_id+i];
        }
        for(int j =0; j<n2; j++){
            arr2[j] = array[mid+j+1];
        }

        int i = 0, j = 0;

        int k = first_id;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                array[k] = arr1[i];
                i++;
            }
            else {
                array[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = arr2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] array ={5, 4, 6, 3, 2, 8, 9, 1, 0};

        int first_id =0;
        int last_id = array.length-1;
        merge_sort(array, first_id, last_id);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
