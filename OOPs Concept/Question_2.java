import java.util.Arrays;

class SortingHelper {

    public void sort(int[] arr) {
        Arrays.sort(arr);
    }

    public void sort(String[] arr) {
        Arrays.sort(arr);
    }
}

public class Question_2 {
    public static void main(String[] args) {
        SortingHelper helper = new SortingHelper();

        int[] intArray = {5, 3, 8, 1, 2};
        System.out.println("Before sorting integer array: " + Arrays.toString(intArray));
        helper.sort(intArray);
        System.out.println("After sorting integer array: " + Arrays.toString(intArray));

        String[] strArray = {"Banana", "Apple", "Cherry", "Mango"};
        System.out.println("Before sorting string array: " + Arrays.toString(strArray));
        helper.sort(strArray);
        System.out.println("After sorting string array: " + Arrays.toString(strArray));
    }
}
