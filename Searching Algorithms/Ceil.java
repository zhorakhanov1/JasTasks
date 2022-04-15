package com.company;

public class Ceil {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 2, 8, 10, 10, 12, 19};
        int s = arr.length;
        if (ceilSearch(arr,s,3) > 0) System.out.println("Ceil:" + ceilSearch(arr,s,3));
        else System.out.println("Ceil doesn't exist in array");
    }

    static int ceilSearch(int[] array, int s,  int x){
        int ceil = -1;
        if (s == 0) return -1;
            for(int i = 0; i < s; i++){
                if (array[i] >= x){
                    ceil = array[i];
                    break;
                }
            }
        return ceil;
    }
}
