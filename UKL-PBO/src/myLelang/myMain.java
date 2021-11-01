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
import Lelang.Masyarakat;
import Lelang.Petugas;
import Lelang.bot;
import java.util.Scanner;
public class myMain {
    /*VAR*/
    static myMasyarakat masyarakat = new myMasyarakat();
    static myBarang barangLelang = new myBarang();
    static myPetugas petugas = new myPetugas("Anonimus", "jalan jalan", "08123425624");

    static Scanner userInput = new Scanner(System.in);
    static Scanner ulangi = new Scanner(System.in);

    static String jawab = "";
    static String user_input = "";
    static int Pilihan;

    static String loginName = "";
    static bot opponent = new bot();
    static int currentHarga;

    static int bot_harga;
    static int user_harga;
    /*VAR*/

    public static void main(String[] args) {
        login();
        askGeneratebarang();
        askAjukanBarang();
        System.out.println("Daftar barang");
        System.out.println();//jarak
        barangLelang.tampilBarang();

        System.out.print("barang mana yang ingin anda tawar ? : ");
        Pilihan = userInput.nextInt();
        if (Pilihan > barangLelang.idBarang.size() || !barangLelang.getStatus(Pilihan)){
            System.out.println("nomor barang tidak valid");
        }else{
            System.out.println("Barang : " + barangLelang.getNamaBarang(Pilihan));
            System.out.println("harga awal : " + barangLelang.getHargaAwal(Pilihan));
            System.out.println("Status : " + barangLelang.getStatus(Pilihan));
            barangLelang.addPenawar(masyarakat.getIdMasyarakat(masyarakat.getIndexFromName(loginName)));
            barangLelang.overrideHargaTawar();
            barangLelang.addHargaTawar(Integer.parseInt(barangLelang.getHargaAwal(Pilihan)));

            lelangStart();
        }
        pemenang();
    }

    static boolean UserAnswerIsYes(String input){
        return input.equalsIgnoreCase("y");
    }

    static void login(){
        System.out.println("++ LOGIN ++");
        System.out.print("Nama : ");
        String nama = userInput.nextLine();
        loginName = nama;
        System.out.print("Alamat : ");
        String alamat = userInput.nextLine();
        System.out.print("telp : ");
        String telp = userInput.nextLine();
        masyarakat.Masyarakat(nama, alamat, telp);
    }

    static void askGeneratebarang(){
        //ask for generate
        System.out.print("Generate Barang ? (y/n) : ");
        user_input = userInput.nextLine();

        if (UserAnswerIsYes(user_input)){
            generatebarang();
            System.out.println("Barang Lelang generated");
        }else{
            System.out.println("oke");
        }
    }

    static void askAjukanBarang(){
        //ask if you want to create barang yourself
        System.out.print("Ajukan barang untuk lelang? (y/n) : ");
        user_input = userInput.nextLine();
        if (UserAnswerIsYes(user_input)){
            petugas.doYourJob(barangLelang);
            System.out.println("barang ditambahkan");
        }else{
            System.out.println("oke");
        }
    }

    static void lelangStart() {
        do {

            /*logic here*/
            //our turn
            currentHarga = barangLelang.getHargaTertinggi();
            System.out.println("harga Saat Ini : " + currentHarga);
            System.out.println();//jarak
            System.out.print("Masukkan Harga : ");
            int harga = userInput.nextInt();

            System.out.println();//jarak

            if (harga <= barangLelang.getHargaTertinggi()){
                System.out.println("harga anda terlalu rendah");
            }else {
                barangLelang.addHargaTawar(harga);
                user_harga = harga;
            }
            //System.out.println();//jarak

            currentHarga = barangLelang.getHargaTertinggi();

            //bot turn
            bot_harga = opponent.generateHarga(currentHarga);
            if (bot_harga <= barangLelang.getHargaTertinggi()){
                System.out.println("Bot :  skip dlu");
            }else {
                barangLelang.addHargaTawar(bot_harga);
                System.out.println("Bot : " + bot_harga);
            }
            currentHarga = barangLelang.getHargaTertinggi();
            System.out.println();//jarak
            /*logic here*/

            System.out.print("apakah anda ingin menawar lagi ? (Y/T) : ");
            jawab = ulangi.nextLine();

        } while (UserAnswerIsYes(jawab));
    }

    static void generatebarang() {
        barangLelang.addNamaBarang("Sabun wangy wangy");
        barangLelang.addHargaAwal("10000");
        barangLelang.addHargaTawar(10000);
        barangLelang.setStatus(true);

        barangLelang.addNamaBarang("Artefak");
        barangLelang.addHargaAwal("400000");
        barangLelang.addHargaTawar(400000);
        barangLelang.setStatus(true);

        barangLelang.addNamaBarang("keyboard");
        barangLelang.addHargaAwal("200000");
        barangLelang.addHargaTawar(200000);
        barangLelang.setStatus(true);
    }

    static void pemenang(){
        barangLelang.setStatus(Pilihan, false);
        if (currentHarga == user_harga){
            System.out.println("Pemenang " + barangLelang.getNamaBarang(Pilihan));
            System.out.println("Adalah : " + loginName);
            System.out.println("Dengan harga : " + currentHarga);
        }else {
            System.out.println("Pemenang " + barangLelang.getNamaBarang(Pilihan));
            System.out.println("Adalah : BOT");
            System.out.println("Dengan harga : " + currentHarga);
        }
    }
}