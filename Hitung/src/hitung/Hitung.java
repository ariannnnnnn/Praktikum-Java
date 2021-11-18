/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

/**
 *
 * @author Arian
 */
public class Hitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bangundatar bangundatar=new Bangundatar();
        
        Persegi Persegi = new Persegi();
        Persegi.sisi=8;
        
        PersegiPanjang perjang =new PersegiPanjang();
        perjang.lebar=11;
        perjang.panjang=2;
        
        
       bangundatar.luas();
       bangundatar.keliling();
       
       Persegi.luas();
       Persegi.keliling();
       
       perjang.luas();
       perjang.keliling();
        
    }
    
}
