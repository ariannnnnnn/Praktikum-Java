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
public class TV extends Toko{
    String jenis;
    public void setHarga(int harga){
        super.harga2=harga;
    }
    public void setTotal(int total){
        super.total2=total;
    }
    public void setMerk(String merk){
        super.merk2=merk;
    }
    public void setJenis(String jenis){
        this.jenis=jenis;
    }
    public int getHarga(){
        return harga2;
    }
    public int getTotal(){
        return total2;
    }
    public String getMerk(){
        return merk2;
    }
    public String getJenis(){
        return jenis;
    }
    public void display(){
        System.out.println("    ");
        System.out.println(">>>    TV  <<<");
        
    }
}


