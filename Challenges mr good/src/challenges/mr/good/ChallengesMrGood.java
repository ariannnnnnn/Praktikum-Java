/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges.mr.good;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class ChallengesMrGood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        double totalbarangA,totalbarangB,Harga;
        int a,b,c,d;
        System.out.println(">>>>>Selamat datang selamat berbelanja");
        Scanner scan = new Scanner(System.in);
        System.out.print(">>>>>Berapa jumlah bunga anggrek yang ingin dibeli?   = ");
        a = scan.nextInt();
        System.out.print(">>>>>Berapa jumlah bunga mawar yang ingin dibeli?     = ");
        b = scan.nextInt();
        System.out.print(">>>>>Berapa jumlah bunga melati yang ingin dibeli?    = ");
        c = scan.nextInt();
        System.out.print(">>>>>Berapa jumlah bunga matahari yang ingin dibeli?  = ");
        d = scan.nextInt();
        
        totalbarangA = a + b + c + d;
        System.out.println("<<<<<Total belanja yang dibeli = "+ totalbarangA);
        Harga = totalbarangA * 25000;
        System.out.println("<<<<<Harga barang yang dibeli ="+Harga);
        totalbarangB = Harga-(Harga * 0.1);
        
        if(Harga>100000){
            System.out.println(">>o<<Selamat anda mendapat diskon sebesar 10%   :)");
            System.out.println("<>o<>Anda hanya perlu membayar = "+totalbarangB);
        }else{
            System.out.println(">>o<<Maaf anda tidak mendapat diskon    :(");
        }
        System.out.println("    ");
        System.out.println("List barang yang anda beli akan keluar mohon perhatikan");
        System.out.println("<<<<<Total belanja yang dibeli = "+ totalbarangA);
        int i;
        for(i=1;i<=totalbarangA;i++){
            System.out.println("Bunga "+i);
        }
        
    }
    
}
