import java.io.*;
import java.util.*;
import java.util.Arrays;

public class ArrayPractice1 {

// model code for student-facing ppt.
  public static void main(String[] args) {

      int[][] theGoatGrid= new int[5][10];

      for (int index=0; index < theGoatGrid.length; index++) {
            for (int column=0; column < theGoatGrid[index].length; column++){

          theGoatGrid[index][column]= 95;
      }// end nested for loop
} // end parent for loop
  System.out.println(Arrays.deepToString(theGoatGrid));
  } // end main

} //end public class ArrayPractice1
