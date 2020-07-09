import java.io.*;
import java.util.*;




class ArrayPractice {

public static void main (String[] args) {
  //
  //     int [] [] grades= {
  //
  //       {72,76,74},
  //       {78,82,83,92,88,93},
  //       {90,93,93},
  //     };
  // System.out.println(grades[1][1]);
  // System.out.println(Arrays.deepToString(grades));
  // System.out.println(grades.length);
  // System.out.println(grades[1].length);
  //
  //
  // for (int i= 0; i<grades.length; i++) {
  //     for (int k=0; k<grades[i].length; k++){
  //       //System.out.println(grades[i][k]);
  //       System.out.print(grades[i][k] + " ");
  //     }
  //     System.out.println();
  // }

//List<Integer> is an interface; ArrayList<Integer> an implementation.
  List<Integer> grades= new ArrayList<Integer>();
  grades.add(5);
  grades.add(10);
  grades.add(1,7);

  System.out.println(grades.get(1));
  System.out.println(grades.indexOf(7));
}



}
