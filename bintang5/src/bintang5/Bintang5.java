/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang5;

/**
 *
 * @author Arian
 */
public class Bintang5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a=5;
    for(int b=1;b<=a;b++){
        for(int c=4;c>=b;c--){
            System.out.print("*");
        }
        for(int d=1;d<=b;d++){
            System.out.println("*");
        }
    }
        System.out.println();
    }
    
}
