public class Sorting {
    public static void main(String[] args){
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before  sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Sort.selectionSort(arr, n);
        //Sort.bubbleSort(arr, n);
        Sort.insertionSort(arr, n);


    }
}

class Sort{
    public static void selectionSort(int arr[], int n ){

        for (int i = 0; i <= n-2; i++){
            int min = i;
            for (int j = i; j <= n-1; j++){
                if (arr[j] < arr[min]){
                   min = j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort : ");
        for (int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[], int n){
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j< n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After bubble sort : ");
        for (int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int arr[], int n){
        for (int i = 0; i<= n-1; i++){
            int j = i;
            while(j >0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("After insertion sort : ");
        for (int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
