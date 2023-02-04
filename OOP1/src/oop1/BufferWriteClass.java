package oop1;
import java.io.*;

public class BufferWriteClass {
    
  public void BufferMethod(String r)
    {
        try
	 { 
            FileWriter file = new FileWriter("Calculator Output.txt"); 
            BufferedWriter bwObj = new BufferedWriter(file); 
	 
	    bwObj.write(r); 
	    bwObj.close(); 
	    
	 } 
	catch (IOException e) 
	  { 
	    e.printStackTrace(); 
	  } 
    }
}
