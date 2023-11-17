package org.example.examples;

public class DoOneThing {

  private double width;
  private double height;

  //Bad
  public void setSizeCalculateAndPrintArea(double width, double height) {
    this.width = width;
    this.height = height;
    double area = this.width * this.height;
    System.out.println("Area of the rectangle: " + area);
  }

  //Well
  public double calculateArea() {
    return this.width * height;
  }

  public void printArea(double area) {
    System.out.println("Area of the rectangle: " + area);
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

}
