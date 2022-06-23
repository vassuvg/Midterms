/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        ArithmeticBase r= new ArithmeticBase();
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int input1 = in.nextInt();
        System.out.print("Enter the second number : ");
        int input2 = in.nextInt();
        double result = r.calculate(input1,input2);
        System.out.println("result :" +result); 
    
    }
}
