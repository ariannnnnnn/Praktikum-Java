/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatoraritmatika;

/**
 *
 * @author Arian
 */
public class Operatoraritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int mawar=10, melati=2, anggrek=5;
        double harga;
        harga = 4500.5;
        double total,bayar;
        
        melati+=2;
        total=mawar+melati+anggrek;
        bayar=total*harga;
        boolean name;
        name = mawar>melati;
        
        System.out.println("jumlah barang yang dibeli ="+mawar+"+"+melati+"+"+anggrek+"="+total);
        System.out.println("total yang dibayar ="+bayar);
        System.out.println("Bunga mawar>Bunga melati =" + name);
        
        
                
    }
    

    }
    

