//Find the minimum element

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {18, 9, 34, 2, 77};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}
