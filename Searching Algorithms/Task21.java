package com.company;

public class Task21 {
    public static void main(String[] args) {
        int arr[] = {3, 2, 10, 4, 40};
        int n = arr.length;
        int x = 4;
        int result = binarySearch(arr, 0, n - 1, x);
        if(result == -1) System.out.println("Element is not present in array");
        else System.out.println("Element is present at index " + result);
    }
    static int binarySearch(int[] array, int l, int r, int key){
        if (r >= l){
            int mid = (r + l) / 2;
            if (array[mid] == key) return mid;
            if (array[mid + 1] == key) return mid + 1;
            if (array[mid - 1] == key) return mid - 1;

            if (array[mid] > key){
                binarySearch(array, l, mid - 2, key);
            }
            else {
                binarySearch(array, mid + 2, r, key);
            }
        }
        return -1;

    }
}
