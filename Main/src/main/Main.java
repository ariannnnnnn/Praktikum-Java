/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Toko,TV,Kipasangin;
        Toko toko = new Toko();
        toko.Display();
        System.out.println("[Smartphone]    [TV]    [Kipasangin]");
        Scanner masukan = new Scanner (System.in);
        System.out.print("angka 1-3     : ");

        int bilangan = masukan.nextInt();
        switch (bilangan) {
            case 1 : System.out.println(">>>>>>>> Smartphone");
                    SmartPhone hp=new SmartPhone();
               
                    hp.setJumlahkamera(6);
                    hp.setHarga(30000000);
                    hp.setMerk("mendingxiaomi");
                    hp.setTotal(3000000);
                    System.out.println("Jumlah kamera = "+hp.getJumlahkamera());
                    System.out.println("Harga         = Rp"+hp.getHarga());
                    System.out.println("Merk          = "+hp.getMerk());
                    System.out.println("Total         = Rp"+hp.getTotal());
                    
                break;
            case 2 : System.out.println(">>>>>>>> TV");
                    TV gambar=new TV();
               
                    gambar.setJenis("LED");
                    gambar.setHarga(30000000);
                    gambar.setMerk("mendingxiaomi");
                    gambar.setTotal(30000000);
                    System.out.println("Jenis         = "+gambar.getJenis());
                    System.out.println("Harga         = Rp"+gambar.getHarga());
                    System.out.println("Merk          = "+gambar.getMerk());
                    System.out.println("Total         = Rp"+gambar.getTotal());
                    
                break;
            case 3 : System.out.println(">>>>>>>>    Kipas Angin");
                    KipasAngin KAI=new KipasAngin();
               
                    KAI.setUkuran("Gantung");
                    KAI.setHarga(300000);
                    KAI.setMerk("Kosmos");
                    KAI.setTotal(300000);
                    System.out.println("Jenis         = "+KAI.getUkuran());
                    System.out.println("Harga         = Rp"+KAI.getHarga());
                    System.out.println("Merk          = "+KAI.getMerk());
                    System.out.println("Total         = Rp"+KAI.getTotal());
                    
                break;
            default:
                int i;
                for (i=0; i<=5 ;i++)
        {
                System.out.println("Error!Silahkan gunakan angka yang sudah disediakan! :)");
        }
                break;
           
        }
    }
}
