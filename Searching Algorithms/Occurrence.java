package com.company;

public class Occurrence {
    public static void main(String[] args) {
        System.out.println(countOccurence(new int[]{1, 1, 2, 2, 2, 2, 3}, 2));
    }
    static int countOccurence(int[] array, int z){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == z) counter ++;
        }
        return counter;
    }
}
