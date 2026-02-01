package com.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int iteration = 0 ;
        int i ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int number = scanner.nextInt();

        if (number == 0 || number == 1) {
            System.out.print("IllegalArgumen");
            System.exit(-1);
        }
        for (i = 2; i <= number-1; i++) {
            iteration++;
            if (number % i == 0) {
                System.out.println("false");
                System.out.println(iteration);
                return;
            }
        }
        System.out.println("true");
        System.out.println(iteration);

    }
}