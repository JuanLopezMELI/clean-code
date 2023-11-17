package org.example.utils;

public class Student {
  private String name;
  private double grade;

  public String getName() {
    return name;
  }

  public Student setName(String name) {
    this.name = name;
    return this;
  }

  public double getGrade() {
    return grade;
  }

  public Student setGrade(double grade) {
    this.grade = grade;
    return this;
  }
}
