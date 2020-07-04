
import java.io.*;
import java.util.*;


public class Time{

  // your time class code goes in here
    private int hour;
    private int minute;
    private double second;

/* The following constructor takes no return type and no return value,
the keyword static is omitted. Name is always the same as the class name */

public Time() {
  // construct a time object with default values
  //this is a keyword the refers to the object we are creating
  // DO NOT invoke NEW inside the constructor!
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;

  //constructors do NOT return values
} // end time constructor with default values

public Time (int hour, int minute, double second) {
/*It is common to create a constructor that takes no arguments and a value
constructor, like this one. */

//This parameter copies values from the parameters to the instance variables
    this.hour = hour;
    this.minute = minute;
    this.second = second;

} //end Time value constructor

public static void printTime(Time t) {

    // System.out.print(t.hour);
    // System.out.print(t.minute);
    // System.out.print(":");
    // System.out.println(t.second);

    // OR more concisely:

    System.out.printf("%02d: %02d: %04.lf\n", t.hour, t.minute, t.second);
} // end PrintTime method

} //end class
