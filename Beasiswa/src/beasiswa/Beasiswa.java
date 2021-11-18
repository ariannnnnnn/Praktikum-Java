/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beasiswa;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Beasiswa {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukan nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.println("Masukan nilai bahasa inggris");
        int bing = masukan.nextInt();
        if ((TPA > 85)&&(bing > 80)){
            System.out.println("Siswa mendapat beasiswa");
        }else{
            System.out.println("Siswa gagal mendapat beasiswa ");
        }
        
    }
    
}
