package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void quickSort(int[] arr, int low, int high){
        if(arr.length==0)
            return;
        if(low>=high)
            return;
        int mid = low + (high-low)/2;
        int pivot = arr[mid];
        int i=low, j=high;
        while(i<=j){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if(i<high)
            quickSort(arr, i, high);
        if(j>low)
            quickSort(arr, low, j);
    }
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++)
	    arr[i] = in.nextInt();
	int low = 0, high = arr.length - 1;
	quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
}
