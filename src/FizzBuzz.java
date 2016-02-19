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

  public void FizzBuzz100() {
    for (int i = 1; i <= 100; i++) {
      if (isDivisbleByThree(i) == false && isDivisbleByFive(i) == false) {
        System.out.println(i);
      }
      if (isDivisbleByThree(i) == true) {
        System.out.println("Fizz");
      }
      if (isDivisbleByFive(i) == true) {
        System.out.println("Buzz");
      }
      if (isDivisbleByThree(i) == true && isDivisbleByFive(i) == true ) {
        System.out.println("FizzBuzz");
      }
    }
  }

  public static void main(String[] args) {
    FizzBuzz game = new FizzBuzz();
    game.FizzBuzz100();
  }

}
