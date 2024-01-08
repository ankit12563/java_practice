public class selectionSort {
    public static void printSelection(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,7,1,9,8,4};
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int first = i;
            for(int j = i+1; j< n; j++){
                if(arr[j] < arr[first]){
                    first = j;
                }
            }
            int temp = arr[first];
            arr[first] = arr[i];
            arr[i] = temp;
        }
        printSelection(arr);
    }
}
