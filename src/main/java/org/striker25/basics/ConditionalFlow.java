package org.striker25.basics;

import java.util.List;

public class ConditionalFlow {

  public static void main(String[] args) {

    ifElse();

    // if this value is zero, nothing will run!
    // trying to get a number next to 92 produces overflow...
    whileLoop(3);
    System.out.println();
    forLoop(3);
    System.out.println();
    printRandomMonthUsingSwitch();
    System.out.println();
    gameUsingDoWhile();
  }

  /**
   * If-Else statements lets you execute blocks of code based on a given condition (boolean)
   */
  private static void ifElse() {

    boolean condition = false;

    // do this way
    if (condition) {
      System.out.println("It was TRUE!");
    } else {
      System.out.println("Ran the Else Block");
    }

    // DON'T DO THIS WAY
    if (condition == true) {
      // == true is not necessary
    }

    // DON'T DO THIS WAY
    if (condition == false) {
      // instead of doing this, you can negate a boolean with the "!" symbol (without quotes).
      // for example:
      // if(!condition)
    }

    List<Integer> list = List.of(1, 2, 3);

    // If list is NOT empty, because the "!" symbol negates this condition.
    // list.isEmpty() == false, because list has numbers 1, 2, 3
    // so in order to execute, !list.isEmpty() changes the value to true.
    if (!list.isEmpty()) {
      System.out.printf("This is printed because list is NOT EMPTY: %s%n%n", list);
    }

  }


  /**
   * Lets you run the same block of code while a condition is true, the condition is evaluated
   * first, this means that if the condition is false at the beginning, no code will run.
   */
  private static void whileLoop(int generatedNumbers) {

    // Do a program which prints the Fibonacci succession, for the first n numbers.
    int counter = 0;
    long previous = 0;
    long current = 1;
    long next = 0;


    System.out.println("While loop");
    System.out.printf("Fibonacci Succession for the first %d numbers%n", generatedNumbers);
    System.out.println("=================================================");
    while (counter <= generatedNumbers) {

      if (counter != 0) {
        System.out.printf("%d --> %d%n", counter, next);
      }

      previous = current;
      current = next;
      next = previous + current;

      ++counter;
    }

  }

  /**
   * Lets you run a block of code for a finite number of times given a counter as conditional
   */
  private static void forLoop(int generatedNumbers) {

    // Do a program which prints the Fibonacci succession, for the first n numbers.
//    long next = 0, previous = 0, current = 1; // this kind of declaration is allowed but not recommended
    long next = 0;
    long previous = 0;
    long current = 1;

    System.out.println("For loop");
    System.out.printf("Fibonacci Succession for the first %d numbers%n", generatedNumbers);
    System.out.println("=================================================");

    for (int i = 0; i <= generatedNumbers; i++) {
      if (i != 0) {
        System.out.printf("%d --> %d%n", i, next);
      }

      previous = current;
      current = next;
      next = previous + current;
    }
  }

  private static void printRandomMonthUsingSwitch() {
    int max = 11;
    int min = 0;

    // (int)(double)  <--- This is called "Casting"
    // or type conversion, it involves a loss in precision
    // in the case of this double, the value is truncated, so it can fit
    // into an integer
    int randomMonth = (int) ((Math.random() * max) - min);

    System.out.println("=================================================");
    System.out.printf("Random month using new Switch: %s%n", monthSwitch(randomMonth));
    System.out.println("=================================================");


    System.out.println("=================================================");
    System.out.printf("Random month using OLD Switch: %s%n", oldMonthSwitch(randomMonth));
    System.out.println("=================================================");
  }

  private static String monthSwitch(int month) {

    // This way is allowed under Java 17
    return switch (month) {
      case 0 -> "January";
      case 1 -> "February";
      case 2 -> "March";
      case 3 -> "April";
      case 4 -> "May";
      case 5 -> "June";
      case 6 -> "July";
      case 7 -> "August";
      case 8 -> "September";
      case 9 -> "October";
      case 10 -> "November";
      case 11 -> "December";
      default -> throw new IllegalStateException("Unexpected value: " + month);
    };
  }

  private static String oldMonthSwitch(int month) {

    String value;

    switch (month) {
      case 0:
        value = "January";
        break;
      case 1:
        value = "February";
        break;
      case 2:
        value = "March";
        break;
      case 3:
        value = "April";
        break;
      case 4:
        value = "May";
        break;
      case 5:
        value = "June";
        break;
      case 6:
        value = "July";
        break;
      case 7:
        value = "August";
        break;
      case 8:
        value = "September";
        break;
      case 9:
        value = "October";
        break;
      case 10:
        value = "November";
        break;
      case 11:
        value = "December";
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + month);
    }

    return value;
  }

  private static void gameUsingDoWhile(){
    System.out.println("=================================================");
    System.out.println("Do-While Game");

    do {
      ReadFromConsole.runAgeGame(); // this will always be executed at least once
    } while (ReadFromConsole.shouldExitTheGame());

    System.out.println("Good-Bye!!!");
    System.out.println("=================================================");
  }

}
