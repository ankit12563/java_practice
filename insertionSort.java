public class insertionSort {
    public static void printInsertion(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,3,6,1,7,0};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int current = i;
            int j = i -1;
            while(j >= 0 && arr[j] > current){
                current = j;
            }
            arr[i] = current;
        }
        printInsertion(arr);
    }
}
