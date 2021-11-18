/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Arian
 */
public class Data {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5;
        for(int b =1;b<=a;b++){
            for(int c=4;c>=b;c--){
                System.out.println("*");
            }
            for(int d=1;d<=b;d++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
    
}
