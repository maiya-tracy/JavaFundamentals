public class FizzBuzz {
  public String fizzBuzz(int number) {
    return ( number % 3 == 0 ? (number % 5 == 0 ? "FizzBuzz" : "Fizz") : (number % 5 == 0 ? "Buzz" : String.valueOf(number) ) );
  }
}
