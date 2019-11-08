/******************************************************************************
 *  Compilation:  javac R02_Exp02_J.java
 *  Execution:    java R02_Exp02_J
 *
 *  Calls function compareArrays().
 ******************************************************************************/

import java.lang.*;
import java.io.*;
import java.util.*;

public class R02_Exp02_J
{
  public static void main(String[] args)
  {
    compareArrays();
  }

  /*
   * Rule 02. Expressions (EXP)
   * EXP02_J. Do not use the Object.equals() method to compare two arrays.
   * 
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/EXP02-J.+Do+not+use+the+Object.equals%28%29+method+to+compare+two+arrays
   */


  // GOOD IMPLEMENTATION
  public static void compareArrays()
  {
    int[] arr1 = new int[20]; // Initialized to 0
    int[] arr2 = new int[20]; // Initialized to 0
    System.out.println(Arrays.equals(arr1, arr2)); // Prints false
  }
}
