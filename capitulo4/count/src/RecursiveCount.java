import java.util.Arrays;

public class RecursiveCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(count(arr));
    }

    private static int count(int[] arr) {
        return arr.length == 0 ? 0 : 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
    }
}
