import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int arr[] = new int[] {10, 5, 1, 9, 0, 2, 3, 4, 6, 7, 8};
        int key = 0;
        int index = Arrays.binarySearch(arr, 4, 7, key);
        System.out.println("Element found at index: " + index);
    }
}
