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




  public static void main(String[] args) {

//testing
      System.out.println(forPower(2,3));
      System.out.println(forPower(2,5));
      System.out.println(forPower(8,3));

  }
}
//x^n=x*x^n-1
