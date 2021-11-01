/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

/**
 *
 * @author Arian
 */
public class Uklpbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barang barang = new Barang();
        Member member = new Member();
        Transaksi transaksi = new Transaksi();
        Laporan lap = new Laporan();
        lap.laporan(barang);
        lap.laporan(member);
        transaksi.prosesTransaksi(member, transaksi, barang);
    }
    
}
