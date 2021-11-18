/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Arian
 */
public class KipasAngin extends Toko{
    String ukuran;
    public void setHarga(int harga){
        super.harga3=harga;
    }
    public void setTotal(int total){
        super.total3=total;
    }
    public void setMerk(String merk){
        super.merk3=merk;
    }
    public void setUkuran(String ukuran){
        this.ukuran=ukuran;
    }
    public int getHarga(){
        return harga3;
    }
    public int getTotal(){
        return total3;
    }
    public String getMerk(){
        return merk3;
    }
    public String getUkuran(){
        return ukuran;
    }
    public void display(){
        System.out.println("    ");
        System.out.println(">>>    SmartPhone  <<<");
    }
}


