package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ths missing number is: " + missingNumber(new int[]{1, 2, 4, 6, 3, 7, 8}));
    }

    public static int missingNumber(int[] array){
        int res = 0;
        for (int i = 1; i <= array.length+1; i++){
            if (search(array,i) == false){
                res = i;
                break;
            }
        }
        return res;
    }
    public static boolean search(int[] arr, int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return true;
        }
        return false;
    }

}
