public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 6, 5, 90, 42, 32, 25, 10};
        
        System.out.print("Before Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr); 

        System.out.print("After Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
int min = i;
for(int j = i + 1; j < array.length; j++){
if (array[j] < array[min]){
min = j;
}
}
int temp = array[min];
array[min] = array[i];
array[i] = temp;
}

}
}

