package org.striker25.oop;

import org.striker25.oop.Circle.UnitType;

public class Polymorphism {

  public static void main(String[] args) {

    Shape parentShape = new Shape();
    Shape rectangle = new Rectangle(5, 6);
    Shape triangle = new Triangle(5, 6);
    Shape circleWithRadius = new Circle(UnitType.RADIUS, 5);
    Shape circleWithDiameter = new Circle(UnitType.DIAMETER, 10);

    Shape[] shapes = {
        parentShape,
        rectangle,
        triangle,
        circleWithRadius,
        circleWithDiameter
    };

    // enhanced-loop, no indexes
    for (Shape shape : shapes) {
      double area = shape.getAreaInSquaredMeters();
      String clazz = shape.getClass().getSimpleName();

      System.out.printf("%s: %.2f %s%n", clazz, area, "m2");
    }
  }
}

class Shape {

  private static final double ZERO = 0.00;

  double getAreaInSquaredMeters() {
    return ZERO;
  }

  @Override
  public String toString() {
    return "Shape{}";
  }
}

class Rectangle extends Shape {

  private final double width;
  private final double height;


  // constructor
  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double getAreaInSquaredMeters() {
    return width * height;
  }

  @Override
  public String toString() {
    return "Rectangle{" + "height=" + height + ", width=" + width + '}';
  }

  // equals and hashcode omitted in this case for simplicity
}

class Triangle extends Shape {

  private final double height;
  private final double width;

  public Triangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public double getAreaInSquaredMeters() {

    double squaredArea = width * height;

    if (squaredArea > 0) {
      return squaredArea / 2;
    }

    return 0;
  }

  @Override
  public String toString() {
    return "Triangle{" + "height=" + height + ", width=" + width + '}';
  }

  // equals and hashcode omitted in this case for simplicity
}

class Circle extends Shape {

  private final double diameter;

  public Circle(UnitType type, double value) {

    if (type == UnitType.RADIUS) {
      this.diameter = 2 * value;
    } else {
      this.diameter = value;
    }

  }

  public enum UnitType {
    DIAMETER, RADIUS
  }

  @Override
  public double getAreaInSquaredMeters() {
    return Math.PI * (Math.sqrt(this.diameter) / 4);
  }

  @Override
  public String toString() {
    return "Circle{" + "diameter=" + diameter + '}';
  }

  // equals and hashcode omitted in this case for simplicity
}
