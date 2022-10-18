package main;

import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    IntStream.rangeClosed(1, 100).forEach(Main::fizzBuzz);
  }

  public static void fizzBuzz(int i) {
    if (i % 15 == 0) {
      System.out.println("FizzBuzz");
    } else if (i % 3 == 0) {
      System.out.println("Fizz");
    } else if (i % 5 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(i);
    }
  }
}
