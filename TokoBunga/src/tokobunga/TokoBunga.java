/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokobunga;

/**
 *
 * @author Arian
 */
public class TokoBunga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mawar=21 ,melati = 3 ,matahari = 5;
        double harga;
        harga = 4500.5;
        double total,bayar;
      
        total=mawar+melati+matahari;
        bayar=(mawar+melati+matahari) * 4500.5;        
        System.out.println("jumlah barang yang dibeli ="+ total);
        System.out.println("Harga =Rp "+ bayar);
                
        
    }
    
}
