/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchfinallytest;

/**
 *
 * @author Arian
 */
public class TryCatchFinallyTest {
    public static void main(String[] args) {
        // TODO code application logic here
      int c = 0;
      try {
        c = 57/0;
      } 
      catch (ArithmeticException a) {
         a.printStackTrace();
         System.out.println("c : "+c);
      }
      finally{
        System.out.println("kalimat di finally");
      }
      System.out.println("kalimat diluar blok try-catch-finally");
   }
}
