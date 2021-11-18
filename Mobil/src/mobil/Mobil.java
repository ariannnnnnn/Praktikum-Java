/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author Arian
 */
class Mobil extends Bagasi
{
    //  Variable Mobil
    static String warna_mobil = "Merah";
    protected static String merk = "BMW";
     
    static void panggilMobil()
    {
        String warna_bagasi = null;
    //  Panggil Warna Bagasi di class Mobil atau Child
        System.out.println("[dipanggil dari mobil]Warna Bagasi   : "+warna_bagasi);
        String panjang = null;
         
        //  Panggil panjang Bagasi di class Mobil atau Child
        System.out.println("[dipanggil dari mobil]Panjang Bagasi : "+panjang);
         
        //  Panggil lebar Bagasi di class Mobil atau Child
        //  Syntax di bawah ini error
        //  Karena, variable lebar bersifat private.
        //  Private berarti, hanya bisa diakses di class itu sendiri dan tidak bisa dipanggil di class lain.
    //  System.out.println("Lebar Bagasi   : "+lebar);     
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
