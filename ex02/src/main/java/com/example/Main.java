package com.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int Coffee = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Entrez un nombre : ");
            int number = scanner.nextInt();
            if (number == 42) {
                break;
            }
            int sum = 0;
            int temp = number;
            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            boolean isPrime = true;
            for (int i = 2; i <= sum -1 ; i++) {
                if (sum % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                Coffee++;
            }

        }
        System.out.println("Count of coffee-request : " + Coffee);
    }
}