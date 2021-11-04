package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number : " );
        int width = scanner.nextInt();
        System.out.println("enter a number : " );
        int height = scanner.nextInt();
        int area = width * height;
        System.out.println("Area is : " + area);
    }
}
