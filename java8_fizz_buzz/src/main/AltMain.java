package main;

import java.util.Optional;
import java.util.stream.IntStream;

public class AltMain {
  public static void main(String[] args) {
    IntStream.rangeClosed(1, 100).mapToObj((i) -> fizzBuzz(i).orElse(String.valueOf(i))).forEach(System.out::println);
  }

  public static Optional<String> fizzBuzz(int i) {
    if (i % 15 == 0) {
      return Optional.of("FizzBuzz");
    } else if (i % 3 == 0) {
      return Optional.of("Fizz");
    } else if (i % 5 == 0) {
      return Optional.of("Buzz");
    }
    return Optional.empty();
  }
}
