/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accounttest;

/**
 *
 * @author geneivaocampo
 */
import java.util.Scanner;

public class AccountTest
{
   // main method begins execution of Java application
   public static void main( String[] args ) 
   {
      Account account1 = new Account( 50.00 ); // create Account object
      Account account2 = new Account( -7.53 ); // create Account object

      // display initial balance of each object
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );
      
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );
      double depositAmount; // deposit amount read from user
      double withdrawlAmount;// withdrawl amount 

      System.out.println( "Enter deposit amount for account1: " ); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\nadding %.2f to account1 balance\n\n", 
         depositAmount );
      account1.credit( depositAmount ); // add to account1 balance

      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );

      System.out.print( "Enter deposit amount for account2: " ); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\nadding %.2f to account2 balance\n\n", 
         depositAmount );
      account2.credit( depositAmount ); // add to account2 balance

      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n", 
         account2.getBalance() );
      
      // ask user to withdrawl
      System.out.printf( "Enter the amount need to withdrawl for account1: ");//
      withdrawlAmount = input.nextDouble();
      System.out.printf("\nWithdrawn amount %.2f to account1 balance\n\n", 
              withdrawlAmount);
      account1.debit( depositAmount ); // withdrawl to account1 balance
      
      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n", 
         account2.getBalance() );
      
      // ask user to withdrawl
      System.out.printf( "Enter the amount need to withdrawl for account2: ");//
      withdrawlAmount = input.nextDouble();
      System.out.printf("\nWithdrawn amount %.2f to account1 balance\n\n", 
              withdrawlAmount);
      account2.debit( depositAmount ); // withdrawl to account1 balance
      
      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n", 
         account2.getBalance() );
      
   } // end main
} // end class AccountTest
