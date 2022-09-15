package com.javapractice;

import java.util.Scanner;

public class SwapNumbers {

 void swap(int num1,int num2){
    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;
    System.out.println("numbers after swapping are:");
    System.out.println("number 1: "+num1+"\nnumber 2: "+num2);
  }
  public static void main(String[] args) {
    SwapNumbers obj=new SwapNumbers();
    Scanner sc = new Scanner(System.in);

    System.out.println("please enter two numbers: ");
    int num1= sc.nextInt();
    int num2=sc.nextInt();
    System.out.println("number 1: "+num1+"\nnumber 2: "+num2);
    obj.swap(num1,num2);
  }
}
