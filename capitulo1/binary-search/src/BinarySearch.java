public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1, 3, 5, 7, 9, 23};
        System.out.println(binarySearch(list, 23));
        System.out.println(binarySearch(list, 59));
        System.out.println(recursiveBinarySearch(list, 0, list.length, 23));
        System.out.println(recursiveBinarySearch(list, 0, list.length, 59));
    }

    // Returns the position of the number passed as argument
    public static Integer binarySearch(int[] list, int item) {
        if (isListEmpty(list)) {
            return -1;
        }
        
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }

    public static boolean isListEmpty(int[] list) {
        int listSize = list.length;
        return listSize == 0;
    }

    private static Integer recursiveBinarySearch(int[] list, int low, int high, int item) {
        int mid = low + high / 2;

        if (high == 0 || mid == list.length) {
            return null;
        }

        if (list[mid] == item) {
            return mid;
        } else if (list[mid] > item) {
            return recursiveBinarySearch(list, low, high-1, item);
        } else {
            return recursiveBinarySearch(list, low + 1, high, item);
        }
    }
}
