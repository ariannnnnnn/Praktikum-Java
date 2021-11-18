/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganprima;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class BilanganPrima {
    public static void main(String[] args) {
        System.out.println(">>>>>MENAMPILKAN BILANGAN PRIMER<<<<<");
        Scanner nilai = new Scanner (System.in);
        System.out.print("Nilai Akhir Bilangan Primer = ");
        int ab= nilai.nextInt();

  for (int z=2;z<=ab;z++){
  int mod=1;
  for (int x=2;x<z;x++){
  if(z%x==0){
  mod=0;}
  }if(mod==1){
        System.out.println(">>>>>> "+ z);
  }
  }
        System.out.println(); 
    }
}
    
