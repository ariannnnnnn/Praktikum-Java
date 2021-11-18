/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputan;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Inputan {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a,b;
        System.out.print("Nilai a : ");
        a = masukan.nextInt();
        System.out.print("Nilai b : ");
        b = masukan.nextInt();
        System.out.println();
        System.out.println("Nilai variable yang ada diprogram : ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    
}
