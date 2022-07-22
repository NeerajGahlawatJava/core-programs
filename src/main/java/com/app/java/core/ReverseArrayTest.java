package com.app.java.core;

public class ReverseArrayTest {

    public static void main(String... s){
        int[] arr = {5,8,3,4,1,6,9,8,7};
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" , ");
        }
    }
}
