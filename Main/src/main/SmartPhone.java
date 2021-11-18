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
public class SmartPhone extends Toko{
    int Jumlahkamera;
 
    public void setHarga(int harga){
        super.harga1=2000000;
    }
    public void setTotal(int total){
        super.total1=2000000;
    }
    public void setMerk(String merk){
        this.merk1=merk;
    }
    public void setJumlahkamera(int Jumlahkamera){
        this.Jumlahkamera=Jumlahkamera;
    }
    public int getHarga(){
        return harga1;
    }
    public int getTotal(){
        return total1;
    }
    public String getMerk(){
        return merk1;
    }
    public int getJumlahkamera(){
        return Jumlahkamera;
    }
    public void getDisplay(){
    }
    
}
