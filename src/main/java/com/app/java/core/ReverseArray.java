package com.app.java.core;

public class ReverseArray {

    public static void main(String... s){
        int[] arr = {5,7,3,9,4,10};
        arr = reverse(arr);

    }

    public static int[] reverse(int[] arr){
        int first = 0;
        int last = arr.length-1;
        while(first <= last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        return arr;
    }
}
