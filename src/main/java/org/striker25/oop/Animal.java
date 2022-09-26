package org.striker25.oop;

import java.util.Objects;

public class Animal {

  // class fields, should be private for **ENCAPSULATION**
  private String name;
  private int age;

  private String color;

  // getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  // Always override ToString, Equals and Hashcode


  @Override
  public String toString() {
    return "Animal{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", color='" + color + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Animal animal = (Animal) o;
    return age == animal.age && Objects.equals(name, animal.name)
        && Objects.equals(color, animal.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, color);
  }
}
