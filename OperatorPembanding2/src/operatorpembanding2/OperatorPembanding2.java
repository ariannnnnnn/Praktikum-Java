/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorpembanding2;

/**
 *
 * @author Arian
 */
public class OperatorPembanding2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 8;
        int c = 12;
        int d = 5;
        
        boolean tes1 = a>b;
        boolean tes2 = b<c;
        boolean tes3 = (a*2) >= (b + c);
        boolean tes4 = (a/d) <= (c - a);
        boolean tes5 = (a-d) == d;
        boolean tes6 = (a-b) != (b - d);
        boolean tes7 = (a > 12);
        boolean tes8 = b <= 7;
        boolean tes9 = c == 10;
        boolean tes10 = d != 5;
        
        System.out.println("Tes Ke 1 = "+tes1);
        System.out.println("Tes Ke 2 = "+tes2);
        System.out.println("Tes Ke 3 = "+tes3);
        System.out.println("Tes Ke 4 = "+tes4);
        System.out.println("Tes Ke 5 = "+tes5);
        System.out.println("Tes Ke 6 = "+tes6);
        System.out.println("Tes Ke 7 = "+tes7);
        System.out.println("Tes Ke 8 = "+tes8);
        System.out.println("Tes Ke 9 = "+tes9);
        System.out.println("Tes Ke 10 = "+tes10);                                                                
                
    }
    
}
