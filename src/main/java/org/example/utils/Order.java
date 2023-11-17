package org.example.utils;

public class Order {
  private String name;
  private int quantity;
  private double price;
  private double total;
  private double discount;
  private double tax;
  private double grandTotal;

  public String getName() {
    return name;
  }

  public Order setName(String name) {
    this.name = name;
    return this;
  }

  public int getQuantity() {
    return quantity;
  }

  public Order setQuantity(int quantity) {
    this.quantity = quantity;
    return this;
  }

  public double getPrice() {
    return price;
  }

  public Order setPrice(double price) {
    this.price = price;
    return this;
  }

  public double getTotal() {
    return total;
  }

  public Order setTotal(double total) {
    this.total = total;
    return this;
  }

  public double getDiscount() {
    return discount;
  }

  public Order setDiscount(double discount) {
    this.discount = discount;
    return this;
  }

  public double getTax() {
    return tax;
  }

  public Order setTax(double tax) {
    this.tax = tax;
    return this;
  }

  public double getGrandTotal() {
    return grandTotal;
  }

  public Order setGrandTotal(double grandTotal) {
    this.grandTotal = grandTotal;
    return this;
  }
}
