import java.util.Arrays;

public class Rotation {
    // Function to perform left rotation by 'd' positions
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        int[] temp = new int[d];  // Create a temporary array to store the first d elements

        // Copy the first d elements into the temp array
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }

        // Move the elements from the temp array to the end of the original array
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int rotateBy = 2;  // Number of positions to rotate left

        System.out.println("Original Array: " + Arrays.toString(array));

        leftRotate(array, rotateBy);

        System.out.println("Array after left rotation: " + Arrays.toString(array));
    }
}
