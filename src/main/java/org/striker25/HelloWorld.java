package org.striker25; // path where the file is located, using . (dot) for each nested folder

// This is a comment, using forward slashes you can type anything you wish as hints for you or
// other developers.

/* However, when you need to expand your explaining, you can use this style of comments, called:
 * "Multi-line comment", it is very handy for development, most of the use for this type of
 * comments is to disable some functionality of your code for debugging.
 * */

/**
 * <h1>Java Syntax</h1>
 * <p>First of all, this is a Javadoc comment, you will see this kind of comment above classes and
 * methods and it is used for documenting your code in a standard manner, the say way as oracle
 * does, check this as example <a href="https://docs.oracle.com/en/java/javase/17/docs/api/">
 *   Java 17 documentation</a></p>
 *
 *   <ul>
 *     <li>Every line of code must be inside a <strong>class</strong>.</li>
 *     <li>Java is case-sensitive, for java, helloWorld is different than HelloWorld.</li>
 *     <li>The name of the file must be the same as th class name, in this case, if our class name
 *     is HelloWorld, the file name should be HelloWorld.java</li>
 *   </ul>
 *
 * @author Fernando Ventura
 * @version 1.0
 * @since 1.0
 */
public class HelloWorld { // Name of classes always follow the PascalCase convention.

  public static void main(String[] args) { // START: every method has opening curly braces
    System.out.println("Hello world!"); // each statement ends in comma
  } // END: closing curly brace.
}