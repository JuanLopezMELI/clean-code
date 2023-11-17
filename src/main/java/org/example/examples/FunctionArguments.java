package org.example.examples;

import org.example.utils.Order;

public class FunctionArguments {

  //Bad
  public void processOrder(
      String productName,
      Long productCode,
      int quantity,
      double price) {
    System.out.printf("Processing order %s, %d, %d, %f%n", productName, productCode, quantity, price);
  }

  //Better
  public void processOrder(Order order) {
    System.out.println("Processing order " + order);
  }

}
