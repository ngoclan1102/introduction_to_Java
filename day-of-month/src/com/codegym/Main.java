package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number : ");
        int month = scanner.nextInt();
        if (month > 0 & month <= 12) {
            switch (month){
                case 1 :
                case 3 :
                case 5 :
                case 7 :
                case 8 :
                case 10 :
                case 12 :
                    System.out.println("thang " + month + " co 31 ngay ");
                    break;
                case 2 :
                    System.out.println("thang " + month + " co 28 hoac 29 ngay ");
                    break;
                default:
                    System.out.println("thang " + month + " co 30 ngay ");
            }
        }

    }
}
