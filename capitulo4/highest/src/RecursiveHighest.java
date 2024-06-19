import java.util.Arrays;

public class RecursiveHighest {
    public static void main(String[] args) {
        int[] arr = {1, 10, 3, 25, 50, 6, 8};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {
        if (arr.length == 2)
            return arr[0] > arr[1] ? arr[0] : arr[1];

        int subMax = max(Arrays.copyOfRange(arr, 1, arr.length));
        return arr[0] > subMax ? arr[0] : subMax;
    }
}
