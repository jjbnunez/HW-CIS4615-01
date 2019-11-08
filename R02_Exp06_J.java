/******************************************************************************
 *  Compilation:  javac R02_Exp06_J.java
 *  Execution:    java R02_Exp06_J
 *
 *  Calls function process(index).
 ******************************************************************************/

import java.lang.*;
import java.io.*;
import java.util.*;

public class R02_Exp06_J
{
  public static void main(String[] args)
  {
    process(1);
  }

  /*
   * Rule 02. Expressions (EXP)
   * EXP06_J. Expressions used in assertions must not produce side-effects.
   * 
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/EXP06-J.+Expressions+used+in+assertions+must+not+produce+side+effects
   */


  // GOOD IMPLEMENTATION
  public static void process(int index) {
    ArrayList<String> names = new ArrayList<String>();
    boolean nullsRemoved = names.remove(null);
    assert nullsRemoved; // No side effect
    // ...
  }
}
