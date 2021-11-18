/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas.lingkaran;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class LuasLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r, luas, phie = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan panjang jari jari lingkaran =");
        r = scan.nextDouble();
        double phi;
        phi = 0;
        luas = phie * r * r;
        System.out.println("Luas Lingkaran adalah "+luas);
        
    }
    
}
