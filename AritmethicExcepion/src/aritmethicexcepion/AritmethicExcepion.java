/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmethicexcepion;

/**
 *
 * @author Arian
 */
public class AritmethicExcepion {

   public static void main(String[] args) {
      int c = 0;
      try {
        c = 57/0;
      } catch (ArithmeticException a) {
         a.printStackTrace();
         System.out.println("c : "+c);
      }

   }
}