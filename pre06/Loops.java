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

public static int myexp (int x, int n) {
//My attempt at exercise 5
      int ans=1;
      int temp=x;
      int stop=n;
      int i;

      for (i=1; i<=4; i++) {

        temp=(temp*x)/i;
        ans=ans+temp;
      }
        return ans;
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

//testing exercise 5

      int stop;
      int temp;
      System.out.println(myexp(1,4));
      System.out.println(myexp(2,8));

      //
/*As much as I hate too, I'm giving up on this exercise. I don't understand the
math yet. I looked at several videos about e^x infinite series expansion and I
just feel completely overwhelmed by the combination of the math (I do NOT have a
strong math background--I love math and I'm working on learning what I haven't
learned yet in all my schooling) and the loads of additional coding points in this
challenge. */
  }
}
//x^n=x*x^n-1
