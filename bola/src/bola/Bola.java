/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Bola {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Menghitung luas permukaan bola>>>>>");
        System.out.print("Masukan jari jari : ");
        int r = masukan.nextInt();
        int luas;
        luas = (4 * 22 % 7 *(r * r));
        System.out.println("Luas permukaan bola adalah"+luas);
    }
    
}
