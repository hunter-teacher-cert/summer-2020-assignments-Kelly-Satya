import java.io.*;
import java.util.*;

//this is the constructor
public class Methods {

// instance variables here



public static boolean isDivisible (int n, int m) {
//Exercise 2 method
    if (n % m == 0) {

          return true;
    }
    else {

          return false;
    }
}


public static boolean isTriangle (int a, int b, int c) {
//Exercise 3 method
    if (a + b < c || a + c < b || b + c < a) {

            return false;
    }
    else {
            return true;
    }

}

public static int ack (int q, int r) {
/*


 */
  if (q == 0){
    return r + 1;

  }

  else if ((q > 0) && (r == 0)) {
  return ack(q-1, 1);
  }

  else  if ((q > 0) && (r > 0))
  {
    return ack(q-1, ack(q, r-1));
  }
}



  public static void main(String[] args){

//Exercise 2
      boolean x;
      boolean y;
      x= isDivisible (6,2);
      System.out.println(x);
      y= isDivisible (20,3);
      System.out.println(y);

/* Exercise 3--I'm wondering how I can call the values in isTriangle within
the variable pTrip one so I can in my first System.out.print statement embed those
values within. Example, "Can the side lengths 3, 4, 5 form a triangle?"*/

      boolean pTrip1;
      pTrip1= isTriangle(3,4,5);
      System.out.println("Can these side lengths form a triangle?");
      System.out.println(" ");
      System.out.println(pTrip1);


      boolean pTrip2;
      pTrip2= isTriangle(5,12,13);
      System.out.println("Can these side lengths form a triangle?");
      System.out.println(" ");
      System.out.println(pTrip2);


      boolean noPythTrip;
      noPythTrip= isTriangle (3, 4, 12);
      System.out.println("Can these side lengths form a triangle?");
      System.out.println(" ");
      System.out.println(noPythTrip);

// Exercise 8

      int tryAck1;
      tryAck1= ack(0,3);
      System.out.println(tryAck1);
      System.out.println(" ");


      int tryAck2;
      tryAck2= ack(2,0);
      System.out.println(tryAck2);
      System.out.println(" ");


      int tryAck3;
      tryAck3= ack(1,1);
      System.out.println(tryAck3);
      //return;
  }
}
