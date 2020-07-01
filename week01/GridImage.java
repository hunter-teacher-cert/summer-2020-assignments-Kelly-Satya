import java.io.*;
import java.util.*;

public class GridImage {

  public static void main(String[] args) {

    int rows = 20;
    int cols = 20;

    int[][] array2d = new int[rows][cols];

    rowPop(array2d,2,14);
    colPop(array2d,3,89);


    invert(array2d);
    print2d(array2d);
    //System.out.println(invert);


  } //end main

  public static void print2d(int[][] array2d) {

      for (int row=0; row < array2d.length; row++) {
        for (int col=0; col < array2d[row].length; col++) {
          System.out.printf("%03d ", array2d[row][col]);
        }//end c for
          System.out.println();
      }//end r for
  }//end print2d


  public static void rowPop(int[][] array2d, int row, int value) {

    //populates row in array2d with value

        for (int col=0; col < array2d[row].length; col++) {
            array2d[row][col]= value;
        }//end row

  }//end rowPop

  public static void colPop(int[][] array2d, int col, int value) {
//populates column c in d2 with value

        for (int ind = 0; ind < array2d.length; ind++) {
            array2d[ind][col]= value;
        } //end ind

  }//end colPop

  public static void invert(int[][] array2d) {
    /*Goes through array2d and modifies each element so all 0s become 255 and
    any non-zero value becomes zero */
    for (int row = 0; row < array2d.length ; row++ ) {
        for (int col = 0; col < array2d[row].length; col++) {
          if (array2d[row][col] > 0) {
              array2d[row][col] = 0;
          }// end if statement
          else {
              array2d[row][col] = 255;
          }//end else
          //System.out.print(array2d[row][col]);
          }//end for second for loop
      } //end for first loop

  } //end invert


  public static void diagonal(int[][] array2d, int row, int col, int direction, int value) {

    /* Sets the diagonal starting at d2[r][c] going in direction to value
      0: up + left
      1: up + right
      2: down + left
      3: down + right
     */


  }//end diagonal

}
