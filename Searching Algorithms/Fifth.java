package com.company;

public class Fifth {
    public static void main(String[] args) {
        smallet(new int[]{2, 4, 3, 5, 6});
    }
    public static void smallet(int arr[]) {
        sort(arr);
        System.out.println(arr[0] + " " + arr[1]);
    }
    public static int[] sort(int arr[]) {
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
