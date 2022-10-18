package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Integer[] array = IntStream.rangeClosed(1, 100).mapToObj(Integer::valueOf).toArray(Integer[]::new);
    List.of(array).stream().forEach(Main::fizzBuzz);
  }

  public static void fizzBuzz(Integer i) {
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
