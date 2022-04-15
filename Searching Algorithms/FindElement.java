package com.company;

public class FindElement {
    public static void main(String[] args) {
        int[] array = new int[]{8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
        System.out.println(findMaximum(array, 0, array.length));
    }
    static int findMaximum(int[] array, int l, int r){
        int mid  = (l + r) / 2;
        if (l == r) return array[l];
        if ((r == l + 1) && array[l] >= array[r])
            return array[l];
        if ((r == l + 1) && array[l] < array[r])
            return array[r];

        if (array[mid] > array[mid-1] && array[mid] > array[mid+1]) return array[mid];
        if (array[mid] < array[mid-1] && array[mid] > array[mid+1]) return findMaximum(array,l,mid-1);
        else return findMaximum(array,mid+1,r);

    }
}
