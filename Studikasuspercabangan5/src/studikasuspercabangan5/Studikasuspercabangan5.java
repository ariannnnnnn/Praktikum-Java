/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasuspercabangan5;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Studikasuspercabangan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int nilai;
        Scanner input = new Scanner(System.in);
        System.out.println("><><><><Nilai Siswa><><><><");
        System.out.print("Nama =");
        nama = input.nextLine();
        System.out.print("Nilai =");
        nilai = input.nextInt();
        
        if (nilai >= 90){
            System.out.println("Grade A");
         
        }else if (nilai <= 89){
            System.out.println("Grade B");
            
        }else if (nilai > 70){
            System.out.println("Grade B");
        }else if (nilai < 70){
            System.out.println("Grade F");
        }
    }
    
}
