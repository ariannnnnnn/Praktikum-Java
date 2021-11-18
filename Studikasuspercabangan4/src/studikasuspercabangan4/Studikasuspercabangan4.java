/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasuspercabangan4;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Studikasuspercabangan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pilih;
        Scanner input = new Scanner(System.in);
        System.out.print("pilih = ");
        pilih = input.nextLine();
    switch (pilih){       
        case "1":
            System.out.println("Alat olahraga");
            break;
            
        case "2":
            System.out.println("Alat Elektronik");
            break;
         
        case "3":
            System.out.println("Alat Masak");
            break;
            
        default:
            System.out.println("Anda salah memasukan kode");
            break;
    } 
    }
    
}
