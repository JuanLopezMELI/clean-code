package org.example.examples;

import org.example.utils.Order;

public class MeaningfulOrder {
  //Bad
  public void processOrder(Order order) {
    generateInvoice(order);
    validateOrder(order);
    computeTaxes(order);
    calculateTotal(order);
  }

  //Good
  public void processOrder2(Order order) {
    validateOrder(order);
    calculateTotal(order);
    computeTaxes(order);
    generateInvoice(order);
  }


  private void generateInvoice(Order order) {}

  private void validateOrder(Order order) {}

  private void computeTaxes(Order order) {}

  private void calculateTotal(Order order) {}
}
