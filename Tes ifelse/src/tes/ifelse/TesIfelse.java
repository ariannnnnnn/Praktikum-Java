/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.ifelse;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class TesIfelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double komisi, hargabarang, jumlahbarang, total;
        Scanner input = new Scanner(System.in); 
        System.out.println("<<Komisi>>");
        System.out.print("Harga barang = ");
        hargabarang = input.nextDouble();
        System.out.print("Jumlah barang = ");
        jumlahbarang = input.nextInt();
        total = jumlahbarang*hargabarang;
        //if
        if (total > 500000){
            komisi = total * 0.20+30000;
            System.out.println("Komisi anda sebesar = Rp"+komisi);

    }   
}
