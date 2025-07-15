//Find the sum of elements in an array

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 8, 9};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
