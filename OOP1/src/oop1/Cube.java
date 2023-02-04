package oop1;
import java.util.Scanner;

public class Cube implements InterfaceClass {

    @Override
    public String Solution() 
    {
      String str1 =null;
      System.out.println("::::::Cube:::::::");
      int count=0;
      do
      {
        try{
             Scanner input=new Scanner (System.in);
             System.out.print("Enter Base:");
             double digit=input.nextDouble();
             double result=digit*digit*digit;
             str1 = Double.toString(result); 
             count=1;
            }
        catch(Exception e)
           {
             System.out.println("Exception :"+e);
             System.out.println("Try again!");
            }
       }
      while(count==0);
          
      return str1;
    }
}
