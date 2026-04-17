import java.util.Random;
public class testing {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        for(int i = 1; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Original array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
        }
        public static void insertionSort(int[] inputArray) {
            for (int i = 1; i < inputArray.length; i++){
                int currentValue = inputArray[i];
                int j = i - 1;

                while (j >= 0 && inputArray[j] > currentValue){
                    inputArray [j + 1] = inputArray[j];
                    j--;
                }
                inputArray[j + 1] = currentValue;       
            }
        }
        public static void printArray(int[] inputArray) {
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}