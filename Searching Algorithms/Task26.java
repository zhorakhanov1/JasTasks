package com.company;

public class Task26 {
    public static void main(String[] args) {
        int arr[] =  {10, 22, 28, 29, 30, 40};
        int x = 54;
        int a = arr.length;
        closestPair(arr, a, x);

    }
    static void closestPair(int[] array, int a, int x){
        int l_index = 0;
        int r_index = 0;
        int l =0, r = a - 1, difference = Integer.MAX_VALUE;

        while (l < r){
            if (Math.abs(array[l] + array[r] - x) < difference){
                l_index = l;
                r_index = r;
                difference = Math.abs(array[l] + array[r] - x);
            }
            if (array[l] + array[r] > x) r--;
            else l++;
        }
        System.out.println("The closes pair is " + array[l_index] + " and " + array[r_index]);
    }
}
