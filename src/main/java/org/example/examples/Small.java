package org.example.examples;

import java.util.List;
import org.example.utils.Student;

public class Small {

  //Bad
  public static void generateReport(List<Student> students) {
    double totalGrade = 0;
    int numberOfStudents = students.size();
    int numberOfPassingStudents = 0;

    for (Student student : students) {
      totalGrade += student.getGrade();
      if (student.getGrade() >= 50) {
        numberOfPassingStudents++;
      }
    }

    double averageGrade = totalGrade / numberOfStudents;

    System.out.println("Average Grade: " + averageGrade);
    System.out.println("Passing Students:");

    for (Student student : students) {
      if (student.getGrade() >= 50) {
        System.out.println(student.getName());
      }
    }
  }

  //Quite well
  public static void generateReport2(List<Student> students) {
    double totalGrade = calculateTotalGrade(students);
    int numberOfStudents = students.size();
    countPassingStudents(students);

    calculateAverageGrade(totalGrade, numberOfStudents);

    displayPassingStudents(students);
  }








  private static double calculateTotalGrade(List<Student> students) {
    double totalGrade = 0;
    for (Student student : students) {
      totalGrade += student.getGrade();
    }
    return totalGrade;
  }

  private static void calculateAverageGrade(double totalGrade, int numberOfStudents) {

  }

  private static void countPassingStudents(List<Student> students) {
    int count = 0;
    for (Student student : students) {
      if (student.getGrade() >= 50) {
        count++;
      }
    }
  }

  private static void displayPassingStudents(List<Student> students) {
    for (Student student : students) {
      if (student.getGrade() >= 50) {
        System.out.println(student.getName());
      }
    }
  }

}
