import java.util.Arrays;

public class RecursiveSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sum(arr));
    }

    private static int sum(int[] numbers) {
        return numbers.length == 0 ? 0 : numbers[0] + sum((Arrays.copyOfRange(numbers, 1, numbers.length)));
    }
}