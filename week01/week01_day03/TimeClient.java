import java.io.*;
import java.util.*;

public class TimeClient {


/* by convention, the method that gets a variable named something is called
getSomething */


public int getHour() {

      return this.hour;
} // end getHour accessor

public int getMinute(){

      return this.minute;
} // end getMinute accessor

public int getSecond() {

      return this.second;
}




public static void main(String[] args) {

    Time time = new Time(11, 59, 59.9);
    System.out.println(time);

} //end main

} //end class
