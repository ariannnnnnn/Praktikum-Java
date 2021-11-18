/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi1;

import java.util.Scanner;

public class Seleksi1 {
    static int hitung(int nilai){
        int bayar=20000;
        nilai=nilai-10;
        //kedua
        if(nilai>10){
            bayar=bayar+30000;
            nilai=nilai-10;
        }else{
            bayar=bayar+3000*nilai;
            nilai=0;
    }
        //ketiga
        if(nilai>10){
            bayar=bayar+40000;
            nilai=nilai-10;
        }else{
            bayar=bayar+4000*nilai;
            nilai=0;
        }
       //keempat
            if(nilai>10){
            bayar=bayar+50000;
            nilai=nilai-10;
        }else{
            bayar=bayar+5000*nilai;
            nilai=0;
        }
            //kelima
            if(nilai>10){
            bayar=bayar+60000;
            nilai=nilai-10;
        }else{
            bayar=bayar+6000*nilai;
            nilai=0;
            }    
            //keenam
            if(nilai>10){
            bayar=bayar+70000;
            nilai=nilai-10;
        }else{
            bayar=bayar+7000*nilai;
            nilai=0;
        }
            //selanjutnya
        if(nilai>10){
            bayar=bayar+8000*nilai;
        }
        return bayar;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int id[]={1,2,3,4,5,6};
        String namaPelanggan[]={"Ali", "Budi", "Dani", "Edi", "Umar","Rudi"};
        Scanner object = new Scanner(System.in);
        System.out.println("Masukan ID Pelanggan");
        
        String idin=object.nextLine();
        int iid=Integer.valueOf(idin);
        System.out.println("Masukan jumlah tagihan");
        String tagih = object.nextLine();
        int itagih = Integer.valueOf(tagih);
        
        if(itagih<10){
            itagih=20000;
        }
        else {
            itagih=hitung(itagih);
        }
        itagih=itagih+10000;
        System.out.println("Print out tagihan");
        System.out.println("ID\t:"+idin);
        System.out.println("Nama\t:"+namaPelanggan[iid-1]);
        System.out.println("Tagihan\t:Rp."+itagih+",.");
        }
    }
    

