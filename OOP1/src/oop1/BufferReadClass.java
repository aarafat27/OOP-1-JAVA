package oop1;
import java.io.*;

public class BufferReadClass {
    
  void Result() throws IOException
   {
      File file = new File("C:\\Users\\USER\\OneDrive\\Documents\\NetBeansProjects\\OOP1\\Calculator Output.txt"); 
      BufferedReader br = new BufferedReader(new FileReader(file)); 
      String st; 
      
      while ((st = br.readLine()) != null) 
       {
         
         System.out.println("Result :"+st);
       }
  
      br.close();
    }
}
