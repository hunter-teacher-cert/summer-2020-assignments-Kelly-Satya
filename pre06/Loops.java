import java.io.*;
import java.util.*;

public class Loops {


public static int forPower (int x, int power) {
/* exercise 3. I'm not sure if I've done this correctly. When I orginally read
prompt, I interpreted it to mean that my program should be recursive, which
crashed my brain. */
        int answer= 1;
        for (int i=0; i < power; i++) {

          answer *= x;
        }
        return answer;
  }

//exercise 4

public static int factorial (int n) {

  int num=n;
  int factorial=1;
  for (int i=num; i>0; i--) {

    factorial = factorial * i;
  }

      return factorial;

}


  public static void main(String[] args) {

//testing exercise 3
      System.out.println(forPower(2,3));
      System.out.println(forPower(2,5));
      System.out.println(forPower(8,3));

// testing exercise 4
      int num;
      System.out.println(factorial(5));
      System.out.println(factorial(9));
      System.out.println(factorial(3));
      System.out.println(factorial(12));



  }
}
//x^n=x*x^n-1
