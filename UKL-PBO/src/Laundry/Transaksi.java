/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

/**
 *
 * @author Arian
 */
public class Transaksi {

    jenisLaundry selectedLaundry;
    double jumlah;
    double total;

    public Transaksi(jenisLaundry selectedLaundry, double jumlah, int qty) {
        this.selectedLaundry = selectedLaundry;
        this.jumlah = jumlah;
        this.total = selectedLaundry.getHarga() * jumlah;
    }

    Transaksi(jenisLaundry selectedLaundry, int qty) {
    }

}