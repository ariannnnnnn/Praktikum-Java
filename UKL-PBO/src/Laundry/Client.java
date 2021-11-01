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
//implementasi inherintace
public class Client extends Orang {

    //class Client hanya menambahkan attribut idClient dan saldo
    // untuk nama, alamat, dan telepon mewariskan dari claas Person
    private int idClient;
    private double saldo;

    public Client(int idClient, String nama, String alamat, String telepon, double saldo) {
        super(nama, alamat, telepon); // pemanggilan parameter pada constructor Orang
        this.idClient = idClient;
        this.saldo = saldo;
    }

    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idClient"
    public int getIdClient() {
        return idClient;
    }

    // implementasi enkapsulasi dengan pembuatan method utk mengakses data private "saldo"
    public double getSaldo() {
        return saldo;
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

    // method untuk menguragi saldo dari client */
    public void kurangiSaldo(double jumlah) {
        this.saldo -= jumlah;
    }

}