package Basic.Array;

//Sliding Window
public class MaxAvg {

    static double maxAvgKElement(int arr[], int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;
        int maxStart = 0;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if (sum > maxSum) {
                maxSum = sum;
                maxStart = i - k + 1;
            }
        }

        System.out.print("Max average subarray elements: ");
        for (int i = maxStart; i < maxStart + k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return (double) maxSum / k;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 3;

        System.out.print("Array elements: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println(maxAvgKElement(arr, k));
    }
}
