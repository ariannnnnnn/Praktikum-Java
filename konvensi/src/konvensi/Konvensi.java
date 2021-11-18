/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konvensi;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Konvensi {
    public static void main(String[] args) {
        int c = 78;
        
        Scanner masukan = new Scanner (System.in);
        System.out.println("Silahkan dipilih dipilih >>>>>>1.Reamur<>2.Farenheit<>3.Kelvin");
        int hasil = masukan.nextInt();
        if (hasil== 1){
            double remur= 0.8 * c;
            System.out.println("78C = "+remur+" R ");
        }else if (hasil == 2){
            double feren= (0.095 * c)+32;
            System.out.println("78C = "+feren+" F ");
        }else if (hasil == 3){
            double kel= 273.15 * c;
            System.out.println("78C = "+kel+" K ");
        }else{
            System.out.println("Angka yang anda masukan salah silahkan coba lain kali");
        }
    }
    
}
