package oop1;
import java.util.Scanner;

public class XToThePowerY implements InterfaceClass {

    @Override
    public String Solution() 
    {
      String str1 =null;
      System.out.println(":::::::X to the Power Y:::::::");
      int count=0;
      do{
         try{
               Scanner input=new Scanner (System.in);
               System.out.print("Enter X:");
               double base=input.nextDouble();
               System.out.print("Enter Y:");
               double exponent=input.nextDouble();
               double result = 1;
               while(exponent !=0)
                {
                  result*=base;
                  --exponent;
                }
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
