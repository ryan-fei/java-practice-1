package com.company;

import java.util.Scanner;

class Main {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            double amount;

            System.out.println("What is the price of a banana?");
            amount = keyboard.nextDouble();
            amount *= 12.0000000000000;

            System.out.print("We will bill $");
            System.out.print(amount);
            System.out.print(" to your credit card");

            keyboard.close();

        }
}
