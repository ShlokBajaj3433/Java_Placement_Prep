package Basic.Array;
//Sliding Window
public class MaxSumKElement {
    static int maxSumKElement(int arr[], int k) {
        int currentSum = 0;
        int maxSum=Integer.MAX_VALUE;
        int maxStart=0;
       
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        maxSum = currentSum;
        
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];
            if (currentSum>maxSum) {
                maxSum = Math.max(currentSum, maxSum);
                maxStart = i - k + 1;
            }
        }

        System.out.print("Max Sum subarray elements: ");
        for (int i = maxStart; i < maxStart + k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return currentSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 2;
        
        System.out.println(maxSumKElement(arr, k));
    }
}
