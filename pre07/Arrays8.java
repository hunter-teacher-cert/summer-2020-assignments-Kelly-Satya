import java.io.*;
import java.util.*;


class Arrays8 {


        public static double powArray (double[] a, double pow) {

              double total= 0.0;


              for (int i =0; i < a.length; i++){
              a[i] = Math.pow(a[i],pow);
              total *= a[i];
        }

        return total;

}

        public static void main(String[] args) {
              double[] a= {2,3,4,5};
              double pow= 2.0;
              double firstResult= powArray(a,pow);
              System.out.println(Arrays.toString(a));
              System.out.println(" ");
              pow= 3.0;
              double secondResult= powArray(a,pow);
              System.out.println(Arrays.toString(a));
              // double pow=3.0;
              // double secondResult=powArray(a,pow);
              // System.out.println(Arrays.toString(a));
        }
}




// public static void printArray(int[] a) {
//   System.out.print("{}" + a[0]);
//   for (int i =1; i < a.length; i++) {
//   System.out.print(", ") + a[i]);
//   }
//   System.out.println("}");
// }
