
public class quick {

    static int Qwick(int[] arr, int low, int high) {
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
        int t = arr[high];
        arr[high] = arr[pindex];
        arr[pindex] = t;
        return pindex;
        // int pivot=arr[high];
        // int pindex=low;
        // for(int i=low;i<high;i++){
        // if(arr[i]<=pivot){
        // int t=arr[i];
        // arr[i]=arr[pindex];
        // arr[pindex]=t;
        // pindex++;
        // }
        // }
        // int temp=arr[high];
        // arr[high]=arr[pindex];
        // arr[pindex]=temp;
        // return pindex;
    }

    static void QwickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = Qwick(arr, low, high);
            QwickSort(arr, low, index - 1);
            QwickSort(arr, index + 1, high);
        }

    }

    static void printAll(int[] arr, int low, int high) {
        for (int i = low; i < high; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 24, 9, 29, 14, 19, 27 };
        System.out.println("Before merge sort");
        int n = arr.length;
        // System.out.println(n);
        printAll(arr, 0, n);
        System.out.println("After merge sort");
        QwickSort(arr, 0, n - 1);
        printAll(arr, 0, n);
    }
}
