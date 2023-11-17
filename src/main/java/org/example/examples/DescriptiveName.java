package org.example.examples;

public class DescriptiveName {

  //Bad
  public boolean check(Object obj) {
    //Some other object checking logic
    return obj.toString().equals("foo");
  }

  //Well
  public boolean isFoo(Object obj) {
    return obj.toString().equals("foo");
  }

}
