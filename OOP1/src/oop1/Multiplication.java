package oop1;
import java.util.Scanner;

public class Multiplication implements InterfaceClass {

    @Override
    public String Solution() 
    {
      String str1 =null;
      System.out.println("::::::Multiplication:::::::");
      int count=0;
      do{
          try{
               Scanner input=new Scanner (System.in);
               System.out.print("Number1:");
               double digit1=input.nextDouble();
               System.out.print("Nunmber2:");
               double digit2=input.nextDouble();
               double result=digit1*digit2;
               str1 = Double.toString(result); 
               count=1;
              }
          catch(Exception e)
              {
               System.out.println("Exception :"+e);
               System.out.println("Try again");
              }
         }
      while(count==0);
          
      return str1;
    }
}
