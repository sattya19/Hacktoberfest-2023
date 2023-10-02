public class QuickSort {

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pindex = low;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[pindex];
                arr[pindex] = temp;
                pindex++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[pindex];
        arr[pindex] = temp;
        return pindex;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }
    }

    static void printAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 24, 9, 29, 14, 19, 27 };
        System.out.println("Before quick sort:");
        printAll(arr);
        System.out.println("After quick sort:");
        quickSort(arr, 0, arr.length - 1);
        printAll(arr);
    }
}
