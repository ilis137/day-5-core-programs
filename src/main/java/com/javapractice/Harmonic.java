package com.javapractice;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Harmonic {

    double calculateHarmonicNumber(int num) {
        double hm = 0.0;
        for (int i = 1; i <= num; i++) {
            hm += (1 /Double.valueOf(i));
        }
        return hm;
    }

    public static void main(String[] args) {
        Harmonic obj = new Harmonic();
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number to get harmonic mean: ");
        int num = sc.nextInt();
        double hm = obj.calculateHarmonicNumber(num);
        System.out.println("The harmonic number is: " + hm);
    }
}
