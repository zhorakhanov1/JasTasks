package com.company;

public class Second {

    public static void main(String[] args) {
        int arr[] = {30, 40, 50, 10, 20};
        int i = binarySearch(arr, 0, arr.length, 10);
        if (i != -1) System.out.println("Index: " + i);
        else System.out.println("Key not found");
    }
    
    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) return mid;

            if (arr[l] <= arr[mid]){
                if (x >= arr[l] && x <= arr[mid])
                    return binarySearch(arr, l, mid - 1, x);

                return binarySearch(arr,mid+1,r,x);
            }

            if (x >= arr[mid+1] && x <= arr[r]){
                return binarySearch(arr,mid+1,r,x);
            }
            return binarySearch(arr,l,mid-1,x);
        }
        return -1;
    }
}
