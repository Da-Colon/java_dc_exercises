package com.davidacolon;

import java.util.Scanner;

public class DcExercisesOne {
    static double tip;
    private static Scanner sc = new Scanner(System.in);

    public static void helloYouOne() {
        System.out.println("======> What is your name? ");
        String name = sc.nextLine();
        System.out.print("Hello, " + name + "!\n");
    }

    public static void helloYouTwo() {
        System.out.println("======> What is your name? ");
        String name = sc.nextLine();
        System.out.print("Hello, " + name + "!" + "\nYour name has " + name.length() +  " letters in it! Awesome!\n" );
    }

    public static void madLibExercise() {
        System.out.println("Please fill in the blanks below: \n__(name)__'s favorite subject in school is __(subject)__.\n");
        System.out.println("======> What is name? ");
        String name = sc.nextLine();
        System.out.println("======> What is subject? ");
        String subject = sc.nextLine();
        System.out.println(name + "'s favorite subject in school is " + subject + ".");
    }

    public static void tipAmount(int bill, String service) {
        if(service == "good")
            tip = 0.20;
        if(service == "fair")
            tip = 0.15;
        if(service == "bad")
            tip = 0.1;
        double tipAmount = bill * tip;
        double total = bill + tipAmount;
        System.out.println("Total: " + String.format("%.2f", total));
    }

    public static void totalAmount(int bill, String service, int numOfPeople){
        if(service == "good")
            tip = 0.20;
        if(service == "fair")
            tip = 0.15;
        if(service == "bad")
            tip = 0.1;
        double tipAmount = bill * tip;
        double total = bill + tipAmount;
        double totalEach = total / numOfPeople;
        System.out.println("Total: " + String.format("%.2f", totalEach));
    }
}
