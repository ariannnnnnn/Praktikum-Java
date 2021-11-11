/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lelang;
 
/**
 *
 * @author Arian
 */
//import java.io.PrintStream;
import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;
public class Main{
    /*VAR*/
    static Masyarakat masyarakat = new Masyarakat();
    static Barang barangLelang = new Barang();
    static Petugas petugas = new Petugas("Anonimus", "jalan jalan", "08123425624");

    static Scanner userInput = new Scanner(System.in);
    static Scanner ulangi = new Scanner(System.in);

    static String jawab = "";
    static String user_input = "";
    static int Pilihan;

    static String loginName = "";
    static String loginAddress = "";
    static String loginNumber = "";
    static bot opponent = new bot();
    static int currentHarga;

    static int bot_harga;
    static int user_harga;
    /*VAR*/

    public static void main(String[] args) {
        
        login();
      //askGeneratebarang();
        askAjukanBarang();
        System.out.println("Item List :");
        System.out.println();
        barangLelang.tampilBarang();

        System.out.print("which item would you like to bargain? : ");
        Pilihan = userInput.nextInt();
        if (Pilihan > barangLelang.idBarang.size() || !barangLelang.getStatus(Pilihan)){
                  System.out.println("ERROR occured :::: java programm has stopped!!!");
                  System.out.println("ERROR occured :::: java programm has stopped!!!");
                  System.out.println("ERROR occured :::: java programm has stopped!!!");
                  System.exit(1);
           
                 
        }else{
            System.out.println("Name : " + barangLelang.getNamaBarang(Pilihan));
            System.out.println("Initial price : " + barangLelang.getHargaAwal(Pilihan));
            System.out.println("Status : " + barangLelang.getStatus(Pilihan));
            barangLelang.addPenawar(masyarakat.getIdMasyarakat(masyarakat.getIndexFromName(loginName)));
            barangLelang.overrideHargaTawar();
            barangLelang.addHargaTawar(Integer.parseInt(barangLelang.getHargaAwal(Pilihan)));

            lelangStart();
            pemenang();
        }
    }

    static boolean UserAnswerIsYes(String input){
        return input.equalsIgnoreCase("yes");
    }

    static void login(){
        System.out.println("++ LOGIN --");
        System.out.print("Name\t\t: ");
        String nama = userInput.nextLine();
        loginName = nama;
        System.out.print("Address\t\t: ");
        String alamat = userInput.nextLine();
        loginAddress = alamat;
        System.out.print("Phone number\t: ");
        String telp = userInput.nextLine();
        loginNumber = telp;
        System.out.println();
        masyarakat.Masyarakat(nama, alamat, telp);
        }

  //  static void askGeneratebarang(){
        //ask for generate
      //  System.out.print("Generate Barang ? (Yes / No) : ");
      //  user_input = userInput.nextLine();

       // if (UserAnswerIsYes(user_input)){
          //  generatebarang();
         //   System.out.println("Auction Items generated");
       // }else{
          //  System.out.println("kk");
       // }
    //}

    static void askAjukanBarang(){
        //ask if you want to create barang yourself
        System.out.print("Submit an item for auction? (Yes /  No) : ");
        user_input = userInput.nextLine();
        if (UserAnswerIsYes(user_input)){
            generatebarang();
            petugas.doYourJob(barangLelang);
            System.out.println("Item Added");
           System.out.println("Auction Items generated");
        }else{
           generatebarang();
           //System.out.println("kk");
        }
    }

    static void lelangStart() {
        do {

            //human
            currentHarga = barangLelang.getHargaTertinggi();
            System.out.println("Current price : " + currentHarga);
            System.out.println();//jarak
            System.out.print("Input price : ");
            int harga = userInput.nextInt();
            //System.out.println();
            if (harga <= barangLelang.getHargaTertinggi()){
                System.out.println("Input bigger number");
            }else {
                barangLelang.addHargaTawar(harga);
                user_harga = harga;
            }
            System.out.println();

            currentHarga = barangLelang.getHargaTertinggi();

            //bot
            bot_harga = opponent.generateHarga(currentHarga);
            if (bot_harga <= barangLelang.getHargaTertinggi()){
                System.out.println("Bot :  Skip!!");
                
            }else {
                barangLelang.addHargaTawar(bot_harga);
                System.out.println("Bot : " + bot_harga);
            }
            currentHarga = barangLelang.getHargaTertinggi();
            System.out.println();//jarak
            /*logic here*/

            System.out.print("Do you want to bid again? (Yes / No) : ");
            jawab = ulangi.nextLine();

        }while (UserAnswerIsYes(jawab));
    }

    static void generatebarang() {
        barangLelang.addNamaBarang("Ring");
        barangLelang.addHargaAwal("100000");
        barangLelang.addHargaTawar(100000);
        barangLelang.setStatus(true);

        barangLelang.addNamaBarang("Flowers");
        barangLelang.addHargaAwal("20000");
        barangLelang.addHargaTawar(20000);
        barangLelang.setStatus(true);

    }

    static void pemenang(){
        barangLelang.setStatus(Pilihan, false);
        if (currentHarga == user_harga){
            System.out.println();
            System.out.print("Winner " + barangLelang.getNamaBarang(Pilihan));
            System.out.print(" is " + loginName + " For : " + currentHarga);
            System.out.println();
            System.out.println("Name\t\t= "+loginName);
            System.out.println("Address\t\t= "+loginAddress);
            System.out.println("Phone Number\t= "+loginNumber);
            
        }else {
            System.out.print("Winner " + barangLelang.getNamaBarang(Pilihan));
            System.out.print(" is BOT");
            System.out.println();
        }
    }
}