public class array {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 6, 5, 90, 42, 32, 25, 10};
        
        System.out.println("Before sorting");
        printArray(arr);

        InsertionSort(arr); 

        System.out.println("After sorting");
        printArray(arr);
        }
        
        public static void InsertionSort(int[] values){
            for (int i = 1; i < values.length; i++){
                int currentValue = values[i];
                int j = i - 1;

                while (j >= 0 && values[j] > currentValue){
                    values [j + 1] = values[j];
                    j--;
                }
                values[j + 1] = currentValue;

            }
        }
        public static void printArray(int[] values) {
            for (int num : values) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
