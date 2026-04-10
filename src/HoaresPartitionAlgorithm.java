import java.util.Arrays;

public class HoaresPartitionAlgorithm {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 6, 5, 1, 4};
        System.out.println(Arrays.toString(partition(numbers.clone())));
    }

    public static int[] partition(int[] arr) {
        int pivot = arr[0];

        int pointerA = 0;
        int pointerB = arr.length - 1;

        while (pointerA < pointerB) {

            while (arr[pointerA] < pivot) {
                pointerA++;
            }

            while (arr[pointerB] > pivot) {
                pointerB--;
            }

            if (pointerA <= pointerB) {
                int temp = arr[pointerA];
                arr[pointerA] = arr[pointerB];
                arr[pointerB] = temp;
            }
        }

        return arr;
    }
}
