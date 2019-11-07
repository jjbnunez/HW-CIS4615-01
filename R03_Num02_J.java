/******************************************************************************
 *  Compilation:  javac R03_Num02_J.java
 *  Execution:    java R03_Num02_J
 *
 *  Calls function divide(x, y) twice.
 ******************************************************************************/

import java.lang.*;
import java.io.*;

public class R03_Num02_J
{
  public static void main(String[] args)
  {
    System.out.println("Result of 1 divided by 5: " + divide((long)1, (long)5));
    System.out.println("Result of 1 divided by 0: " + divide((long)1, (long)0));
  }

  /*
   * Rule 03. Numeric Types and Operations (NUM)
   * NUM02_J. Ensure that division and remainder operations do not result in divide-by-zero errors.
   * 
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/NUM02-J.+Ensure+that+division+and+remainder+operations+do+not+result+in+divide-by-zero+errors
   */


  // BAD IMPLEMENTATION
  public static long divide(long x, long y)
  {
    return x / y;
  }
}
