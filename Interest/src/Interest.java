
// Raghav Krishna Ranganathan, AP CompSci P5 Peterson
// This program calculates interest. It takes input from user, prints out money predicted divided by interest increase rate each year for N years. (N is another input)


import java.util.Scanner;
public class Interest
{

    // main function  - runs Input with Scanner as a argument. (user input)
    public static void main(String args[])
    {
        Input(new Scanner(System.in));
    }



    
    
    // store user settings, run function to output results
    public static void Input(Scanner input)
    {
        // declare variables
        double intrst, dpst, invsmt;
        int years;
        
        // ask questions, store input as settings
        System.out.println("Enter your initial investment: ");
        invsmt = input.nextDouble();
        
        System.out.println("Enter your annual deposit: ");
        dpst = input.nextDouble();
        
        System.out.println("Enter number of Years: ");
        years = input.nextInt();
        
        System.out.println("Enter interest rate: ");
        intrst = input.nextDouble();
    
        // run function using settings user inputed
        SendOutput(years, intrst, dpst, invsmt);
    }



    // function outputs yearly interest prediction (take settings as parameters)
    public static void SendOutput(int years, double intrst, double dpst, double invsmt)
    {
        // declare variables
        double current_interest = intrst*10;
        double current_balance = invsmt;
        
        //output text (only printed once)
        System.out.println("Year\t Interest\t Deposit\t Balance");
        System.out.println("start\t\t\t\t\t " + current_balance);
        
        for (int i = 1; i<=years; i++) // loop N amount of times depending on years inputed
        {
            // math
            current_interest = DecimalRound(intrst/100 * current_balance); // set interest to OG rate * the current balance (round)
            current_balance = DecimalRound(current_balance + (current_interest + dpst)); // set balance to current balance + annual deposit + current interest (round)
            
            // output
            System.out.print(i + "\t ");
            System.out.print(current_interest + "\t\t ");
            System.out.print(dpst + "\t\t ");
            System.out.println(current_balance);
        }
    
    }



    // function converts number of decimals places to 2 (100s), for a double (floor division)
    public static double DecimalRound(double in)
    {
        return Math.floor(in * 100.0)/100.0;
    }



}