package main;

import java.util.stream.IntStream;
// .\java.exe Main.java
public class Main {
  public static void main(String[] args) {
    IntStream.rangeClosed(1, 100).forEach(Main::fizzBuzz);
  }

  public static void fizzBuzz(int i) {
    var fizz = "Fizz";
    var buzz = "Buzz";
    if (i % 15 == 0) {
      System.out.println(fizz + buzz);
    } else if (i % 3 == 0) {
      System.out.println(fizz);
    } else if (i % 5 == 0) {
      System.out.println(buzz);
    } else {
      System.out.println(i);
    }
  }
}
