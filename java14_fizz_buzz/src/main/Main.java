package main;

import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    IntStream.rangeClosed(1, 100).forEach(Main::fizzBuzz);
  }

  public static void fizzBuzz(int i) {
    var fizz = "Fizz";
    var buzz = "Buzz";
    var t = switch (i) {
      case 15, 30, 45, 60, 75, 90 -> fizz + buzz;
      case 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99 -> fizz;
      case 5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100 -> buzz;
      default -> String.valueOf(i);
    };
  }
}
