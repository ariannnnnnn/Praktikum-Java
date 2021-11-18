/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luassegitiga;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class LuasSegitiga {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double a,t,luas;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukan Alas =");
    a = scan.nextDouble();
    System.out.print("Masukan tinggi =");
    t = scan.nextDouble();
    luas = 0.5 * a * t;
    System.out.println("Luas segitiga =" + luas);
    
    }
    
}
