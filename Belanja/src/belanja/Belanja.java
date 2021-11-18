/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belanja;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Belanja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a,b;
    double Hasil;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukan angaka pertama ");
    a = scan.nextInt();
    System.out.print("Masukan angka kedua ");
    b = scan.nextInt();
    Hasil = a%b;
    System.out.println("Hasil modulus ="+ Hasil);
    
    }
    
}
