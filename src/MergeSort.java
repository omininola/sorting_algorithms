import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 4, 1};
        int[] arr = mergeSort(numbers.clone());
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr) {
        int lenght = arr.length;
        int middleIdx = arr.length / 2;

        if (lenght <= 1) return arr.clone();

        int[] leftArr = Arrays.copyOfRange(arr, 0, middleIdx);
        int[] rightArr = Arrays.copyOfRange(arr, middleIdx, lenght);

        mergeSort(leftArr);
        mergeSort(rightArr);
        return merge(leftArr, rightArr, arr);
    }

    private static int[] merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftLength = leftArr.length;
        int rightLength = rightArr.length;
        int i = 0, l = 0, r = 0;

        while (l < leftLength && r < rightLength) {
            if (leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                l++;
            } else {
                arr[i] = rightArr[r];
                r++;
            }
            i++;
        }

        while (l < leftLength) {
            arr[i] = leftArr[l];
            i++;
            l++;
        }

        while (r < rightLength) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }

        return arr;
    }
}
