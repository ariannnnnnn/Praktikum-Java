/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasbalok;

/**
 *
 * @author Arian
 */
public class LuasBalok {
    public static void main(String[] args) {
        int p=5;
        int l=10;
        int t=5;
        System.out.println("panjang :"+p);
        System.out.println("lebar :"+l);
        System.out.println("tinggi :"+t);
        System.out.println("=====================");
        System.out.println("Menghitung Luas permukaan balok");
        System.out.println("=====================");
        System.out.println("Luas permukaan balok ="+ ((2*p*l)+(2*p*t)+(2*t*l)));
    }
    
}
