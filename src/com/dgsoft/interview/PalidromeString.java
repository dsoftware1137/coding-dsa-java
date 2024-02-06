package com.dgsoft.interview;

import java.util.Locale;

public class PalidromeString {

    public static void main(String[] args) {
        //checkPalidrome1("aabbaa");
        chekPalidrome2("aabbaa");
        chekPalidrome2("Dhiraj");
    }

    public static void chekPalidrome2(String str)
    {
        String s = str.toLowerCase();
        String rev = "";

        for (int i=s.length()-1; i>=0; i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverses String -"+rev);
        if(rev.equals(s))
        {
            System.out.println("Is Palidrome");
        }else {
            System.out.println("Not Palidrome String");
        }
    }

    public static void checkPalidrome1(String str) {
        char[] chArray = str.toLowerCase().toCharArray();
        int length = chArray.length;
        boolean isPalidrome = true;
        for(int i=0; i<length/2; i++)
        {
            if(!(chArray[i]==chArray[length-1]))
            {
                isPalidrome = false;
            }
        }

        if(isPalidrome)
        {
            System.out.println("Palidrome String");

        }else {
            System.out.println("Not Palidrome String");
        }
    }
}
