package ru.otus.hw11;

public class QuickSort {


    public static void quickSort(int[] arr) {
        if (arr != null && arr.length > 1) {
            quickSort(arr, 0, arr.length - 1);
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int p = partition(arr, low, high);
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] < arr[low]) move(arr, low, mid);
        if (arr[high] < arr[low]) move(arr, low, high);
        if (arr[high] < arr[mid]) move(arr, mid, high);

        int pivot = arr[mid];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                move(arr, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    private static void move(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 1, 4, 2, 8, 0, 9, 1, 15, 20, 94, 9, 4, 0, -2, -4};
        quickSort(numbers);
        System.out.println(java.util.Arrays.toString(numbers));
    }
}
