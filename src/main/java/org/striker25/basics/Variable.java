package org.striker25.basics;

import java.util.Objects;
import org.striker25.oop.Animal;
import org.striker25.oop.Cat;
import org.striker25.oop.Dog;

public class Variable {

  public static void main(String[] args) {

    primitiveTypes();
    System.out.println("=========================================================");
    nonPrimitiveTypes();
  }

  private static void primitiveTypes() {
    // 1. PRIMITIVE TYPES

    // 1.1 Integer types

    // byte: its range is between -128 to 127
    // size in memory: 1 byte
    byte aByte = 127;

    // short: its range is between -32,768 to 32,767
    // size in memory: 2 bytes
    short aShort = 32767;

    // int: its range is between -2,147,483,648 to 2,147,483,647
    // size in memory: 4 bytes
    int aInt = 2_147_483_647;

    /* long: its range is between -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     * size in memory: 8 bytes
     * declaring a long variable explicitly requires adding a letter "L" to the end of the number,
     * to specify that the literal declaration is a long and not an int value. */
    long aLong = 9_223_372_036_854_775_807L;

    // 1.2 Float types

    // float: Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits.
    // size in memory: 4 bytes
    // just like long, this type requires a letter "f" at the end of the assigment.
    float aFloat = 5.99f;

    // double: Stores fractional numbers. Sufficient for storing 15 decimal digits
    // size in memory: 8 bytes
    double aDouble = 1.332;

    // 1.3 Boolean Type
    // boolean: only can have two values: true or false
    // size in memory: 1 bit
    boolean aBoolean = true;

    // 1.4 Character type
    // char: Stores a single character/letter or ASCII values
    // size in memory: 2 bytes
    // https://coding.tools/ascii-table
    char aChar = 'A';

    print(aByte, aShort, aInt, aLong, aFloat, aDouble, aBoolean, aChar);
  }

  private static void nonPrimitiveTypes() {

    // Boxed types, or wrappers
    // Byte, Short, Integer, Long, Float, Double, Boolean, Char
    // Example:
    Integer aInt = 10;
    print(aInt);

    aInt = null;
    print(aInt);

    // text type
    String message = "Hello, Welcome to Java";
    print(message);

    // Custom types by classes:
    // Instantiation
    Animal animal1 = new Animal();
    animal1.setName("Butterfly");
    animal1.setColor("Brown");
    animal1.setAge(10);
    print(animal1);

    Dog dog = new Dog();
    dog.setName("Zeus");
    dog.setColor("White");
    dog.setAge(5);

    print(dog);
    System.out.print("Dog: ");
    dog.bark(); // bark only exits on Dog class!

    Cat cat = new Cat();
    cat.setName("Señor Gato");
    cat.setColor("Gray");
    cat.setAge(4);

    print(cat);
    System.out.print("Cat: ");
    cat.meow();
  }

  private static void print(Object... args) {
    for (Object o : args) {
      if (Objects.nonNull(o)) {
        System.out.printf("Type is %s, and value is: %s%n", o.getClass().getName(), o);
      } else {
        System.out.println("Unable to identify the type of an null variable");
      }
    }
  }
}
