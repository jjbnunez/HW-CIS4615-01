/******************************************************************************
 *  Compilation:  javac R04_Str03_J.java
 *  Execution:    java R04_Str03_J
 *
 *  Calls function makeBigIntString().
 ******************************************************************************/

import java.lang.*;
import java.math.BigInteger;
import java.io.*;

public class R04_Str03_J
{
  public static void main(String[] args)
  {
    makeBigIntString();
  }

  /*
   * Rule 04. Characters and Strings (EXP)
   * STR03_J. Do not encode noncharacter data as a string.
   * 
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
   */

  // BAD IMPLEMENTATION
  public static void makeBigIntString()
  {
    BigInteger x = new BigInteger("530500452766");
    System.out.println("Initial: " + x.toString());
    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);
    System.out.println("Final: " + x.toString());
  }
}
