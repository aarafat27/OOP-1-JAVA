package oop1;
import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
      
    
        System.out.println("::::::::::::CALCULATOR::::::::::::");
        System.out.print("What do you want?\n[1]Addition\n[2]Subtraction\n[3]Multiplication\n[4]Division\n");
        System.out.print("[5]Square\n[6]Cube\n[7]X to the Power Y\nEnter :");
        Scanner input = new Scanner(System.in);
        int key=input.nextInt();
        switch (key) {
            case 1:
                Addition A1=new Addition();
                String temp= A1.Solution();
                BufferWriteClass BW1= new BufferWriteClass();
                BW1.BufferMethod(temp);
                BufferReadClass BR1=new BufferReadClass();
                BR1.Result();
                break;
            case 2:
                
                Subtraction S1=new Subtraction();
                String temp1= S1.Solution();
                BufferWriteClass BW2= new BufferWriteClass();
                BW2.BufferMethod(temp1);
                BufferReadClass BR2=new BufferReadClass();
                BR2.Result();
                break;
                
            case 3:
                
                Multiplication M1= new Multiplication();
                String temp2= M1.Solution();
                BufferWriteClass BW3= new BufferWriteClass();
                BW3.BufferMethod(temp2);
                BufferReadClass BR3=new BufferReadClass();
                BR3.Result();
                break;
                
            case 4:
                Division D1= new Division();
                String temp3= D1.Solution();
                BufferWriteClass BW4= new BufferWriteClass();
                BW4.BufferMethod(temp3);
                BufferReadClass BR4=new BufferReadClass();
                BR4.Result();
                break;
            case 5:
                
                Square SQ1=new Square();
                String temp4= SQ1.Solution();
                BufferWriteClass BW5= new BufferWriteClass();
                BW5.BufferMethod(temp4);
                BufferReadClass BR5=new BufferReadClass();
                BR5.Result();
                break;
                
             case 6:
                
                Cube C1=new Cube();
                String temp5= C1.Solution();
                BufferWriteClass BW6= new BufferWriteClass();
                BW6.BufferMethod(temp5);
                BufferReadClass BR6=new BufferReadClass();
                BR6.Result();
                break;
                
            case 7:
                XToThePowerY X1=new XToThePowerY();
                String temp6= X1.Solution();
                BufferWriteClass BW7= new BufferWriteClass();
                BW7.BufferMethod(temp6);
                BufferReadClass BR7=new BufferReadClass();
                BR7.Result();
                break;
            default:
                System.out.println("Wrong Selection !\nTry Again!");
                break;
        }
       
    }
}
