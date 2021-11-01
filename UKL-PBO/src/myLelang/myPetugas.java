/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myLelang;

/**
 *
 * @author Arian
 */
import Lelang.Barang;
import Lelang.User;
import java.util.ArrayList;

public class myPetugas extends myUser{

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public void doYourJob(Barang barang){
        System.out.print("Nama Barang : ");
        barang.addNamaBarang();
        System.out.print("Harga Awal Barang : ");
        barang.addHargaAwal();
        barang.setStatus(true);
    }

    public myPetugas(String nama, String alamat, String telp){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telp);
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String telp) {
        this.telepon.add(telp);
    }

    @Override
    public String getNama(int ID) {
        return namaPetugas.get(ID);
    }

    @Override
    public String getAlamat(int ID) {
        return alamat.get(ID);
    }

    @Override
    public String getTelepon(int ID) {
        return alamat.get(ID);
    }

    void doYourJob(myBarang barangLelang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}