import java.io.*;
import java.util.*;
import java.util.Scanner;


class Craps {



public static int[][] roll(int[][] n) {


      int[get] [spin] play= {

        {2,3,7,12,5,11,12},
        {11,4,5,3,6,10,7},
        {2,3,12,12,11,7,3},
        {6,8,8,9,11,12,7},
        {12,12,2,2,3,3,7},
        {11,7,12,1,6,8,9},
      };

}


// public static int shoot (int dice, int max){
//     if (dice==0) {
//       return 0;
//     }
//     else {
//       return shoot (dice-1, max) + roll(max);
//     }


}

public static boolean round() {
//int spin;
//int point;
    if(spin==7 || spin==11) {

      System.out.println("You're a winner!");
    }
    else if (spin==2 || spin==3 || spin==12) {

      System.out.println("You're a loser!");
    }
    else {
      //int point;
      //spin=point;
      System.out.println("Roll again!");
    }
}


public static void main(String[] args){
    System.out.println("Choose a number 0-6!");
    Scanner rollTheDice= new Scanner(System.in);
    grab= rollTheDice.nextInt();
    System.out.println("Choose another number 0-6!");
    spin= rollTheDice.nextInt();



}
}
