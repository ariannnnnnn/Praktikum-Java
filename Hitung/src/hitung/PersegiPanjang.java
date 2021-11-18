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
public class PersegiPanjang extends Bangundatar{
    float panjang, lebar;
    
    public void luas(){
        float luas=panjang*lebar;
        System.out.println("Luas Persegi panjang = " + luas);
    }
    
    public void keliling(){
        float keliling=2*(panjang+lebar);
        System.out.println("Keliling Persegi panjang = " + keliling);
    }
    
}
