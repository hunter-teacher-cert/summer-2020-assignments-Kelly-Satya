import java.io.*;
import java.util.*;


class Arrays8part2 {
//I've copied and pasted this randomArray method from Tsee
  public static int[] randomArray(int size) {
  		Random random = new Random();
  		int[] a = new int[size];
  		for (int i = 0; i < a.length; i++) {
  			a[i] = random.nextInt(100);
  		}
  		return a;
  	}

// public static int inRange(int[] a, int low, int high) {
//
//     int count=0;
//     for (int i=0; i <a.length; i++) {
//
//       if (a[i] >= low && a[i] <high) {
//         count++;
//       }
//     }
//       System.out.println(count);
//       return count;
//   }

public static int[] histogram(int[] a) {
    int[] counts= new int[100];

    for (int score : a) {

      counts[score]++;
    }
System.out.println(counts);
return counts;
}


public static void main(String[] arg){

      int[] firstArray= randomArray(6);
      int[] countsArray=histogram(firstArray);
      System.out.println(Arrays.toString(firstArray));
      System.out.println(Arrays.toString(countsArray));

      // int firstBar= inRange(a, 50, 59);
      // int secondBar=inRange(a, 60, 69);
      // int thirdBar= inRange(a, 70, 79);
      // int fourthBar=inRange(a, 80, 89);
      // int fifthBar=inRange(a, 90, 99);

}
}
