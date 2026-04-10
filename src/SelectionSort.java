import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 4, 1};
        int[] sorted = selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] selectionSort(int[] arr) {
        int[] sorted = arr.clone();

        for (int i = 0; i < sorted.length; i++) {
            int lowestIdx = i;
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[j] < sorted[lowestIdx]) lowestIdx = j;
            }
            int temp = sorted[i];
            sorted[i] = sorted[lowestIdx];
            sorted[lowestIdx] = temp;
        }

        return sorted;
    }
}
