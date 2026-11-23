package ru.otus.hw11;

public class BubbleSort {


    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        boolean moved;

        for (int i = 0; i < length - 1; i++) {
            moved = false;

            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    moved = true;
                }
            }

            if (!moved) break;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8, 0, 9, 15, 1, 2};

        System.out.println("До сортировки:    " + java.util.Arrays.toString(array));
        bubbleSort(array);
        System.out.println("После: " + java.util.Arrays.toString(array));
    }
}
