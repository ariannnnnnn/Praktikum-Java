/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasbiner;

/**
 *
 * @author Arian
 */
public class UASbiner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[]angka={1,10,11,100,101,110,111,1000,1001,1010};
        for(int i=0;i<angka.length;i++){
            System.out.println("Biner ke-"+i+"; " + angka[i]); 
        }
    }
    
}
