/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Function {

    /**
     * @param args the command line arguments
     */ 
static int s, volume;  
    static Scanner inputan = new Scanner(System.in);  
  
    static int volumekubus(int sisi) {  
    int volume = sisi * sisi * sisi;  
    return volume;  
    }  
  
    static void input() {  
    System.out.print("Sisi  = ");  
    s = inputan.nextInt();  
    }  
  
    public static void main(String[] args) {  
        System.out.println("VOLUME KUBUS");  
        input();  
        System.out.println("V = " + volumekubus(s)); 
    }
}