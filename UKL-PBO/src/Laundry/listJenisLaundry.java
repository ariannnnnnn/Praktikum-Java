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
public class listJenisLaundry {
    // pemeberian nilai pada array "list" dengan tipe class jenisLaundry

    jenisLaundry[] list = {
        new jenisLaundry(1, "Pakaian", 5000, 1),
        new jenisLaundry(2, "Selimut", 10000, 1),
        new jenisLaundry(3, "Boneka/Bantal", 20000, 2),};

    // method untuk menampilkan data list jenis landry
    public void viewJenisLaundry() {
        System.out.println("--- List Laundry ---");
        System.out.println("ID \t Jenis \t Harga \t Durasi");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdJenisLaundry() + " \t "
                    + list[i].getJenisLaundry() + " \t "
                    + list[i].getHarga() + " \t "
                    + list[i].getDurasi());
        }
    }

    public int cariJenisLaundry(int id) {
        int foundIndex = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < list.length; i++) {

            //jika id yang dicari ditemukan
            if (list[i].getIdJenisLaundry() == id) {
                foundIndex = i; //menyimpan nilai index dari data yg ditemukan
            }
        }
        return foundIndex;
    }

}
