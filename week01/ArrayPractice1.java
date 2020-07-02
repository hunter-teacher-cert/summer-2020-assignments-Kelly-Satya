import java.io.*;
import java.util.*;
import java.util.Arrays;

public class ArrayPractice1 {

// model code for student-facing ppt.
  public static void main(String[] args) {

      int[] studentOneGrades= new int[5];

      for (int index=0; index < studentOneGrades.length; index++) {

          studentOneGrades[index]= 95;
      }// end for loop

      System.out.println(Arrays.toString(studentOneGrades));

  } // end main

} //end public class ArrayPractice1
