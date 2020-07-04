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

/* the following methods, formally known as mutators but often called setters
allow TimeClient to modify the instance variables of time. The method that sets
something, is usually called setSomething*/

public void setHour(int hour) {

      this.hour = hour;
} //end setHour method


public void setMinute(int minute){

      this.minute = minute;
} //end setMinute method

public void setSecond(double second){
      this.second = second;

} //end setSecond method

public static void main(String[] args) {

    Time time = new Time(11, 59, 59.9);
    System.out.println(time);

} //end main

} //end class
