package com.company;

public class FindPeak {
    public static void main(String[] args) {
        int arr[] = {10, 20, 15, 2, 23, 90, 67};
        System.out.print("Index of peak: ");
        findPeak(arr);

    }
    static void findPeak(int[] array){
        if (array.length == 1){
            System.out.println(0);
            return;
        }
        if (array[0] >= array[1]){
            System.out.println(0);
            return;
        }
        if (array[array.length-1] >= array[array.length-2]){
            System.out.println(array.length - 1);
            return;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1]) System.out.print(i + " ");
        }
    }
}
