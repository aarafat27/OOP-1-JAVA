package oop1;
import java.util.Scanner;

public class Addition implements InterfaceClass{

    @Override
    public String Solution()
    {
       String str1 =null;
       System.out.println("::::::Addition:::::::");
       int count=0;
        do{
            try{
                 Scanner input=new Scanner (System.in);
                 System.out.print("Enter Number1:");
                 double num1=input.nextDouble();
                 System.out.print("Enter Nunmber2:");
                 double num2=input.nextDouble();
                 double result=num1+num2;
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
    
