public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 8, 1};

        int result = linearSearch(arr, 6);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}