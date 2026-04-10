import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 4, 1};
        int[] sorted = quickSort(numbers.clone(), 0, (numbers.length - 1));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(sorted));
    }
    
    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[high];
            int i = (low - 1);

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            quickSort(arr, low, i);
            quickSort(arr, (i + 2), high);
        }

        return arr;
    }
}
