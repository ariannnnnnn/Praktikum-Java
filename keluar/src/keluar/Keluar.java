/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keluar;

/**
 *
 * @author Arian
 */
public class Keluar {
    public static void main(String[] args) {
        gaji2 keluar = new gaji2();
        gaji keluargaji = new gaji();
        keluar.setNamakaryawan("Arian");
        keluar.setGender("Laki-Laki");
        keluar.cetak();
        keluargaji.setnomor(777777);
        keluargaji.cetak();
        System.out.println(keluargaji.getnomorpegawai());
        keluargaji.keterangan();
        keluargaji.gaji(200000,6);
        keluargaji.gaji(200000,6,2);
        
        gaji22 keluarke2 = new gaji22();
        gajii keluargajike2 = new gajii();
        keluarke2.setNamakaryawann("diah");
        keluarke2.setGenderr("Perempuan");
        keluarke2.cetak();
        keluargajike2.setnomor(333333);
        keluargajike2.cetak();
        System.out.println(keluargajike2.getnomorpegawai());
        keluargajike2.keterangan();
        keluargajike2.gaji(200000,6);
        keluargajike2.gaji(200000,6,2);
    }
}

