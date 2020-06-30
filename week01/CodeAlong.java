import java.io.*;
import java.util.*;
import java.util.Arrays;

public class CodeAlong {
//June 30th, CodeAlong with DW.
  public static void main(String[] arg){


      //int [row][column]
      int[][] arr = new int[10][5];
      //System.out.println(Arrays.deepToString(arr[2],[3]);
      popArray(arr);
      printArray(arr);

  }// end main

  public static void printArray(int[] a){

      int value=0;

    for (int r=0; r<a.length; r++) {
      for (int c=0; c< a[r].length; c++){
        a[r][c]= value;
        value++;
    }//end for c
    }//end for r
  }//end popArray


  public static void popArray(int[][] a){

    for (int r=0; r < a.length; r++) {
      for (int c=0; c< a[r].length; c++){
        System.out.printf("%d ", a[r][c]);
    }//end for c
        System.out.println();
    }//end for r
    System.out.println();
  }//end printArray
}//end class
