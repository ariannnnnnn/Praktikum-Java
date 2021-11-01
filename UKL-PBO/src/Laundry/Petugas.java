/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

/**
 *
 * @author macbook
 */
public class Petugas extends Orang { //penggunaan inheritance
    // class Petugas hanya menambahkan attribut idPetugas dan jabatan
    // untuk nama, alamat, dan telepon mewariskan dari claas Person
    
    private int idPetugas;
    private String jabatan;

    public Petugas(int idPetugas, String nama, String alamat, String telepon, String jabatan) {
        super(nama, alamat, telepon); // pemanggilan parameter pada constructor Orang
        this.idPetugas = idPetugas;
        this.jabatan = jabatan;
    }
    
    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idPetugas"
    public int getIdPetugas() {
        return idPetugas;
    }
    
    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "jabatan"
    public String getJabatan() {
        return jabatan;
    }
    
    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "nama"
    public String getNama() {
        return nama;
    }
    
    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "alamat"
    public String getAlamat() {
        return alamat;
    }
    
    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "telepon"
    public String getTelepon() {
        return telepon;
    }
}