package com.dgsoft.dsa;

import java.util.Arrays;

public class LinearSearch {
    public static void linearSearch(int[] arr, int element){
        int eleIndex=0;
        for(int i=0; i<arr.length; i++)
        {
            if(element==arr[i]){
                eleIndex = i;
            }
        }

        if(eleIndex>0)
        {
            System.out.println("Element Found at index: "+eleIndex);
        }else{
            System.out.println("Element Not Found at index");
        }
    }


    public static void main(String[] args) {

        int[] arr = {4,5,6,1,5,5};
        linearSearch(arr,6);

    }
}
