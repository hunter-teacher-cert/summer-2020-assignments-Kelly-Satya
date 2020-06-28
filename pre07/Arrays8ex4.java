import java.io.*;
import java.util.*;

class Arrays8ex4 {

    public static int indexOfMax(int[] a) {


      int maxInd = 0;
      int max= a[0];
        for (int i=1; i<a.length; i++){

          if(a[i] > max) {
            max= a[i];
            maxInd= i;
          }
        }
        System.out.println(maxInd);
        return maxInd;
    }

    //I worked through Tsee's code for help with this challenge.
public static int itsPrime(boolean[] a, int i){

    for (i==; i<a.lenth; i++) {
      if (a[i]) {
        return i;
      }
    }
return i;
}
public static boolean[] sieve(int n) {

  boolean[] erato= new boolean[n];
      for (int i=2; i<n; i++) {
        erato[i]= true;
      }
      for (int i=2; i<n; i= int itsPrime(erato,i)) {

          for (int j=i*2; j<n; j+=i) {
            erato[j]= false;
          }
      }
      return erato;
}

  public static void main(String[] arg){

      int[] a= {42, 17, 12, 19, 78, 97};
      int firstResult= indexOfMax(a);
      System.out.println(Arrays.toString(a));
      System.out.println(" ");
      //System.out.println(indexOfMax.maxInd);
      int check=99;
      boolean [] verified= sieve(check);
      for (int i=0; i<check; i++){
        System.out.printf("%d:" , i);
        System.out.print(verified[i] + " ");
      }
  }




}
