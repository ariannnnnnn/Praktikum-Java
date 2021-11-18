/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaspersegipanjang;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class LuasPersegiPanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

   int p;
   int l;
   double luas;

   Scanner scan = new Scanner(System.in);
   
   System.out.print("Masukan Panjang: ");
   p = scan.nextInt();
   System.out.print("Masukan Lebar: ");
   l = scan.nextInt();
 
   luas = (p * l);
   System.out.println("Luas Segi Panjang = " +luas);
        // TODO code application logic here
    }
    
}
