/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwtest;

/**
 *
 * @author Arian
 */
public class ThrowTest {

      public void checkAge(int birthday){
      if(birthday<20)
         throw new ArithmeticException("Not Eligible for voting");
      else
         System.out.println("Eligible for voting");
   }
   public static void main(String args[]){
      ThrowTest object = new ThrowTest();
      object.checkAge(7);
      System.out.println("End Of Program");
   }
}
    