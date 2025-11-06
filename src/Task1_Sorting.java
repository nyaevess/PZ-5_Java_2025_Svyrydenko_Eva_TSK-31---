public class Task1_Sorting {

    public static void main(String[] args) {
        long[] numbers1 = {64, 25, 12, 22, 11};
        long[] numbers2 = {64, 25, 12, 22, 11};

        System.out.println("Початковий масив:");
        printArray(numbers1);

        // Сортування обміном
        bubbleSort(numbers1);
        System.out.println("\nПісля Bubble sort:");
        printArray(numbers1);

        // Сортування вибором
        selectionSort(numbers2);
        System.out.println("\nПісля Selection sort:");
        printArray(numbers2);
    }

    // -------------------- Bubble Sort --------------------
    public static void bubbleSort(long[] arr) {
        if (arr == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    long temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // якщо жодного обміну — масив уже відсортований
        }
    }

    // -------------------- Selection Sort --------------------
    public static void selectionSort(long[] arr) {
        if (arr == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            long temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // -------------------- Метод для виведення --------------------
    public static void printArray(long[] arr) {
        for (long num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}