/******************************************************************************
 *  Compilation:  javac R03_Num04_J.java
 *  Execution:    java R03_Num04_J
 *
 *  Calls function compute().
 ******************************************************************************/

import java.lang.*;
import java.io.*;

public class R03_Num04_J
{
  public static void main(String[] args)
  {
    compute();
  }

  /*
   * Rule 03. Numeric Types and Operations (NUM)
   * NUM04_J. Do not use floating-point numbers if precise computation is required.
   * 
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/NUM04-J.+Do+not+use+floating-point+numbers+if+precise+computation+is+required
   */

  // BAD IMPLEMENTATION
  public static void compute()
  {
    double dollar = 1.00;
    double dime = 0.10;
    int number = 7;
    System.out.println("A dollar less " + number + " dimes is $" + (dollar - number * dime));
  }
}
