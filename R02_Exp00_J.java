/******************************************************************************
 *  Compilation:  javac R02_Exp00_J.java
 *  Execution:    java R02_Exp00_J
 *
 *  Calls function deleteFile().
 ******************************************************************************/

import java.lang.*;
import java.io.*;

public class R02_Exp00_J
{
  public static void main(String[] args)
  {
    deleteFile();
  }

  /*
   * Rule 02. Expressions (EXP)
   * EXP00_J. Do not ignore values returned by methods.
   * 
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
   */


  // BAD IMPLEMENTATION
  public static void deleteFile()
  {
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    someFile.delete();
  }
}
