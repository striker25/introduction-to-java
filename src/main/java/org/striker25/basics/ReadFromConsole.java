package org.striker25.basics;

import java.util.Scanner;

public class ReadFromConsole {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    println("What's is your name? ");
    String name = scanner.nextLine();

    println("What is your age? ");
    int age = scanner.nextInt();

    println("Your name is: %s".formatted(name));

    magicMage(age);

    println("======================================]");
    println("To exit, press any key...");
    scanner.nextLine();
    scanner.close();
  }

  private static void magicMage(int age) {
    if (age == 1) {
      println("You are an Infant");
    } else if (age >= 2 && age <= 4) {
      println("Your are a Toddler!");
    } else if (age >= 5 && age <= 12) {
      println("You are a Child!");
    } else if (age >= 13 && age <= 19) {
      println("You are a Teenager!");
    } else if (age >= 20 && age <= 39) {
      println("You are an adult!");
      if (age == 24) {
        println("Yaaay!! this is current author's age as 2022");
      }
    } else if (age >= 40 && age <= 59) {
      println("You are a Middle Age Adult!");
    } else if (age >= 60 && age <= 90) {
      println("You are a Senior Adult!");
    } else if (age >= 90 && age <= 120) {
      println("You are an Elder!!!!!");
    } else if (age >= 121) {
      println("No way!! Nobody can live that long!");
    } else {
      println("Back to the Future!!!");
    }
  }

  private static void println(String text) {
    System.out.println(text);
  }

}
