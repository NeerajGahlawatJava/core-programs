package com.app.java.core;

public class ArraySortingTest {

    public static void main(String... s){
        int[] arr = {5,8,3,4,1,6,9,8,7};
        for(int i=0;i< arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i=-1;
            }
        }

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ,");
        }
    }
}
