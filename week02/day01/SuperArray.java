import java.io.*;
import java.util.*;

public class SuperArray {

    private int[] data;
    private int numberElements;

/* constructor that accepts no parameters. Sets the data array so it can hold
ten elements and numberElement to zero*/

public void superArray(){

  /* array is declared about and this.data points to this instance of the class*/

  this.data = new int[10];
  this.numberElements = 0;

} // end SuperArray constructor that declares and instantiates super boundary

public int[] superArray(int[] size){

/* Isn't this giong to create a new array? */

    this.data = superArray(size);
    return superArray(size);

} // end superArray constructor that creates dynamic internal array

public void add(int value){

  /* this routine will add the parameter value to the end of the array--so,
  this.numberElement= this.numberElements + value.
  IF there is no more room in the array, do nothing.
  */
    this.numberElements = this.numberElements + value;

    if (this.numberElements == 10) {
      return;
    } //end if statement

}

public static void main(String[] args) {



} // end main




} // end class
