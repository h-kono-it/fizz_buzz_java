package main;

import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    IntStream.rangeClosed(1, 100).mapToObj(Main::fizzBuzz).forEach(v -> System.out.println(v.value.isEmpty() ? v.i : v.value));
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
  }
//  実体としては以下のようなクラスが生成される
//  class FizzBuzz extends Record {
//    private final int i;
//    private final String value;
//    public FizzBuzz(int i, String value) {
//      this.i = i;
//      this.value = value;
//    }
//    public int i() {
//      return i;
//    }
//    public String value(){
//      return value;
//    }
//    public int hashCode() { ... }
//    public boolean equals() { ... }
//    public String toString() { ... }
//  }
}
