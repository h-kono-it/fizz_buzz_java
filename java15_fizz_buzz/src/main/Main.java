package main;

public class Main {
  public static void main(String[] args) {
    var fizz = "Fizz";
    var buzz = "Buzz";
    var fizzBuzz = """
        FizzBuzz
        %d
        %d""";
    for (int i = 1; i <= 100; i++) {// 条件が90まで等だと蛇足を描いてしまう
      if (i % 15 == 0) {
        System.out.println(fizzBuzz.formatted(i++, i++));
      } else if (i % 3 == 0) {
        System.out.println(fizz);
      } else if (i % 5 == 0) {
        System.out.println(buzz);
      } else {
        System.out.println(i);
      }
    }
  }
}
