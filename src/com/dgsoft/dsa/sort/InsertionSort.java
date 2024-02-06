package com.dgsoft.dsa.sort;

public class InsertionSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++)
        {
            int temp = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>temp)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }

    public static void display(int[] arr)
    {
        for (int a : arr)
        {
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,3,1,7,2,9};
        sort(arr);
        display(arr);
    }
}
