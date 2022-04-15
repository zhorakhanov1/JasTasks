package com.company;

public class EqualIndex {
    public static void main(String[] args) {
        if (equaltoIndex(new int[]{15, 2, 45, 12, 7}, 2) != -1) System.out.println(equaltoIndex(new int[]{15, 2, 45, 12, 7}, 2));
        else System.out.println("Doesn't exist");
    }
    static int equaltoIndex(int[] array,int x){
        int res = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i+1){
                return i+1;
            }
        }
        return res;
    }
}
