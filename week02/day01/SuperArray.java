import java.io.*;
import java.util.*;

public class SuperArray {

    private int[] data;
    private int numberElements;

/* constructor that accepts no parameters. Sets the data array so it can hold
ten elements and numberElement to zero*/

public SuperArray(){

  /* array is declared about and this.data points to this instance of the class*/

  data = new int[10];
  numberElements = 0;


  //System.out.println(Arrays.toString(data));
} // end SuperArray constructor that declares and instantiates super boundary



public SuperArray(int[] size){

/* Isn't this giong to create a new array? */

    data = new int[size];
    numberElements = 0;

    return data;
} // end superArray constructor that creates dynamic internal array



public void add(int value){

  /* this routine will add the parameter value to the end of the array--so,
  this.numberElement= this.numberElements + value.
  IF there is no more room in the array, do nothing.
  */
    if (value + this.numberElements < this.data.length){
        this.numberElements = this.numberElements + value;

        //access first free space in the array, and insert value there
    }
    /* ideally, the value below should not be hard-coded because I want this to
    be more dynamic*/
    if (value + this.numberElements >= this.numberElements.length) {
      return;
    } //end if statement

} // end add method


public int getValue(int index){

  /* return value at location index from the array, IF index is past the last
  element, return -1;*/
    int value = data[index];

        if (data[index] > data.length)
        {
          return -1;
        }
} // end getElement method


public boolean isEmpty() {

    if (SuperArray == this.data[0]) {
      return true;
    } // end if statement
    else {
      return false;
    } // end else statment
} // end isEmpty method


public String toString(){

  /*build an return a string with all the elements of the array in a printable
  form*/
  String arrayData = " ";
  arrayData = arrayData + " " + data[i];

  for (int i = 0; i < numberElements; i++) {

    //arrayData.add[i];

  } // end toString method
  return arrayData;
} // end toString method


public static void main(String[] args) {

    // how do I send a value to my constructor?
    SuperArray sa= new SuperArray();
    sa.add(2);
    //System.out.println(Arrays.toString(sa));
    //System.out.println(sa.length);

} // end main


} // end class
