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

  // GOOD IMPLEMENTATION
  public static void makeBigIntString()
  {
    BigInteger x = new BigInteger("530500452766");
    System.out.println("Initial: " + x.toString());
    String s = x.toString();  // Valid character data
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray); 
    x = new BigInteger(ns);
    System.out.println("Final: " + x.toString());
  }
}
