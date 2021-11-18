/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatester;

/**
 *
 * @author Arian
 */
public class JavaTester{
   public void checkAge(int age){
      if(age<18)
         throw new ArithmeticException("Not Eligible for voting");
      else
         System.out.println("Eligible for voting");
   }
   public static void main(String args[]){
      JavaTester obj = new JavaTester();
      obj.checkAge(13);
      System.out.println("End Of Program");
   }
}