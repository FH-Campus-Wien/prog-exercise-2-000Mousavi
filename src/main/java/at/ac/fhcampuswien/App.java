package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {


    //todo Task 1
    public void largestNumber() {
        Scanner scanner = new Scanner(System.in);
        double number;
        int count = 1;
        double max = 0;
        do {
            System.out.print("Number " + count + ": ");
            number = scanner.nextFloat();
            //System.out.printf

            if (count == 1 && number <= 0) {
                System.out.println("No number enterd.");
                break;
            }
            if (number > max) {
                max = number;
            }
            if (number <= 0) {
                System.out.printf("The largest number is " + "%.2f", max);
                System.out.println();
            }
            count++;
        } while (number > 0);

    }

    //todo Task 2
    public void stairs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int k = 1;
        int rows = scanner.nextInt();
        if (rows <= 0) {
            System.out.println("invalid number!");
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.print(k++ + " ");
                }
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid() {
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 6 - i; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        Scanner scann = new Scanner(System.in);
        System.out.print("h: ");
        int h = scann.nextInt();
        System.out.print("c: ");
        char c = scann.next().charAt(0);
        if (h%2 == 0) {
            System.out.println("Invalid number!");
        } else {
            for (int i = 1; i <= h/2 + 1; i++){
                for(int j = h/2; j >= i; j--){
                    System.out.print(" ");
                }
                for(int k = i; k > 0; k--){
                    System.out.print((char) (c-k+1));
                }
                for (int l = 1; l<i; l++){
                    System.out.print((char) (c - l));
                }
                System.out.println();
            }
            for (int i = h/2; i > 0; i--) {
                for (int j = h/2; j >= i; j--){
                    System.out.print(" ");
                }
                for (int k = i; k > 0; k--){
                    System.out.print((char) (c-k+1));
                }
                for (int l = 1; l <i; l++)
                    System.out.print((char) (c - l));
            }
            System.out.println();
        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){

    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}