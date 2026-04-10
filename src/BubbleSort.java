import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 4, 1};
        int[] sorted = bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] bubbleSort(int[] arr) {
        int[] sorted = arr.clone();

        for (int i = 0; i < sorted.length - 1; i ++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        return sorted;
    }
}