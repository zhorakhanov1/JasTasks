package com.company;

public class Second {

    public static void main(String[] args) {
        int z = search(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 3);
        if (z == -1) System.out.println("Not Found");
        else System.out.println("Found at index: " + z);
    }
    public static int search(int[] array, int a){
        int res = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == a){
                res = i;
                return i;
            }
        }
        return -1;
    }
}
