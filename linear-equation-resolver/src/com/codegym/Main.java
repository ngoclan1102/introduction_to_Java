package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a : ");
        double number1 = scanner.nextDouble();
        System.out.println("nhap so b : ");
        double number2 = scanner.nextDouble();
        if (number1 == 0) {
            System.out.println("phuong trinh vo nghiem ");
        }else {
            double result = -number2/number1;
            System.out.println(result);
        }
    }
}
