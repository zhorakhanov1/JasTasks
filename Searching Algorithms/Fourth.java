package com.company;

public class Fourth {
    public static void main(String[] args) {
        System.out.println(closestToZero(new int[]{-21, -67, -37, -18, 4, -65},6));
    }
    public static int closestToZero (int arr[], int a) {
        sort(arr);
        int res = 0;
        if (arr.length>=2) res = arr[arr.length-1] + arr[arr.length-2];
        else res = arr[0];
        return res;
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
