package recursionBestProblems;

public class checkSortedOrNot {
    public static boolean  sortedOrNot(int index, int[] arr){
        if(index == arr.length-1){
            return true;
        }

        if(arr[index]<arr[index+1]){
            index++;
        }else{
            return false;
        }
        return sortedOrNot(index, arr);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,8,9};
        int index=0;
        boolean bool=sortedOrNot(index, arr);
        System.out.println(bool);
    }
}
