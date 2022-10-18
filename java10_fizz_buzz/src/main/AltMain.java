package main;

import java.util.stream.IntStream;

public class AltMain {
  public static void main(String[] args) {
    var fizzBuzz = new Object(){
      private void exec(int i){
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
    };
    IntStream.rangeClosed(1, 100).forEach(fizzBuzz::exec);
  }
}
