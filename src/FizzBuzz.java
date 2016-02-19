/**
 * Created by lucetzer on 17/02/2016.
 */
public class FizzBuzz {
  public Boolean isDivisbleByThree(int n) {
    if (n % 3 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public Boolean isDivisbleByFive(int n) {
    if (n % 5 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public Boolean isDivisbleByThreeAndFive(int n) {
    if (n % 5 == 0 && n % 3 == 0) {
      return true;
    } else {
      return false;
    }
  }



  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      FizzBuzz FizzBuzzTest = new FizzBuzz();
      System.out.println(i);
      if (FizzBuzzTest.isDivisbleByThree(i) == true) {
        System.out.println("Fizz");
      }
      if (FizzBuzzTest.isDivisbleByFive(i) == true) {
        System.out.println("Buzz");
      }
      if (FizzBuzzTest.isDivisbleByThreeAndFive(i) == true) {
        System.out.println("FizzBuzz");
      }
    }
  }
  
}
