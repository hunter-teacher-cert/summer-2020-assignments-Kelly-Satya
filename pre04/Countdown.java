import java.io.*;
import java.util.*;

public class Countdown {

public static void main(String[] args) {

countdown(4);
}

public static void countdown (int n) {
  if (n==0) {
    System.out.println("Blastoff!");
  }
  else {
    System.out.println(n);
    countdown(n-1);
  }
}
/*I just realized that the following code is useless because the nlines
method isn't called at any point in the program AND because the countdown code
contains all the information needed. What I don't understand nos is why the nlines
method is considered superior according to chapter 5.*/

  public static void nLines(int n) {
    if (n > 0) {
      System.out.println();
      nLines(n-1);

      }
    }
  }
