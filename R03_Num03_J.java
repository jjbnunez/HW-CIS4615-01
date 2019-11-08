/******************************************************************************
 *  Compilation:  javac R03_Num03_J.java
 *  Execution:    java R03_Num03_J
 *
 *  Calls function getInteger(is) twice to demonstrate differences in
 *  signed and unsigned read behavior.
 ******************************************************************************/

import java.lang.*;
import java.io.*;

public class R03_Num03_J
{
  public static void main(String[] args)
  {

    try ( DataOutputStream ofp = new DataOutputStream(new FileOutputStream("file.txt")) ) 
    {
      ofp.writeInt(1997);
      ofp.writeInt(Integer.parseInt("-220000000"));
    } 
    catch(Exception e) 
    { 
      System.out.println("Cannot open the output file."); 
      return;
    }

    try ( DataInputStream ifp = new DataInputStream(new FileInputStream("file.txt")) ) 
    { 
       System.out.println("Result1: " + getInteger(ifp));
       System.out.println("Result2: " + getInteger(ifp));
    } 
    catch(Exception e) 
    { 
      System.out.println("Cannot open the input file."); 
      return; 
    }
  }

  /*
   * Rule 03. Numeric Types and Operations (NUM)
   * NUM03_J. Use integer types that can fully represent the possible range of unsigned data.
   * 
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
   */


  // GOOD IMPLEMENTATION
  public static long getInteger(DataInputStream is) throws IOException
  {
    return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits.
  }
}
