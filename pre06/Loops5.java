import java.io.*;
import java.util.*;



class Loops5 {


static int fact(int n) {

    int prod = 1;
    int i;
    for (i =2; i<=n; i++) {
      prod = prod * i;
    }
    return prod;
  }

static int pow(int a, int b) {

  int prod = 1;
  for (int i =0; i < b; i++){
      prod= prod * a;
  }

  return prod;
}

static double myexp (int x, int n) {

  int i;
  double result=0.0;
  double term;
  for (i=0; i<n; i++) {
      int num = pow(x,i);
      int den = fact(i);
      term= 1.0*num/ den;
      //System.out.printf("%d: %d , %d\n", i, num, den);
      result = result + term;
  }
  return result;
  //return 0.0;
}

static double fasterMyExp (int x, int n) {

  int i;
  double result= 1.0;
  int num=1;
  int den=1;
  if (n==0)
    return 1;
  for (i=1; i<n; i++){
      num= num * x;
      den= den * i+1;
      double term = 1.0*num/den;
      result= result + term;
  }
    return result;
}
        public static void main (String[] args) {

            double result, fastresult;
            for (int i=0; i <10; i++) {
            result = myexp(1,i);
            fastresult= fasterMyExp(1,i);
            System.out.printf("%f  : %f\n", result, fastresult);
}

            //System.out.println(Math.exp(1));
            //System.out.printf("fact(%d)= %d\n" , i, fact(i));
            //System.out.printf("2^%d= %d\n",i,pow(2,i));
            //myexp(2,10);

        }
}
