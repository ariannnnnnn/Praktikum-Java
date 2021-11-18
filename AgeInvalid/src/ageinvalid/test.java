/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageinvalid;

/**
 *
 * @author Arian
 */
public class test {
        static void validate(int age)throws AgeInvalid{  
        if(age<18)  
         throw new AgeInvalid ("not valid");  
        else  
         System.out.println("welcome to vote");  
      }  
      public static void main(String args[]){  
        try { 
        validate(13);
        }
        catch(Exception i){
         System.out.println("Exception aktif" + i);  
        }
        System.out.println("rest ");
        }
}


