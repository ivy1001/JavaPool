package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 154874;
        int sum = 0;
        while (number > 0) {

            sum += number % 10;
            number = number / 10;

        }
        System.out.println(sum);
    }
}