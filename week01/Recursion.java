import java.io.*;
import java.util.*;
import java.util.Arrays;

//the starter code provided made this exercise much more accessible. Thank you!
public class Recursion {

 public static void main(String[] args) {
  System.out.println("Algorithms of Oppression!");
  System.out.printf("4! = %d\n", factorial(4) );
  System.out.printf("fib(1) = %d\n", fib(6) );
  System.out.printf("ack(0,3) = %d\n", ack(0,3) );

  //Calling the recursiveSum method

  int[] intArray= {0,1,1,2,3,5,8,13,21};
  System.out.println(recursiveSum(intArray));

 }

 public static int factorial(int n) {
   /* Yessss, creating a trace digram for this recursive method helped seal my
   understanding of both the syntax and the flow--the explicit modeling via the
   khan academy video that focused on a different recursion was key because this
   is a new way of thinking for me. */
   if(n<=1){
     return 1;
   }
   else {
     return n * factorial(n-1);

   }
   // int recurse= factorial(n-1);
   // int result= n * recurse;
   //return result;

 }

 //This is an example of primitive recursion:
 public static int fib(int n) {
/*it was very useful to create a trace diagram of this recursion after watching
a Khan Academy walk-through of it; I drew this diagram first. Moving forward, I
will incorporate explicit modeling of such diagramming in my ICM class*/
   if (n==1 || n==2){
     return 1;}

    return fib(n-1) + fib(n-2);
 }


 public static int ack (int m, int n) {
 /*

  */
  int ans;
  // int i, j;
  // for (i=0; i<6; i++);
  // for (j=0; j<6; j++);

   if (m == 0){
     ans= n + 1;

   }

   else if ((m > 0) && (n == 0)) {
     ans= ack(m-1, 1);
   }

   else
   {
     ans= ack(m-1, ack(m, n-1));
   }
/*I'm trying to get it to return each iteration. For example, "ackerman 0,3 is 4"
and "ackerman 0,4 is 5" and so on. I'm grappling with how to organize the code so
that it returns each iteration.*/
   // System.out.printf("ackerman (%d, %d) is:  %d\n", i, j, ack(i,j));
return ans;
 }

 public static int recursiveSum(int[] intArray) {

    int total= 0;
    for (int i=0; i<intArray.length; i++) {
      total += intArray[i];
    }
return total;
 }


}
