/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi3;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Seleksi3 {

    /**
     * @param args the command line arguments
     */

    static int hitung(int nilai){
        int bayar=0;
        nilai=nilai-10;
        if(nilai>10){
            bayar=bayar+30000;
            nilai=nilai-10;
        }else{
            bayar=bayar+3000*nilai;
            nilai=0;
    }
        if(nilai>10){
            bayar=bayar+40000;
            nilai=nilai-10;
        }else{
            bayar=bayar+4000*nilai;
            nilai=0;
        }
            if(nilai>10){
            bayar=bayar+50000;
            nilai=nilai-10;
        }else{
            bayar=bayar+5000*nilai;
            nilai=0;
        }
            if(nilai>10){
            bayar=bayar+60000;
            nilai=nilai-10;
        }else{
            bayar=bayar+6000*nilai;
            nilai=0;
        }
        if(nilai>10){
            bayar=bayar+5000*nilai;
        }
        return bayar;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int id[]={1,2,3,4};
        String namaPelanggan[]={"Mira", "Nina", "Oemar", "Pena"};
        String namaMasuk[]={"SBMPTN", "SNMPTN", "Mandiri", "SBMPTN"};
        String namaRumah[]={"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        Scanner object = new Scanner(System.in);
        System.out.println("Masukan ID Pelanggan");
        
        String idin=object.nextLine();
        int iid=Integer.valueOf(idin);
        System.out.println("Masukan jumlah tagihan");
        String tagih = object.nextLine();
        int itagih = Integer.valueOf(tagih);
        
        if(itagih<450){
            itagih=30000;
        }
        else {
            itagih=hitung(itagih);
        }
        itagih=itagih+13000;
        System.out.println("Print out tagihan");
        System.out.println("ID\t:"+idin);
        System.out.println("Nama\t:"+namaPelanggan[iid-1]);
        System.out.println("Alamat\t:"+namaMasuk[iid-1]);
        System.out.println("Alamat\t:"+namaRumah[iid-1]);
        System.out.println("Tagihan\t:Rp."+itagih+",.");
        }
    }
    