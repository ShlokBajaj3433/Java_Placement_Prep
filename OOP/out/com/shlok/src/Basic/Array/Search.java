package Basic.Array;

public class Search {

    static void search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index " + i);
            }
            else {
                System.out.println("Key not found at any index ");
            }
        }
    }
    public static void main(String[] args) {
        
        search(new int[]{1,2,3,4,5}, 3);
    }
}
