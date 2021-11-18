/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi.pkg1;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Fungsi1 {
    public static void selamat(int a,int b){
        System.out.println("Perkenalkan nama saya Ahnan sebagai ketua pelaksana lomba");
        System.out.println("<<<<<>>>>>");
    }
    
    public static void main(String[] args) {
       int bill1,bill2;
       Scanner input = new Scanner (System.in);
        System.out.print(">>>>>Nilai pertama = ");
        bill1=input.nextInt();
        System.out.print(">>>>>Nilai kedua = ");
        bill2=input.nextInt();
    if (bill1 > bill2){
            System.out.println("Pemenang Lomba adalah Pemilik nilai Pertama");
    }else if (bill2 > bill1){
            System.out.println("Pemenang Lomba adalah Pemilik nilai Kedua");
    }
        System.out.println("Selamat untuk pemenang tetapi jangan sedih bagi yang kurang beruntung");
    
}
    }
    

