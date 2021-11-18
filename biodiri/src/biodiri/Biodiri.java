/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodiri;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Biodiri {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Contoh keluaran : ");
        System.out.println(" ");
        System.out.print("Nama		:");
        int a1 = masukan.nextInt();
        System.out.print("NIS                 :");
        int a2 = masukan.nextInt();
        System.out.print("Tempat lahir	:");
        int a3 = masukan.nextInt();
        System.out.print("Tanggal lahir	:");
        int a4 = masukan.nextInt();
        System.out.print("Jenis Kelamin	:");
        int a5 = masukan.nextInt();
        System.out.print("Alamat di Malang    :");
        int a6 = masukan.nextInt();
        System.out.print("Motto Hidup         :");
        int a7 = masukan.nextInt();
    }
    
}
