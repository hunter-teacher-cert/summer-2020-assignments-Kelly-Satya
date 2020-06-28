import java.io.*;
import java.util.*;


class Arrays8part2 {

public static int inRange(int[] a, int low, int high) {

    int count=0;
    for (int i=0; i <a.length; i++) {

      if (a[i] >= low && a[i] <high) {
        count++;
      }
    }
      System.out.println(count);
      return count;
  }

// public static int histogram(int[] a) {
//     int[] counts= new int[100];
//
//     for (int score : a) {
//
//       counts[score]++;
//     }
//
// return counts;
// }


public static void main(String[] arg){

      int[] a= {97, 55, 72, 69, 86, 86, 84, 83, 88, 92, 93, 94, 86};
      //histogram(a, 100);

      int firstBar= inRange(a, 50, 59);
      int secondBar=inRange(a, 60, 69);
      int thirdBar= inRange(a, 70, 79);
      int fourthBar=inRange(a, 80, 89);
      int fifthBar=inRange(a, 90, 99);

}
}
