package com.wanz;

import java.util.ArrayList;
import java.util.List;

public class MyArray {
    public List<Integer> array = new ArrayList<Integer>();


    public void add(int x) {
        array.add(x);
    }

    public void sort() {
        int temp;
        for(int i = 0; i < length() - 1; i++) {
            for (int j = 0; j < length() - 1 - i; j++) {
                if (array.get(j) > array.get(j+1)) {
                    temp =array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1,temp);
                }
            }
        }
    }

    public int max() {
        int max = array.get(0);
        for(int i = 1; i < length(); i++) {
            if (max < array.get(i)) {
                max = array.get(i);
            }
        }
        return max;
    }

    public int length() {
        return array.size();
    }

    public int[] output() {
        int[] arr = new int[length()];
        for(int i = 0 ; i < length(); i++) {
            arr[i] = array.get(i);
        }
        return arr;
    }
}
