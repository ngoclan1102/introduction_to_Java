package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number : ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 & year % 100 != 0) || (year % 400 == 0 & year % 100 == 0)) {
            System.out.println("nam " + year + " la nam nhuan");
        }else {
            System.out.println("nam " + year + " khong phai nam nhuan ");
        }
    }
}
