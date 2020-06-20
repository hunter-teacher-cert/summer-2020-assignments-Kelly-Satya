import java.io.*;
import java.util.*;

public class Time {

  public static void main(String[] args){

    double hour= 8;
    double minute=30;
    double second=59;
    double hourToMin= hour * 60;
    double totalMin= hourToMin + minute;
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
