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
public class jenisLaundry {

    private int idJenisLaundry, durasi;
    private String jenisLaundry;
    private double harga;

    public jenisLaundry(int idJenisLaundry, String jenisLaundry, double harga, int durasi) {
        this.idJenisLaundry = idJenisLaundry;
        this.durasi = durasi;
        this.jenisLaundry = jenisLaundry;
        this.harga = harga;
    }

    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idJenisLaundry"
    public int getIdJenisLaundry() {
        return idJenisLaundry;
    }

    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "durasi"
    public int getDurasi() {
        return durasi;
    }

    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "jenisLaundry"
    public String getJenisLaundry() {
        return jenisLaundry;
    }

    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "harga"
    public double getHarga() {
        return harga;
    }

}