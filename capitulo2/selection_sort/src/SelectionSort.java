import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr));
    }

    public static List<Integer> selectionSort(List<Integer> list) {
        List<Integer> sorted = new ArrayList<>(list.size());

        int length = list.size();
        for (int i = 0; i < length; i++) {
            int smallest = findSmallest(list);
            sorted.add(list.get(smallest));
            list.remove(smallest);
        }

        return sorted;
    }

    public static Integer findSmallest(List<Integer> list) {
        int smallest = list.get(0);
        int index = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                index = i;
            }
        }

        return index;
    }
}
