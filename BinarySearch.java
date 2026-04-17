public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        int target = 73;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int result = binarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int middle = low + (high - low) / 2;
            int value = arr[middle];

            System.out.println("Middle: " + value);
            if (value < target){
                low = middle + 1;
            } else if (value > target){
                high = middle - 1;
            } else {
                return middle;
            }
        }

return -1;
    }

}
