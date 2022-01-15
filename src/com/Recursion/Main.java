package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Q. Write a program to remove consecutive duplicate elements in an array.
       Input values
       10 10 30 30 40 50 50 50 9 45
       Output
	 */
     int[] arr = {10,10,30,30,40,50,50,50,9,45};
        removeDuplicate(arr);
    }
    public static void removeDuplicate(int[] nums){
        int[] temp = new int[nums.length];
        int j=0;
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                temp[j]=nums[i];
                j++;
            }
        }
        temp[j] = nums[nums.length-1];
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}
