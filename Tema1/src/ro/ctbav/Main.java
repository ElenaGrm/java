package ro.ctbav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    int age;

	    System.out.print("Introduceti varsta: ");

	    Scanner keyboard = new Scanner(System.in);
	    age = keyboard.nextInt();

	    if (age < 5) {
            System.out.println("You are in kindergarten.");
        } else if (age < 10) {
            System.out.println("You are in elementary school.");
        } else if (age < 13) {
            System.out.println("You are in middle school.");
        } else if (age < 18) {
            System.out.println("You are in high school.");
        } else {
            System.out.println("You should be in college.");
        }
    }
}
