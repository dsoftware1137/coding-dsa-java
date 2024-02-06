package com.dgsoft.dsa.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,5,3,7,4,9};
        BubbleSort.sort(arr);
        for(int a : arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void sort(int[] arr){
        int length = arr.length;

        for(int i=0; i<length-1; i++)
        {
            boolean isSwapped = false;
            for(int j=0; j<length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped)
            {
                break;
            }
        }
    }

}
