public class Sorter {
    public static void main(String[] args) {
        int[] array = {9, 14, 3, 2, 43, 11, 58, 22};
        sort(array);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("After Selection Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("After Insertion Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        insertionSort(arr);
        selectionSort(arr);

    }



}