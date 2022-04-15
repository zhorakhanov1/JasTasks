package com.company;

public class MinMax {
    static Pair getMinMax(int[] array, int n){
        long min = array[0];
        long max = array[0];
        if (array.length == 1) return new Pair(array[0], array[0]);
        else{
            for (int i = 0; i < n; i++) {
                if (array[i]<min) min = array[i];
                if (array[i] > max) max = array[i];
            }
        }
        return new Pair(min,max);
    }
}

class Pair{
    long min;
    long max;
    public Pair(long min, long max){
        this.min = min;
        this.max = max;
    }

}
