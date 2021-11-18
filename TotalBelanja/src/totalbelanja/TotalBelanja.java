/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalbelanja;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class TotalBelanja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,d,Harga,totalBelanjaA,totalBelanjaB,diskon;
        System.out.println("Masukan jumlah barang ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah barang A yang ingin dibeli ");
        a = scan.nextInt();
        System.out.print("Masukan jumlah barang B yang ingin dibeli ");
        b = scan.nextInt();
        System.out.print("Masukan jumlah barang C yang ingin dibeli ");
        c = scan.nextInt();
        System.out.print("Masukan jumlah barang D yang ingin dibeli ");
        d = scan.nextInt();
        
        totalBelanjaA = a + b + c + d;
        System.out.println("Total belanja yang dibeli "+totalBelanjaA);
        Harga = totalBelanjaA * 5000;
        System.out.println("Harga barang yang dibeli "+Harga);
        
        if(Harga>100000){
        System.out.println("Selamat anda mendapatkan diskon");
        } else{
        System.out.println("Jika anda menambah barang belanjaan anda,Maka dapatkanlah diskon");
        
        
        
    }   
        
                
    }
    
}
