/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    int[] angka = new int[15];
    int kuadrad;
    for (int i = 0; i < angka.length; i++) {
            angka[i] = i + 1;
        }
    for (int i = 0; i < angka.length; i++) {
    if (angka[i] % 2 != 0) {
    kuadrad = angka[i] * angka[i];
                System.out.println(angka[i] + "^^^" + kuadrad);
            }
        }
    
    }
    
}
