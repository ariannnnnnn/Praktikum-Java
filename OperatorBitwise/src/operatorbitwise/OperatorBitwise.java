/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorbitwise;

/**
 *
 * @author Arian
 */
public class OperatorBitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 60;
        int b = 13;
        int c = 0;
        
        c = a & b;
        System.out.println("a & b ="+ c );
        
        c = a | b;       
        System.out.println("a | b ="+ c);
        
        c = a ^ b;
        System.out.println("a ^ b ="+ c);
        
        c = ~a;
        System.out.println("~a ="+ c);
        
        c = a<<2;
        System.out.println("a<<2 ="+ c);
        
        c = a >> 2;     
        System.out.println("a >> 2 ="+ c);
        
        c = a >>> 2;
        System.out.println("a >>> 2 ="+ c);
        
        
       
        
            
  }
}
   
