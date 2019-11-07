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

  // BAD IMPLEMENTATION
  public static void loop()
  {
    for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
      System.out.println(x);
    }
  }
}
