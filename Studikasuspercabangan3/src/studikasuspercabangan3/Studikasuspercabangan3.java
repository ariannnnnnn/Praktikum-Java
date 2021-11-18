/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasuspercabangan3;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Studikasuspercabangan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    }else if (total > 200000){
            komisi = total * 0.15+20000;
            System.out.println("Komisi anda sebesar = Rp"+komisi);
    }else if (total == 200000);
            komisi = total *0.10+10000;
            System.out.println("Komisi anda sebesar = Rp"+komisi);
    }
}
