package com.company;

import java.util.Scanner;

class Main {
    public static void binarySearch(int[] arr, int l, int r) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter number to search");
       int x = in.nextInt();
       int i=l, j = r;
       while(i<=j){
           int mid = l + (r - l)/2;
           int opora = arr[mid];
           if(opora==x){
               System.out.println("YES");
               return;
           }
           if(x<opora){
               r = mid - 1;
           }
           if(x>opora) {
               l = mid + 1;
           }else{
               System.out.println("NO");
               return;
           }
       }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int l=0, r = arr.length - 1;
        binarySearch(arr, l, r);
    }
}