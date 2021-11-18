/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.method;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class BelajarMethod {

    /**
     * @param args the command line arguments
     */
  
    public static String method(){
    Scanner input = new Scanner (System.in);
    int Bilangan[] = new int[100];  
    int i=0; 
    
    System.out.println("Tolong patuhi protokol kesehatan yang berlaku");
    
    System.out.print("Jumlah siswa yang masuk hari ini: "); 
    int in = input.nextInt(); 
    
    if(in <= 20){ 
    System.out.println("Silahkan siswa masuk kedalam kelas dengan protokol kesehatan berlaku.");
    System.out.println("Jangan lupa jaga kesehatan agar selamat selalu!");
    
    }else if(in > 20){ 
    i = in - 20; 
    System.out.println("Sebanyak " + i + " Siswa silahkan dialokasikan ke kelas lain ! ");
    System.out.println("Siswa yang tidak dialokasikan silahkan masuk kedalam kelas dengan menjaga jarak!");
    System.out.println("Bagi siswa yang dialokasikan silahkan menuju ke kelas lain karena kelas ini sudah penuh!");
          
    }
    return null;
    }
public static void main(String[]args){ 
        method(); 
    }
    
}
