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


  public static void main(String[] arg){

      int[] a= {42, 17, 12, 19, 78, 97};
      int firstResult= indexOfMax(a);
      System.out.println(Arrays.toString(a));
      System.out.println(" ");
      //System.out.println(indexOfMax.maxInd);
  }




}
