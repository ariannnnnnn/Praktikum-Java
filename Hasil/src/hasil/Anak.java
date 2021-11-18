/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasil;

/**
 *
 * @author Arian
 */
public class Anak extends Ayah{
    double max = 99.9;
    String nama;
    int umur = 17;
    
    public void setnama(String nama){
        this.nama=nama;
    }
    public void Cetak(){
        System.out.println("Anak ini memiliki sifat "+super.sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+umur+" tahun");
        System.out.println("dengan tinggi Badan "+super.Tinggibadan);
        super.hobbi();
    }
}

