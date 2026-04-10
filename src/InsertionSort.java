import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 4, 1};
        int[] sorted = insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] insertionSort(int[] arr) {
        int[] sorted = arr.clone();

        for (int i = 0; i < sorted.length; i++) {
            int temp = sorted[i];
            int pointer = i - 1;

            while (pointer >= 0 && sorted[pointer] > temp) {
                sorted[pointer + 1] = sorted[pointer];
                pointer--;
            }

            sorted[pointer + 1] = temp;
        }

        return sorted;
    }
}
