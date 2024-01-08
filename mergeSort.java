public class mergeSort {
    public static void conqure(int arr[], int start, int median, int end){
        int merged[] = new int[end - start + 1];
        int index1 = start;
        int index2 = median + 1;
        int x = 0;

        while(index1<=median && index2<=end){
            if(arr[index1] <= arr[index2]){
                merged[x++] = arr[index1++];
            }
            else{
                merged[x++] = arr[index2++];
            }
        }
        while(index1 <= median){
            merged[x++] = arr[index1++];
        }
        while(index2 <= end){
            merged[x++] = arr[index2++];
        }
        for(int i = 0, j = start; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int median = start + (end - start)/2;
        divide(arr, start, median);
        divide(arr, median + 1, end);
        conqure(arr,start,median,end);

    }
    public static void main(String[] args) {
        int arr[] = {3,6,7,2,1,8,4,10,5,9};
        int n = arr.length;

        divide(arr,0,n-1);

        for(int i = 0; i<= n -1; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }
}
