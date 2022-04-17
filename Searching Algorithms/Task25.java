package com.company;

public class Task25 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 0, 0, 0 };
        int n = arr.length;
        System.out.println("Count of 1's in given array is "
                + countOne(arr, 0, n - 1));
    }
    static int countOne(int[] array, int l, int r){
        if (r >= l){
            int mid = l + (r - l) / 2;
            if ((mid == r || array[mid + 1] == 0) && array[mid] == 1) return mid + 1;
            if (array[mid] == 1) return countOne(array, mid + 1, r);
            return countOne(array,l,mid - 1);
        }
        return 0;
    }
}
