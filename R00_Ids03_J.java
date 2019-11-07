/******************************************************************************
 *  Compilation:  javac R00_Ids03_J.java
 *  Execution:    java R00_Ids03_J
 *
 *  Calls function performLogin(userName, loginSuccessful) with legal and
 *  illegal values.
 ******************************************************************************/

import java.lang.*;
import java.io.*;

public class R00_Ids03_J
{
  public static void main(String[] args)
  {
    performLogin("jbn", true);
    performLogin("ugh//ighorhoir:;aiefhw@#$", false);
  }

  /*
   * Rule 00. Input Validation and Data Sanitization (IDS)
   * IDS03_J. Do not log unsanitized user input.
   * 
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
   */


  // BAD IMPLEMENTATION
  public static void performLogin(String userName, boolean loginSuccessful)
  {
    if (loginSuccessful)
    {
      //logger.severe("User login succeeded for: " + userName);
      System.out.println("User login succeeded for: " + userName);
    }
    else 
    {
      //logger.severe("User login failed for: " + userName);
      System.out.println("User login failed for: " + userName);
    }
  }
}
