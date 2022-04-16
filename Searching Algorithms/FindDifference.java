package com.company;

public class FindDifference {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 6, 3, 4};
        System.out.println(findPair(array,5));
    }
    static boolean findPair(int arr[], int n) {
        boolean res = false;
        if (n == 0) return res;
        for (int i : arr) {
            for (int k : arr) {
                if (i + n == k){
                    res = true;
                    return res;
                }
            }
        }
        return res;
    }
}
