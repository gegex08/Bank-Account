/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttest;

/**
 *
 * @author geneivaocampo
 */
public class Account
{   
   private double balance; // instance variable stores balance

   // constructor  
   public Account( double initialBalance )
   {
      // validate that initialBalance is greater than 0.0; 
      // if it is not, balance is initialized to default value 0.0
      if ( initialBalance > 0.0 ) 
         balance = initialBalance; 
      else{
          balance = 0;
      }
   } // end Account constructor

   // credit (add) an amount to the account
   public void credit( double amount )
   {      
      balance += amount; // add amount to balance 
   } // end method credit
   
   // debit (subtract) an amount to the account
   public void debit( double amount )
   {  
      if (balance >= amount){
      balance -= amount; // subtracts amount to balance 
      }
      else{
          System.out.println("Balance is more than the account holds");
      }
   } // end method credit

   // return the account balance
   public double getBalance()
   {
      return balance; // gives value of balance to calling method
   } // end method getBalance
} // end class Account
