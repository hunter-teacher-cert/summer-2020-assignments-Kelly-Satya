import java.io.*;
import java.util.*;

public class Time {

  public static void main(String[] args){

/*I tinkered with which variables can stay as int data types and which need to be double types; originally 
perPassNum variable wasn't working because the data type was givng the compiler the impression it should carry 
out integer division. I was trying to use the  printf with a format specification %.2f but couldn't figure out
the syntax. I was hoping to use it to format the percentage printed for the perPass variable. */


    int hour= 8;
    int minute=30;
    int second=59;
    int hourToMin= hour * 60;
    int totalMin= hourToMin + minute;
    double totalSec= totalMin * 60;
    double secRemainNum= 86400 - totalSec;
    double perPassNum= (totalSec / 86400) * 100;
    String sinceMidnight= "Number of seconds since midnight:";
    String secRemainText= "Number of seconds remaining in the day:";
    String perPass= perPassNum + "%" + " of the day has passed.";

    System.out.print(sinceMidnight);
    System.out.println(totalSec);
    System.out.print(secRemainText);
    System.out.println(secRemainNum);
    System.out.println(perPass);

    int hour2= 9;
    int min2= 31;
    int sec2= 59;

    String elapsedTime = (hour2 - hour) + " hour " + (min2 - minute) + " minutes and " + (sec2 - second);
    System.out.println(elapsedTime);



  }
}
