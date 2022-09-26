package com.javapractice;

import java.util.Scanner;

public class ZeroSumTriplets {
  int count=0;
  int sum=0;
  void findTriplets(int[] arr){
     for(int i=0;i<arr.length-2;i++){
      for (int j = i+1; j < arr.length-1; j++) {
        for (int k = j+1; k < arr.length; k++) {
          if(arr[i]+arr[j]+arr[k]==sum){
            count++;
            System.out.println("The triplet " + count +" found is:"+arr[i]+" "+arr[j]+" "+arr[k]);
          }
        }
      }
     }
    System.out.println("total number of triplets are: "+count);
  }
  public static void main(String[] args) {
    ZeroSumTriplets obj = new ZeroSumTriplets();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements you want to store: ");
    int n = sc.nextInt();
    int[] array = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }

    obj.findTriplets(array);

  }
}
