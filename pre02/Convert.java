import java.io.*;
import java.util.*;
import java.util.Scanner;

//I'm not sure whether I need to call all three of these packages.

public class Convert {

    public static void main(String[] args){
      Double tempC;
      Double tempF;
      Scanner in= new Scanner(System.in);

//This was interesting because I had to tinker with the control flow.
//Originally, I had the tempF variable declared & initialized at the top!
      System.out.print("Convert Celsius to Fahrenheit! Insert temp: ");
      tempC = in.nextDouble();
      tempF= (tempC * 9/5) + 32;
      System.out.println(tempC + "degrees Celsius equals " + tempF + " degrees Fahrenheit");

    }
}
