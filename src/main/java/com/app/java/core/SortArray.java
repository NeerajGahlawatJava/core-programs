package com.app.java.core;

public class SortArray {

    public static void main(String... s){
        int[] arr = {5,7,3,9,4,10};
        sortAsc(arr);

    }

    public static void sortAsc(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i=-1;
            }
        }
        for(int j=0;j<=arr.length-1;j++){
            System.out.print(arr[j]+",");
        }
    }
}
