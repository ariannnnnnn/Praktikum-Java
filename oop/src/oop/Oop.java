/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Arian
 */
public class Oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nilaisiswa pelajar = new nilaisiswa();
        
        pelajar.nama="Anya";
        pelajar.nilai=70;
        
        pelajar.cetaknilai();
        if(pelajar.lulus()){
            System.out.println("Selamat anda lulus");
        }
        if(pelajar.tidaklulus()){
            System.out.println("Selamat anda tidak lulus");
        }
    }
    
}
