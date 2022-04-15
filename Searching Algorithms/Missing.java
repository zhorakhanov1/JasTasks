package com.company;

public class Missing {
    public static void main(String[] args) {
        findMissing(new int[]{1, 3, 3});
    }

    static void findMissing(int[] array){
        sort(array);
        String res = "";
        for (int i = 0; i < array.length-1; i++){
            if (array[i] != i+1){
                res = i+1 + " " + array[i+1];
            }
        }
        System.out.println(res);
    }
    static int[] sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
