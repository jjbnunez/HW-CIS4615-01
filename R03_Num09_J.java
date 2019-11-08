/******************************************************************************
 *  Compilation:  javac R03_Num09_J.java
 *  Execution:    java R03_Num09_J
 *
 *  Calls function loop().
 ******************************************************************************/

import java.lang.*;
import java.io.*;

public class R03_Num09_J
{
  public static void main(String[] args)
  {
    loop();
  }

  /*
   * Rule 03. Numeric Types and Operations (NUM)
   * NUM09_J. Do not use floating point variables as loop counters.
   * 
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/NUM09-J.+Do+not+use+floating-point+variables+as+loop+counters
   */

  // GOOD IMPLEMENTATION
  public static void loop()
  {
    for (int count = 1; count <= 10; count += 1) {
      float x = count/10.0f;
      System.out.println(x);
    }
  }
}
