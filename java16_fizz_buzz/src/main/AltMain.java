package main;

import java.util.stream.IntStream;

public class AltMain {
  public static void main(String[] args) {
    IntStream.rangeClosed(1, 100).mapToObj(i -> fizzBuzz(i).value).forEach(System.out::println);
  }

  public static FizzBuzz fizzBuzz(int i) {
    if (i % 15 == 0) {
      return new FizzBuzz(i, "FizzBuzz");
    } else if (i % 3 == 0) {
      return new FizzBuzz(i, "Fizz");
    } else if (i % 5 == 0) {
      return new FizzBuzz(i, "Buzz");
    } else {
      return new FizzBuzz(i, "");
    }
  }

  record FizzBuzz(int i, String value) {
    FizzBuzz(int i, String value) {
      this.i = i;
      this.value = value.isEmpty() ? String.valueOf(i) : value;
    }
  }
}
