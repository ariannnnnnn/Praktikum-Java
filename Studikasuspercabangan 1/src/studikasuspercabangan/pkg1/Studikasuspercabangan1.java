/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasuspercabangan.pkg1;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Studikasuspercabangan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

String namabarang;
int harga,jumlah,total;
Scanner scan = new Scanner(System.in);
System.out.println("<<<Pembelian Barang>>>");
System.out.println("<<<Harga telur = Rp25.000>>>");
System.out.println("<<<<<Jadi berapa telur yang anda butuhkan???>>>>>");
System.out.print("<<<<<Saya ingin membeli telur sebanyak ");
jumlah = scan.nextInt();
System.out.println("Baik,jadi jumlah yang ada beli sebesar "+jumlah);
total = (int) (jumlah * 25000);
System.out.println("Total yang harus anda bayar sebesar Rp "+ total);

double l=50000;
if (l<50000);
System.out.println("Maaf anda tidak mendapatkan potongan");

    }
    
}
