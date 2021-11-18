/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

/**
 *
 * @author Arian
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int harga = 250000;
    String[] data={"nama", "kelas", "absen", "sekolah","pass account"};
        System.out.println("Harga laptop Rp"+harga);
        System.out.println("<><>Data Laptop");
    for (int i = 0; i < data.length; i++) {
        System.out.println(">>>"+i+": " + data[i]);
    }
    
    
    
    }
    
}
