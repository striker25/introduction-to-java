package org.striker25.basics;

import java.util.List;

public class ConditionalFlow {

  public static void main(String[] args) {

    ifElse();
    whileLoop();
    forLoop();
  }

  /**
   * If-Else statements lets you execute blocks of code based on a given condition (boolean)
   */
  private static void ifElse() {

    boolean condition = true;

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

    // If list is NOT empty, because the ! symbol negates this condition.
    // list.isEmpty() == false, because list has numbers 1, 2, 3
    // so in order to execute, !list.isEmpty() changes the value to true.
    if (!list.isEmpty()) {
      System.out.printf("This is printed because list is NOT EMPTY: %s", list);
    }

  }

  /**
   * Lets you run the same block of code while a condition is true, the condition is evaluated
   * first, this means that if the condition is false at the beginning, no code will run.
   */
  private static void whileLoop() {

    // Do a program which prints the Fibonacci succession, for the first n numbers.
    int counter = 0;
    long previous = 0;
    long current = 1;
    long next = 0;
    // if this value is zero, nothing will run!
    // trying to get a number next to 92 produces overflow...
    int generatedNumbers = 3;

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
  private static void forLoop() {

    // Do a program which prints the Fibonacci succession, for the first n numbers.
//    long next = 0, previous = 0, current = 1; // this kind of declaration is allowed but not recommended
    long next = 0;
    long previous = 0;
    long current = 1;
    // if this value is zero, nothing will run!
    // trying to get a number next to 92 produces overflow...
    int generatedNumbers = 3;


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

}
