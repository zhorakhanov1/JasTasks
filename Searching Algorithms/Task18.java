package com.company;

public class Task18 {
    public static void main(String[] args) {
        int[] array =  {5, 6, 1, 2, 3, 4};
        int n = array.length;
        System.out.println("The minimum element is "+ findMinimum(array, 0, n - 1));
    }
    static int findMinimum(int[] array, int l, int r){
        if (r < l) return array[0];
        if (r == l) return array[l];
        int mid = l + (r - l) / 2;
        if (mid < r && array[mid+1] < array[mid]) return array[mid+1];
        if (mid > l && array[mid-1] > array[mid]) return array[mid];
        if (array[r] > array[mid]) return findMinimum(array,l,mid - 1);
        return findMinimum(array,mid + 1, r);
    }
}
